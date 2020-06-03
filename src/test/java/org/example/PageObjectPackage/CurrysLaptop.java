package org.example.PageObjectPackage;

import org.example.BaseClassPackage.DriverFactory;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class CurrysLaptop extends DriverFactory {

    public void HomepageURL() {
        String actualHp = driver.getCurrentUrl();
        Assert.assertThat(actualHp, Matchers.containsString("currys"));
    }

    public void MousehoverComputing() throws InterruptedException {
        Actions action = new Actions(driver);
        WebElement mousehover = driver.findElement(By.xpath("//a[@class='chevron'][contains(text(),'Computing')]"));
        action.moveToElement(mousehover).perform();
        Thread.sleep(5000);
    }

    public void MousehoverLaptop() throws InterruptedException {
        Actions action = new Actions(driver);
        WebElement mousehover1 = driver.findElement(By.xpath("//a[@class='chevron'][contains(text(),'Laptops')]"));
        action.moveToElement(mousehover1).perform();
        Thread.sleep(10000);
    }

    public void MousehoverAllLaptops(){
        Actions action = new Actions(driver);
        WebElement mousehover2 = driver.findElement(By.xpath("//*[@id=\"navigation\"]/div/div[2]/ul/li[3]/ul/li[1]/div[2]/ul/li[1]/a"));
        action.moveToElement(mousehover2).click().perform();
    }

    @FindBy(xpath = "//div[@class='dc-select-input dc-select-valid']")
    WebElement sortBy;

    public void sortByClick(){
        sortBy.click();
        WebElement filter = driver.findElement(By.xpath("//li[contains(text(),'high to low')]"));
        filter.click();
    }

    @FindBy(xpath = "//span[contains(text(),'£3499.00')]")
    WebElement selectProduct;

    public void selectProductClick(){
        selectProduct.click();
    }

}