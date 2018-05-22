package br.com.ahgora.Funcionalidade;

import org.openqa.selenium.WebDriver;

import br.com.ahgora.PO.AhgoraPO;

public class AhgoraFunc {
	
	AhgoraPO ahgoraPO = new AhgoraPO();

	public void digitarMatricula(WebDriver driver){
		ahgoraPO.matricula(driver).sendKeys("000344");;
	}
	
	public void digitarSenha(WebDriver driver){
		ahgoraPO.senha(driver).sendKeys("4100");
	}
	
	public void clicarNoEntrar(WebDriver driver){
		ahgoraPO.entrar(driver).click();
	}
}
