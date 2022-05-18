package day01_Calisma1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_driverMetodlari {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.amazon.com");
    driver.getTitle();
    System.out.println("actuel tittle :"+driver.getTitle());
    System.out.println("actuel url : "+driver.getCurrentUrl());
    driver.close();;


    }
}
