package example;



import com.thoughtworks.gauge.Step;
import driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class StepImplementation {

    @Step("<webSiteUrl> sitesini aç")
    public void openWebsite(String webSiteUrl) {
        Driver.webDriver.get(webSiteUrl);
    }

    @Step("Butona tıkla Xpath: <Xpath>")
    public void pressButton(String Xpath) throws InterruptedException {
        WebElement button = Driver.webDriver.findElement(By.xpath(Xpath));
        button.click();
    }

    @Step("Butona tıkla Css: <css>")
    public void pressButtonWCSS(String css) throws InterruptedException {
        WebElement button = Driver.webDriver.findElement(By.cssSelector(css));
        button.click();
    }

    @Step("Alana yaz XPath: <XPath> Yazı: <str>")
    public void write(String XPath, String str) throws InterruptedException {
        WebElement element = Driver.webDriver.findElement(By.xpath(XPath));
        element.sendKeys(str);
    }

    @Step("Alana yaz Css: <css> Yazı: <str>")
    public void writeWCss(String css, String str) throws InterruptedException {
        WebElement element = Driver.webDriver.findElement(By.cssSelector(css));
        element.sendKeys(str);
    }

    @Step("<sec> saniye bekle")
    public void waitElement(int sec) throws InterruptedException{
        Thread.sleep(sec*1000);
    }
}
