package assignmentAllSeleniumAdvanced;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RegisterPage {
    @FindBy (how=How.CLASS_NAME , using="ico-register")
    public WebElement Register; 
    @FindBy (how=How.ID , using="gender-male")
    public WebElement gender;

    @FindBy (how=How.ID , using="FirstName")
    public WebElement FirstName;

    @FindBy (how=How.ID , using="LastName")
    public WebElement LastName;

    @FindBy (how=How.ID , using="Email")
    public WebElement Email;

    @FindBy (how=How.ID , using="Password")
    public WebElement Password;

    @FindBy (how=How.ID , using="ConfirmPassword")
    public WebElement ConfirmPassword;

    @FindBy (how=How.ID , using="register-button")
    public WebElement registerbutton;
}