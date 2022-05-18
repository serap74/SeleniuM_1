package SeleniumPractise_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q3 {
    // ...Exercise3...
    // go to url : https://www.techlistic.com/p/selenium-practice-form.html
    //fill the firstname
    //fill the lastname
    //check the gender
    //check the experience
    //fill the date
    //choose your profession -> Automation Tester
    //choose your tool -> Selenium Webdriver
    //choose your continent -> Antartica
    //choose your command  -> Browser Commands
    //click submit button
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe" );
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.techlistic.com/p/selenium-practice-form.html");

        WebElement firstName=driver.findElement(By.xpath("//input[@name='firstname']"));
        firstName.sendKeys("Serap");

        WebElement lastName=driver.findElement(By.xpath("//input[@name='lastname']"));
        lastName.sendKeys("Diraz");

        WebElement gender=driver.findElement(By.xpath("(//input[@name='sex'])[2]"));
        gender.click();

        WebElement experience=driver.findElement(By.id("exp-1"));
        experience.click();

        WebElement date=driver.findElement(By.xpath("//input[@id='datepicker']"));
        date.sendKeys("15.02.2022");

        WebElement profession=driver.findElement(By.xpath("//input[@id='profession-1']"));
        profession.click();

        WebElement tool=driver.findElement(By.xpath("//input[@id='tool-2']"));
        tool.click();

        WebElement contient=driver.findElement(By.xpath("//option[.='Antartica']"));
        contient.click();

        WebElement command=driver.findElement(By.xpath("//option[.='Browser Commands']"));
        command.click();

        driver.findElement(By.xpath("//button[@id='submit']")).click();

        driver.quit();
    }
}
