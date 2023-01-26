package Com.Ecommerce.TestCases;

import org.testng.annotations.Test;

import Com.Ecommerce.BaseClass.Ecommerce_BaseClass;
import Com.Ecommerce.PageClass.TC_Ecommerce_GiftCard;

public class TC_GiftCard extends Ecommerce_BaseClass{
	
	
	@Test
	public void GC() {
		
		TC_Ecommerce_GiftCard gif =new TC_Ecommerce_GiftCard();
		gif.GIFTCARD();
		logger.info("click on giftcard");
		gif.VIRTUALGIFTCARD();
		logger.info("get text");
		
		
	}

}
