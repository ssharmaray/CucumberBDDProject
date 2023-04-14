package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CarsGuideHomePageLocators {
	
	
	//CarsGuide HomePage MenuItem Locators
	@FindBy(how = How.LINK_TEXT, using="buy + sell")
	public WebElement buy_and_sell_MenuItem;
	
	@FindBy(how = How.LINK_TEXT, using="reviews")
	public WebElement reviews_MenuItem;
	
	@FindBy(how = How.LINK_TEXT, using="news")
	public WebElement news_MenuItem;

	@FindBy(how = How.LINK_TEXT, using="advice")
	public WebElement advice_MenuItem;
	
	@FindBy(how = How.LINK_TEXT, using="pricing + specs")
	public WebElement pricing_and_specs_MenuItem;
	
	@FindBy(how = How.LINK_TEXT, using="guides")
	public WebElement guides_MenuItem;
	
	//CarsGuide HomePage Sub-MenuItem Locators
	@FindBy(how = How.LINK_TEXT, using="Search Cars")
	public WebElement search_Cars_SubMenuItem;
		
	@FindBy(how = How.XPATH, using="//a[@data-gtm-label='sub nav used cars search']")
	public WebElement used_Cars_SubMenuItem;
	
	@FindBy(how = How.XPATH, using="//a[@data-gtm-label='sub nav new cars search']")
	public WebElement new_Cars_SubMenuItem;
	
	@FindBy(how = How.XPATH, using="//a[contains(text(),'Find a Dealer')]")
	public WebElement find_a_dealer_SubMenuItem;
	
	@FindBy(how = How.XPATH, using="//a[contains(text(),'What car should I buy?')]")
	public WebElement what_should_i_buy_SubMenuItem;
	
	@FindBy(how = How.XPATH, using="//a[@data-gtm-label='sub nav sell my car']")
	public WebElement sell_My_Car_SubMenuItem;
	
	@FindBy(how = How.XPATH, using="//header/div[@id='u_H']//div[1]//li[1]//div[2]/ul[1]/li[2]/a[1]")
	public WebElement manage_My_Ad_SubMenuItem;
	
	@FindBy(how = How.XPATH, using="//a[@data-gtm-label='sub nav car selling tips']")
	public WebElement car_Selling_Tips_SubMenuItem;
	
}
