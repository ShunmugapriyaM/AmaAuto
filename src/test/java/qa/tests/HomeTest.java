package qa.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import qa.base.BaseTest;
import qa.pages.HomePage;

public class HomeTest extends BaseTest{
	
	HomePage homePage = new HomePage();
	
	@Test
	public void tc01_VerifyAmazonLogo() {
		Assert.assertTrue(homePage.getAmazonLogo().isDisplayed(), "AmazonLogo is not displayed in the header");
		Assert.assertTrue(homePage.getAmazonLogoFooter().isDisplayed(), "AmazonLogo is not displayed in the footer");
	}

}
