package qa.utils;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import qa.base.BaseTest;

public class GenericMethods {
	
	public WebElement getElement(By locator) {
		WebElement ele = null;
		try {
			ele = BaseTest.driver.findElement(locator);
			return ele;
		}catch(Exception e) {
			System.out.println("Some error occured while fetching the element"+locator.toString());
			e.printStackTrace();
			return ele;
		}
	}
	
	public List<WebElement> getElements(By locator) {
		try {
		return BaseTest.driver.findElements(locator);
		}catch(Exception e) {
			System.out.println("Some error occured while fetching the element"+locator.toString());
			e.printStackTrace();
			return null;
		}
	}

}
