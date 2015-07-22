package o365_sue.testsuite;

import static org.junit.Assert.*;

import java.sql.Driver;
import java.util.Random;

import o365_sue.core.ConfigBuilder;
import o365_sue.core.Constants;
import o365_sue.testlibrary.LoginPageLibrary;
import o365_sue.core.utils.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.dom4j.*;
public class TestSuite {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {	
	    ConfigBuilder.Driver.manage().window().maximize();			
	}

	@After
	public void tearDown() throws Exception {
		
	}

	@Test
	public void VerifyInvalidEmail() {
		LoginPageLibrary loginPageLib = new LoginPageLibrary();
		loginPageLib.Navigate2LoginPage();
		if (!loginPageLib.IsNavigated2LoginPage()) {
			fail("Fail to navigate to Login Page!");
		}

		if (loginPageLib.IsDisplayedInvalidEmail()) {
			fail("Invalid Email Message should NOT be displayed at this moment!");
		}

		loginPageLib.InputUserName("asd");
		loginPageLib.InputPasswords("123");
		if (!loginPageLib.IsDisplayedInvalidEmail()) {
			fail("Invalid Email Message should be displayed at this moment!");
		}
	}

	@Test
	public void VerifyIsSignedIn() {
		LoginPageLibrary loginPageLib = new LoginPageLibrary();
		loginPageLib.Navigate2LoginPage();
		if (!loginPageLib.IsNavigated2LoginPage()) {
			fail("Fail to navigate to Login Page!");
		}

		loginPageLib.InputUserName("admin@e3009001.onmicrosoft.com");
		loginPageLib.InputPasswords("Password1!");
		loginPageLib.ClickKeepMeSignedInCheckBox();
		loginPageLib.ClickSignInButton();
	}
	
}
