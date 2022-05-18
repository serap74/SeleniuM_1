package day01_Calisma1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
eger testimiz sirasinda birden fazla sayfalar arasinda
hareket edeceksek driver.navigate.to
metodunu kullaniriz ve sonrasinda forward , back, refresh
metodlarini kullanabiliriz.
*/
public class C06_Navigate {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.navigate().to("https://www.amazon.com");
        Thread.sleep(3000);

        driver.navigate().to("https://www.facebook.com");
        Thread.sleep(3000);

        //amazona geri donelim
        driver.navigate().back();
        Thread.sleep(3000);

        //yeniden facebooka gidelim
        driver.navigate().forward();
        Thread.sleep(3000);

        //sayfayi refresh yapalim
        driver.navigate().refresh();

        //sayfayi kapatalim
        driver.close();












    }

}
