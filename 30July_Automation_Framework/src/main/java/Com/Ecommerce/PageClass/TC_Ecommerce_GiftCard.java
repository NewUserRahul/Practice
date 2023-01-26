package Com.Ecommerce.PageClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.Ecommerce.BaseClass.Ecommerce_BaseClass;

public class TC_Ecommerce_GiftCard extends Ecommerce_BaseClass{
    
	//1
	public TC_Ecommerce_GiftCard() {
		PageFactory.initElements(driver, this);
	}
	
	//2
	@FindBy(xpath="(//a[contains(text(),\"Gift Cards \")])[1]")
	WebElement giftcard;
	
	@FindBy(xpath="//strong[contains(text(),\"Customer service\")]")
	WebElement virtualgiftcard;
	
	
	
	//3
	public void GIFTCARD() {
		giftcard.click();
	}
	
	public void VIRTUALGIFTCARD() {
		virtualgiftcard.isDisplayed();
	}
	
	
	
}
