package day01_Calisma1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_X_Path {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //1- https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.get(" https://the-internet.herokuapp.com/add_remove_elements/ ");
        //2- Add Element butonuna basin
        //driver.findElement(By.xpath("//button[@onclick='addElement()']")).click();

        //driver.findElement(By.xpath("//button[text()='Add

        driver.findElement(By.xpath("//button[@onclick='addElement()']")).click();
        //3- Delete butonu’nun gorunur oldugunu test edin
        WebElement deleteButonu= driver.findElement(By.xpath("//button[@class='added-manually']"));

        if(deleteButonu.isDisplayed()){
            System.out.println("Delete butonu testi PASSED");
        }else{
            System.out.println("Delete butonu testi FAİLED");
        }

        //4- Delete tusuna basin
        deleteButonu.click();
        Thread.sleep(3000);


        //5- “Add/Remove Elements” yazisinin gorunur oldugunu test edin
        WebElement addRemoveElements=driver.findElement(By.xpath("//h3"));

        if(addRemoveElements.isDisplayed()){
            System.out.println("add Remove Elements testi PASSED");
        }else{
            System.out.println("add Remove Elements testi FAİLED");
        }
        Thread.sleep(3000);
        driver.close();
        }


    }



