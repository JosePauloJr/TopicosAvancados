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
 * @author Luiz Ricardo
 */
public class SeleniumHotmail {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {

    
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.hotmail.com");
        
       WebElement campoDeTexto = driver.findElement(By.id("i0116"));
        campoDeTexto.sendKeys("topicosavancados@hotmail.com");
        
       
        WebElement campoDeTexto2 = driver.findElement(By.name("passwd"));
        campoDeTexto2.sendKeys("luizcascais123");
        campoDeTexto2.submit();
       
       Thread.sleep(4000);
       driver.findElement(By.xpath("//a[@id='NewMessage']")).click();
    
       Thread.sleep(15000);
       
       driver.findElement(By.id("watermarkedInputControl90f")).sendKeys("Assunto!");
       
       Thread.sleep(10000);
       driver.findElement(By.cssSelector("textarea[class='cp_primaryInput cp_anyInput t_urtc']")).sendKeys("topicosavancados@hotmail.com");
       
       Thread.sleep(10000);
       driver.findElement(By.id("SendMessage")).click();
       
       
       
         }
}

