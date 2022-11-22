package models.components.global.footer;

import models.components.Component;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class footerColumnComponent extends Component {
    private static final By headerSel = By.tagName("h3");
    private static final By linkSel = By.tagName("li a");

    public footerColumnComponent(WebDriver driver, WebElement component) {
        super(driver, component);
    }

    public WebElement headerElem() {
        return component.findElement(headerSel);


    }

    public List<WebElement> linkElem() {
        return component.findElements(linkSel);
    }
}
