package utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

    public void selectdropdown(WebElement webElement, String value) {
        Select select = new Select(webElement); // Creando un Objeto de la clase Select donde el parametro es Locator(Elemento Web)
        select.selectByVisibleText(value);
    }

    public void selectDropdownByIndex(WebElement webElement, int index) {
        Select select = new Select(webElement);
        select.selectByIndex(index);
    }

}
