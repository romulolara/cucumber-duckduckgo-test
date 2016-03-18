# language: pt
Funcionalidade: Navegação das paginas do menu
	  
	
	## Contexto: 
	## 		Dado que eu acesso "http://duckduckgo.com"
		
	Cenario: Navegação até a página de Sobre
		Dado acesso a pagina principal do duckduckgo
		Quando eu clico no menu lateral
		# div.header--aside a.header__button--menu
		E clico no link "About" ,
		# ul.nav-menu--main li.nav-menu__item a "About"
		Entao confirmo que estou na pagina de About
		# h2.abt__title