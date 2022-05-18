package Selenium_1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C01_AmazonSearch {
    public static void main(String[] args) {
        /*
        1. Bir class oluşturun : AmazonSearchTest
        2. Main method oluşturun ve aşağıdaki görevi tamamlayın.
        a.google web sayfasına gidin. https://www. amazon.com/
        b. Search(ara) “city bike”
        c. Amazon'da görüntülenen ilgili sonuçların sayısını yazdırın
        d. Sonra karşınıza çıkan ilk sonucun resmine tıklayın.
     */

        //    1. Bir class oluşturun : AmazonSearchTest
        //2. Main method oluşturun ve aşağıdaki görevi tamamlayın.
        //a.google web sayfasına gidin. https://www. amazon.com/
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.amazon.com");

        //b. Search(ara) “city bike”
        WebElement aramaMotoru=driver.findElement(By.id("twotabsearchtextbox"));
        aramaMotoru.sendKeys("city bike"+ Keys.ENTER);

        //c. Amazon'da görüntülenen ilgili sonuçların sayısını yazdırın
     List<WebElement> istenenElementListesi=driver.findElements(By.className("sg-col-inner"));
    WebElement sonucYazisiElement=istenenElementListesi.get(0);
    System.out.println(sonucYazisiElement.getText());

        /*
        <img class="s-image" src="https://m.media-amazon.com/images/I/714WyPeY5dL._AC_UY218_.jpg"
        srcset="https://m.media-amazon.com/images/I/714WyPeY5dL._AC_UY218_.jpg 1x, https://m.media-amazon.com/images/I/714WyPeY5dL._AC_UY327_FMwebp_
        QL65_.jpg 1.5x, https://m.media-amazon.com/images/I/714WyPeY5dL._AC_UY436_FMwebp_QL65_.jpg 2x
        , https://m.media-amazon.com/images/I/714WyPeY5dL._AC_UY545_FMwebp_QL65_.jpg 2.5x,
         https://m.media-amazon.com/images/I/714WyPeY5dL._AC_UY654_FMwebp_QL65_.jpg 3x" alt="Sponsored Ad - Bike Seat, Extra Comfortable Bikes Saddle
          with The Shockproof Cushion, Accessories Bikes Seats for Padded B..." data-image-index="1" data-image-load="" data-image-latency="s-product-image
          " data-image-source-density="1">
         */

        //e. Sonra karşınıza çıkan ilk sonucun resmine tıklayın.

        List<WebElement> urlResimler=driver.findElements(By.className("s-image"));
        WebElement ilkUrunResim=urlResimler.get(0);
        ilkUrunResim.click();

    }
}
