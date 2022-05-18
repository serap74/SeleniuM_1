package day01_Calisma1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C03_Locators {
    public static void main(String[] args) {
        /*Main method oluşturun ve aşağıdaki görevi tamamlayın.
                a. http://a.testaddressbook.com adresine gidiniz.
        b. Sign in butonuna basin
        c. email textbox,password textbox, and signin button elementlerini locate ediniz..
        d. Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in)buttonunu tıklayın:
        i. Username : testtechproed@gmail.com
        ii. Password : Test1234!
                e. Expected user id nin testtechproed@gmail.com oldugunu dogrulayin(verify).
                f. “Addresses” ve “Sign Out” textlerinin görüntülendiğini( displayed) doğrulayin(verify).
        3. Sayfada kac tane link oldugunu bulun.
        Collapse
*/
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //Main method oluşturun ve aşağıdaki görevi tamamlayın.
       //a. http://a.testaddressbook.com adresine gidiniz.
        driver.get("http://a.testaddressbook.com");
       //b. Sign in butonuna basin

        WebElement signInLinki=driver.findElement(By.linkText("Sign in"));
        signInLinki.click();

       //c. email textbox,password textbox, and signin button elementlerini locate ediniz..
        WebElement emailTextBox=driver.findElement(By.id("session_email"));
        WebElement passwordTextBox=driver.findElement(By.name("session[password]"));
        WebElement signInButonu= driver.findElement(By.name("commit"));

       //d. Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in)buttonunu tıklayın:
        emailTextBox.sendKeys("testtechproed@gmail.com");
        passwordTextBox.sendKeys("Test1234!");
        signInButonu.click();
       //i. Username : testtechproed@gmail.com
       //ii. Password : Test1234!
       //        e. Expected user id nin testtechproed@gmail.com oldugunu dogrulayin(verify).

        //bir web wlwmwntin uzerinde ne yazdıgını gormek istersek webElementi.get.text()kullaniriz

        WebElement actualKullaniciAdiElementi= driver.findElement(By.className("navbar-text"));
        System.out.println(actualKullaniciAdiElementi.getText());
        String expectedUserMail="testtechproed@gmail.com";
        if(expectedUserMail.equals(actualKullaniciAdiElementi.getText())){
            System.out.println("EXpected kullanici testi PASSED");
        }else{
            System.out.println("EXpected kullanici testi FAİLED");
        }



        //       f. “Addresses” ve “Sign Out” textlerinin görüntülendiğini( displayed) doğrulayin(verify).

        WebElement adressesElemeni=driver.findElement(By.linkText("Addresses"));
        WebElement signoutElementi=driver.findElement(By.linkText("Sign out"));
        if(adressesElemeni.isDisplayed()){
            System.out.println("adresses testi PASSED");
        }else {
            System.out.println("adresses testi FAİLED");
        }
       if(signoutElementi.isDisplayed()){
           System.out.println("signoutElementi PASSED");
       }else{
           System.out.println("signoutElementi FAİLED");
        }
      //3. Sayfada kac tane link oldugunu bulun.
        List<WebElement> linklerListesi=driver.findElements(By.tagName("a"));
        System.out.println("sayfadaki link sayisi " +linklerListesi.size());
        //linkeri yazdiralim
        for (WebElement each:linklerListesi
             ) {
            System.out.println(each.getText());
        }
        
        driver.close();

    }
}
