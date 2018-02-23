package gavus.addressbook.app_manager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;

/**
 * Created by Aleksander on 18.08.2016.
 */
public class BaseHelper {

    public WebDriver driver;

    public BaseHelper(WebDriver driver) {
        this.driver = driver;
    }

    public void click(By locator) {
        driver.findElement(locator).click();
    }

    public void enter(By locator, String text) {
        if (isNotNullValue(text)) {
            driver.findElement(locator).clear();
            driver.findElement(locator).sendKeys(text);
        }
    }

    private boolean isNotNullValue(String text) {
        return !"#NULL".equals(text);
    }

    public boolean isAlertPresent() {
        try {
            driver.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }
}
