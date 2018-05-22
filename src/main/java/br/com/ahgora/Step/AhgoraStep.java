package br.com.ahgora.Step;
import org.openqa.selenium.WebDriver;

import br.com.ahgora.Funcionalidade.AhgoraFunc;
import br.com.ahgora.Inicializacao.AbrirBrowser;

public class AhgoraStep {
	
	String siteAhgora = "https://www.ahgora.com.br/externo/index/a142674"; 
	
	public WebDriver driver;
	
	AbrirBrowser abrirBrowser = new AbrirBrowser();
	AhgoraFunc ahgoraFunc = new AhgoraFunc();
	
	public void PesquisarAhgora() {
		driver = abrirBrowser.abrirNavegador(siteAhgora);
		ahgoraFunc.digitarMatricula(driver);
		ahgoraFunc.digitarSenha(driver);
		ahgoraFunc.clicarNoEntrar(driver);
	}
}

