package qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import qa.utils.GenericMethods;

public class HomePage {
	GenericMethods genMtd = new GenericMethods(); 
	
	private By amazonLogo = By.xpath("//*[@id='nav-logo-sprites']");
	private By amazonLogoFooter = By.xpath("//*[@class='nav-logo-base nav-sprite']");
	
	public WebElement getAmazonLogo() {
		return genMtd.getElement(amazonLogo);
	}
	
	public WebElement getAmazonLogoFooter() {
		return genMtd.getElement(amazonLogoFooter);
	}

}
