package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class JUnitClass {
    public static WebDriver driver;


    @Before
    public void setup(){
        WebDriverManager.chromedriver().setup();
        //WebDriverManager.firefoxdriver().setup();
        //WebDriverManager.iedriver().setup();
        driver = new ChromeDriver();
        //driver = new FirefoxDriver();
        //driver = new InternetExplorerDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://www.currys.co.uk/gbuk/index.html");
        driver.manage().window().maximize();
        WebElement cookies = driver.findElement(By.id("onetrust-accept-btn-handler"));
        cookies.click();
    }

    @Test
    public void currysPcWorld() throws InterruptedException {

        Actions action = new Actions(driver);
        WebElement mousehover = driver.findElement(By.xpath("//a[@class='chevron'][contains(text(),'Computing')]"));
        action.moveToElement(mousehover).perform();
        Thread.sleep(5000);

        Actions actionLaptops = new Actions(driver);
        WebElement mousehoverLaptops = driver.findElement(By.xpath("//a[@class='chevron'][contains(text(),'Laptops')]"));
        action.moveToElement(mousehoverLaptops).perform();
        Thread.sleep(5000);

        Actions actionAllLaptops = new Actions(driver);
        WebElement mousehoverAllLaptops = driver.findElement(By.xpath("//*[@id=\"navigation\"]/div/div[2]/ul/li[3]/ul/li[1]/div[2]/ul/li[1]/a"));
        action.moveToElement(mousehoverAllLaptops).click().perform();
        Thread.sleep(5000);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250);");

        WebElement sortByClick = driver.findElement(By.xpath("//div[@class='dc-select-input dc-select-valid']"));
        sortByClick.click();
        Thread.sleep(5000);

        WebElement filter = driver.findElement(By.xpath("//li[contains(text(),'high to low')]"));
        filter.click();
        Thread.sleep(5000);

        JavascriptExecutor js2 = (JavascriptExecutor) driver;
        js2.executeScript("window.scrollBy(0,450);");
        Thread.sleep(5000);

        WebElement laptopClick = driver.findElement(By.xpath("//header[@class='productTitle']//span[contains(text(),'Area 51m 17.3\" Intel® Core')]"));
        laptopClick.click();
        Thread.sleep(5000);
    }

    @After
    public void teardown(){
        //driver.quit();
    }
}
