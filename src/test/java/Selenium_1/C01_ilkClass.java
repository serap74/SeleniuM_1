package Selenium_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_ilkClass {
    /* En ilkel haliyle bir otomasyon yapmak icin
        Class'imiza otomasyon icin gerekli olan webdriver'in yerini gostermemiz gerekir
        bunun icin Java kutuphanesinden System.setProperty() methodu kullaniriz
        method 2 parametre istemektedir
        ilki kullanacagimiz driver : webdriver.chrome.driver
        ikincisi ise bu driverin fiziki yolu :
      */
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com");
        Thread.sleep(3000);
        driver.get("https://tr-tr.facebook.com/");
        Thread.sleep(3000);
        driver.get("https://www.trendyol.com");
        Thread.sleep(3000);
        driver.get("https://www.webaslan.com/");
        Thread.sleep(3000);
        driver.close();
    }
}


