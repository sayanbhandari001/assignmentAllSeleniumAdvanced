package assignmentAllSeleniumAdvanced;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
    @FindBy(how=How.CLASS_NAME, using="ico-login")
    public WebElement loginab;
    @FindBy(how=How.ID, using="Email")
    public WebElement email;
    @FindBy(how=How.ID, using="Password")
    public WebElement password;
    @FindBy(how=How.CSS, using="input[value='Log in']")
    public WebElement loginbutton;
    @FindBy (how=How.CLASS_NAME , using="ico-logout")
    public WebElement Logout;
}