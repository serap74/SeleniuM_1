package day01_Calisma1;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C07_manageMetodlari {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        System.out.println("Pencere olculeri : "+ driver.manage().window().getSize());
        System.out.println("Pencere konumu:" + driver.manage().window().getPosition());
        Thread.sleep(3000);
        //pencerenin konum ve buyuklugunu degistirelim

        driver.manage().window().setPosition(new Point(13,13));
        driver.manage().window().setSize(new Dimension(900,600));


        System.out.println("Yeni Pencere olculeri : "+ driver.manage().window().getSize());
        System.out.println("Yeni Pencere konumu:" + driver.manage().window().getPosition());
    }
}
