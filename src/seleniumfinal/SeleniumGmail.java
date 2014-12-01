
package seleniumfinal;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
/**
 *
 * @author Diogo Odelli
 */
public class SeleniumGmail {
    /**
     * @param args the command line arguments
     * @throws java.lang.InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.gmail.com/");

        WebElement campoDeTexto = driver.findElement(By.id("Email"));
        campoDeTexto.sendKeys("diogoaulatopicos@gmail.com");
        
        WebElement campoDeTexto2 = driver.findElement(By.id("Passwd"));
        campoDeTexto2.sendKeys("testedetopicos");
         
        driver.findElement(By.name("signIn")).click();    
        
        Thread.sleep(40000);
        driver.findElement(By.cssSelector("div[class='T-I J-J5-Ji T-I-KE L3']")).click();
        
        Thread.sleep(10000);
        
        driver.findElement(By.cssSelector("textarea[class='vO']")).sendKeys("diogodelli@gmail.com");
        driver.findElement(By.cssSelector("input[class='aoT']")).sendKeys("Deu Boa!");
        driver.findElement(By.cssSelector("div[class='Am Al editable LW-avf']")).sendKeys("Isso é um teste!");
        driver.findElement(By.cssSelector("div[class='T-I J-J5-Ji aoO T-I-atl L3']")).click();
    }
}
