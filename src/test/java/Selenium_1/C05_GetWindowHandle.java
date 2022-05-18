package Selenium_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C05_GetWindowHandle {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        System.out.println(driver.getWindowHandle());
        //CDwindow-091FAAC61BFA48310AAB2ABF0063BA0B
        //CDwindow-A10BE1D3E1BB4958E5700F66D1E71E10
    }
}
