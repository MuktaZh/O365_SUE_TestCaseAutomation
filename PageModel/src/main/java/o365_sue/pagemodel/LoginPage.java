package o365_sue.pagemodel;

import o365_sue.core.ConfigBuilder;
import o365_sue.core.Constants;

import org.openqa.selenium.WebElement;

public class LoginPage extends PageModel {

	//ConfigBuilder builder = new ConfigBuilder();
	public String LoginPageUrl() {
		return Constants.LoginPageUrl;
	}

	public WebElement UserNameTextBox() {
		return super.GetElementById(ConfigBuilder.Driver,
				"cred_userid_inputtext");
	}

	public WebElement PasswordsTextBox() {
		return super.GetElementById(ConfigBuilder.Driver,
				"cred_password_inputtext");
	}

	public WebElement SignInButton() {
		return super
				.GetElementByXpath(ConfigBuilder.Driver, "//span[@tabindex='11']");
	    
	}

	public WebElement KeepMeSignedInCheckBox() {
		return super.GetElementById(ConfigBuilder.Driver,
				"cred_keep_me_signed_in_checkbox");
	}

	public WebElement CantNotAccessYourAccountHyperLink() {
		return super.GetElementById(ConfigBuilder.Driver,
				"cred_forgot_password_link");
	}

	public WebElement InvalidEmailDiv() {
		return super.GetElementByXpath(ConfigBuilder.Driver,
				"//div[@class='client_error_msg 30064']");
	}

}
