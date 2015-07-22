package o365_sue.testlibrary;
import o365_sue.core.ConfigBuilder;
import o365_sue.core.Constants;
import o365_sue.pagemodel.LoginPage;

public class LoginPageLibrary {
	
	public LoginPage loginPage = new LoginPage();    
	public void Navigate2LoginPage() 
	{
		ConfigBuilder.Driver.get(Constants.LoginPageUrl);
	}

	public boolean IsNavigated2LoginPage() {
		return loginPage.UserNameTextBox() == null ? false : true;
	}

	public void InputUserName(String UserName) {
		loginPage.UserNameTextBox().sendKeys(UserName);
	}

	public void InputPasswords(String Passwords) {
		loginPage.PasswordsTextBox().sendKeys(Passwords);
	}

	public void ClickSignInButton() {
		loginPage.SignInButton().click();
	}

	public boolean IsDisplayedInvalidEmail() {
		return loginPage.InvalidEmailDiv() == null ? false : true;
	}

	public void ClickKeepMeSignedInCheckBox() {
		loginPage.KeepMeSignedInCheckBox().click();
	}

}
