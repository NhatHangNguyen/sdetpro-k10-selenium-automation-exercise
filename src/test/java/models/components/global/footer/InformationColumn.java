package models.components.global.footer;

import models.components.ComponentCssSelector;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

@ComponentCssSelector(".column.information")
public class InformationColumn extends footerColumnComponent {

    public InformationColumn(WebDriver driver, WebElement component) {
        super(driver, component);
    }
}