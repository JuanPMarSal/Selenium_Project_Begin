package pages;

import com.github.dockerjava.api.model.Link;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Waits;

public class Home {

    Waits waits;

    public Home(WebDriver driver) {   //Este es mi constructor b- Sirve de Preescaneo de la Página
        waits = new Waits(driver);
        PageFactory.initElements(driver,this);
    }

    @FindBy(linkText = "Login")
    WebElement loginTab;

    public void clickOnLoginTab(){
        waits.fluentWaitClick(loginTab,60);
    }


}
