package br.gov.dataprev.duckduckgo.testes.pesquisa;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import com.gargoylesoftware.htmlunit.BrowserVersion;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class PesquisaTeste {
	
	protected HtmlUnitDriver driver;
	
	@Before
	public void setUp() {
		
		driver = new HtmlUnitDriver(BrowserVersion.FIREFOX_38, true);
		driver.setProxy("127.0.0.1", 5865);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//driver.manage().window().maximize();
	}
	
	 @After
     public void tearDown() {
           driver.close();
     }

	@Dado("^acesso a pagina principal do duckduckgo$")
	public void acesso_a_home_do_duckduckgo() throws Throwable {
		 driver.get("http://duckduckgo.com");
	}

	@Quando("^informo o termo \"([^\"]*)\" na caixa de busca$")
	public void eu_escrevo_o_termo(String arg1) throws Throwable {
		driver
			.findElement(By.cssSelector("input#search_form_input_homepage"))
			.sendKeys(new String(arg1)
		);
	}

	@E("^clico no botao de pesquisar$")
	public void clico_no_botao_de_pesquisar() throws Throwable {
		driver.findElement(By.cssSelector("#search_button_homepage")).click();
	}

	@Entao("^o termo \"([^\"]*)\" deve aparecer no primeiro resultado da busca$")
	public void o_termo_aparece_no_primeiro_resultado(String arg1) throws Throwable {
		WebElement cell = driver.findElement(By.cssSelector("#r1-0 div h2.result__title"));
		Assert.assertTrue(cell.getText().contains(new String(arg1)));
	}
}
