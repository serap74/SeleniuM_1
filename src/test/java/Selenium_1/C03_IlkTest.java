package Selenium_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_IlkTest {
    public static void main(String[] args) {
         /*  1- https://www.amazon.com url'ine gidin
            2- Basligin Amazon kelimesi icerdigini test edin
            3- Url'in "https://www.amazon.com" a esit oldugunu test edin
            4- sayfayi kapatin
         */

        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // 1- https://www.amazon.com url'ine gidin
        driver.get("https://www.amazon.com");

        //            2- Basligin Amazon kelimesi icerdigini test edin
        String actualTittle = driver.getTitle();
        String arananKelime = "Amazon";
        if (actualTittle.contains(arananKelime)) {
            System.out.println("Tittle testi PASSED");
        } else {
            System.out.println("Tittle " + arananKelime + "yi icermiyor.tittle testi FAİLED");
        }

        //            3- Url'in "https://www.amazon.com" a esit oldugunu test edin
        String actualUrl = driver.getCurrentUrl();
        String expecteUrl = "https://www.amazon.com/";
        if (actualUrl.contains(expecteUrl)) {
            System.out.println("Url testi PASSED");
        } else{
            System.out.println("actual Url:"+actualUrl+" beklenen URL'den farkli, test FAILED");

        }

        //            4- sayfayi kapatin
        driver.close();
    }
}
