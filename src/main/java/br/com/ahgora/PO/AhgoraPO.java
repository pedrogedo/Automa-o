package br.com.ahgora.PO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AhgoraPO {

	public WebElement matricula(WebDriver driver){
		WebElement matricula = driver.findElement(By.xpath(".//form[@id='boxLogin'] /div/input[@id='matricula']"));
		return matricula;
	}
	
	public WebElement senha(WebDriver driver){
		WebElement senha = driver.findElement(By.xpath(".//input[@id='senha']"));
		return senha;
	}
	
	public WebElement entrar(WebDriver driver){
		WebElement entrar = driver.findElement(By.xpath(".//button[contains(text(),'Entrar')]"));
		return entrar;
	}
}
