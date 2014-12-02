/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seleniumfinal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
/**
 *
 * @author José Paulo Jr
 */
public class SeleniumFinal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.facebook.com.br/");

        WebElement campoDeTexto = driver.findElement(By.id("email"));
        campoDeTexto.sendKeys("topicosavancados@gmail.com");
        
        WebElement campoDeTexto2 = driver.findElement(By.id("pass"));
        campoDeTexto2.sendKeys("topicosavancados");
         
        driver.findElement(By.id("u_0_l")).click();    
        
        Thread.sleep(10000);
        
        //Publica no face após 10000 milesegundos
        WebElement campoTexto4 = driver.findElement(By.id("u_0_w"));
        campoTexto4.sendKeys("Teste de publicação facebook;");
        campoTexto4.submit();
        
    }
    
}
