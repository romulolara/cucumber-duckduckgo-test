# language: pt
@done
Funcionalidade: Pesquisa simples no DuckDuckGo
	Fazer pesquisas simples. Com isso, visualizar e acesso a resultados de buscas na internet  
	
	## Contexto: 
	## 		Dado que eu acesso "http://duckduckgo.com"
		
	Cenario: Pesquisa simples
		Dado acesso a pagina principal do duckduckgo
		Quando informo o termo "selenium" na caixa de busca
		E clico no botao de pesquisar
		Entao o termo "Selenium" deve aparecer no primeiro resultado da busca