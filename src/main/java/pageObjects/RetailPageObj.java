package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilities.WebDriverUtility;

public class RetailPageObj extends Base{
	
	//Once we create Page Obj we need to extends the Base class to use Parent Class
	//properties such is Webdriver driver
	//we create a constructor and inside the contructor we define the PageFactory.initElements
	//method to initialize the WebElements in this page.
	
	public RetailPageObj()
	{
		PageFactory.initElements(driver,  this);
	}
	
	//we need to store UI WebElements in a private WebElement using @FindBy annotations of PageFactory class
	
	@FindBy(xpath="//input[@name='search']")
	private WebElement searchBar;
	
	@FindBy(xpath="//button[@class='btn btn-default btn-lg']")
	private WebElement searchButton;
	
	@FindBy(xpath="//img[@title='iPhone']")
	private WebElement iphoneImage;
	
	
	//WebElements For Register Page
	
	@FindBy(xpath="//a[@href='http://tek-school.com/retail/index.php?route=account/register']")
	private WebElement registerLink;
	
	@FindBy(xpath="//input[@id='input-firstname']")
	private WebElement firstNameInput;
	
	@FindBy(xpath="//input[@id='input-lastname']")
	private WebElement lastNameInput;
	
	@FindBy(xpath="//input[@id='input-email']")
	private WebElement emailInput;
	
	@FindBy(xpath="//input[@id='input-telephone']")
	private WebElement telephoneInput;
	
	@FindBy(xpath="//input[@id='input-password']")
	private WebElement passwordInput;
	
	@FindBy(xpath="//input[@id='input-confirm']")
	private WebElement passwordConfirmInput;
	
	@FindBy(xpath="//input[@value='1'][@name='newsletter']")
	private WebElement yesToNewsletter;
	
	@FindBy(xpath="//input[@value='0'][@name='newsletter']")
	private WebElement noToNewsletter;
	
	@FindBy(xpath="//input[@name='agree']")
	private WebElement agreeToTermsAndConditions;
	
	@FindBy(xpath="//input[@class='btn btn-primary']")
	private WebElement continueRegistrationButton;
	
	@FindBy(xpath="//h1[text()='Your Account Has Been Created!']")
	private WebElement accountHasBeenCreated;
	
	
	// we need to create public methods to perform required actions on each elements we stored
	
	
	public void enterValueToSearchBar(String value)
	{
		WebDriverUtility.enterValue(searchBar,  value);
	}
	
	public void clickOnSearchButton() 
	{
		WebDriverUtility.clickOnElement(searchButton);
	}
	
	public boolean iPhoneImageIsDisplayed() 
	{
		if (iphoneImage.isDisplayed()) 
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
	
	public void clickOnRegister() 
	{
		WebDriverUtility.clickOnElement(registerLink);
	}
	
	public void enterFirstName(String firstName) 
	{
		WebDriverUtility.enterValue(firstNameInput, firstName);
	}
	
	public void enterLastName(String lastName)
	{
		WebDriverUtility.enterValue(lastNameInput, lastName);
	}
	
	public void enterEmail(String email)
	{
		WebDriverUtility.enterValue(emailInput, email);
	}
	
	public void enterTelephone(String telephoneNumber)
	{
		WebDriverUtility.enterValue(telephoneInput, telephoneNumber);
	}
	
	public void enterPassword(String password)
	{
		WebDriverUtility.enterValue(passwordInput, password);
	}
	
	public void confirmPassword(String password)
	{
		WebDriverUtility.enterValue(passwordConfirmInput, password);
	}
	
	public void subscribe(String valueOfSubscribe) 
	{
		if(valueOfSubscribe.equalsIgnoreCase("yes"))
		{
			if(yesToNewsletter.isSelected())
			{
				WebDriverUtility.clickOnElement(yesToNewsletter);
			}	
		}
		else
		{
			WebDriverUtility.clickOnElement(noToNewsletter);
		}
	}
	
	public void checkPrivacyPolicy()
	{
		if(agreeToTermsAndConditions.isDisplayed())
		{
			agreeToTermsAndConditions.click();
		}
	}
	
	public void clickOnContinueButton()
	{
		WebDriverUtility.clickOnElement(continueRegistrationButton);
	}
	
	public boolean registrationOutcome()
	{
		boolean successMessage = accountHasBeenCreated.isDisplayed();
		return successMessage;
	}
	
	
}
