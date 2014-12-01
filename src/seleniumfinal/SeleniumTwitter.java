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
 * @author Diogo Odelli
 */
public class SeleniumTwitter {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.twitter.com/");

        //Thread.sleep(10000);

        WebElement campoDeTexto = driver.findElement(By.id("signin-email"));
        campoDeTexto.sendKeys("stelio@kedsystem.com.br");

        WebElement campoDeTexto2 = driver.findElement(By.id("signin-password"));
        campoDeTexto2.sendKeys("karo1egab1");
        campoDeTexto2.submit();

        Thread.sleep(5000);
        WebElement campoDeTexto3 = driver.findElement(By.id("tweet-box-mini-home-profile"));
        campoDeTexto3.sendKeys("Olá Galera! Este é um teste do Selenium!");
        Thread.sleep(10000);
        driver.findElement(By.cssSelector("div[class='tweet-button']")).click();


        

        //driver.findElement(By.cssSelector("div[class='btn primary-btn tweet-action tweet-btn js-tweet-btn']")).click();
        //class="btn primary-btn tweet-action tweet-btn js-tweet-btn"

    }
}
