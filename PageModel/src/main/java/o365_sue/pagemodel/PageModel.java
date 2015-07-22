package o365_sue.pagemodel;

import o365_sue.core.Constants;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class PageModel {
	public static final long WaitForAppearSeconds = Constants.WaitForAppearSeconds;

	protected WebElement GetElementById(WebDriver Driver, String Id) {
		WebElement element = null;

		try {
			WebDriverWait wait = new WebDriverWait(Driver, WaitForAppearSeconds);
			element = wait.until(ExpectedConditions.elementToBeClickable(By
					.id(Id)));

		} catch (Exception e) {
			System.out
					.println("Element can not be found, Pls check your input Id - "
							+ Id);
			System.out.println(e.getMessage());
		}

		return element;
	}

	protected WebElement GetElementByClassName(WebDriver Driver,
			String ClassName) {
		WebElement element = null;

		try {

			WebDriverWait wait = new WebDriverWait(Driver, WaitForAppearSeconds);
			element = wait.until(ExpectedConditions.elementToBeClickable(By
					.className(ClassName)));

		} catch (Exception e) {
			System.out
					.println("Element can not be found, Pls check your input Class Name - "
							+ ClassName);
			System.out.println(e.getMessage());
		}

		return element;
	}

	protected WebElement GetElementByXpath(WebDriver Driver, String Xpath) {
		WebElement element = null;

		try {
			WebDriverWait wait = new WebDriverWait(Driver, WaitForAppearSeconds);
			element = wait.until(ExpectedConditions.elementToBeClickable(By
					.xpath(Xpath)));
		} catch (Exception e) {
			System.out
					.println("Element can not be found, Pls check your input Xpath - "
							+ Xpath);
			System.out.println(e.getMessage());
		}

		return element;
	}

}
