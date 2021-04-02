package pageObjects;

import java.util.HashMap;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import core.Base;
import utilities.WebDriverUtility;



public class CapstoneProjectPageObj extends Base {

	HashMap<String, WebElement> webElementMap = new HashMap<String,WebElement>();;
	public CapstoneProjectPageObj()
	{
		PageFactory.initElements(driver,  this);
		addAllWebElements();
	}
	
	@FindBy(xpath = "//a[@class='dropdown-toggle'][@href='http://tek-school.com/retail/index.php?route=product/category&path=20']")
	private WebElement desktopsTab;
	
	
	@FindBy(xpath = "//a[@href='http://tek-school.com/retail/index.php?route=product/category&path=20'][@class='see-all']")
	private WebElement showAllDesktops;
	
	@FindBy(xpath = "//h4//a[@href='http://tek-school.com/retail/index.php?route=product/product&path=20_27&product_id=41']")
	private WebElement iMac;
	
	@FindBy(xpath = "//button[@onclick=\"cart.add('47', '1');\"]" )
	private WebElement addToCartHPLP3065;
	
	@FindBy(xpath = "//input[@name='quantity']")
	private WebElement quantity;
	
	@FindBy(xpath = "//button[@id='button-cart']")
	private WebElement addToCart;
	
	@FindBy(xpath = "//div[@class=\"alert alert-success alert-dismissible\"]")
	private WebElement successfullyAddedToCartMessage;
	
	@FindBy(xpath = "//h4//a[@href='http://tek-school.com/retail/index.php?route=product/product&path=20&product_id=30']")
	private WebElement canonEOS5D;
	
	@FindBy(xpath = "//button[@onclick=\"cart.add('30', '1');\"]")
	private WebElement addToCartCanonEOS5D;
	
	@FindBy(xpath = "//select[@id='input-option226']")
	private WebElement dropDown;
	
	@FindBy(xpath = "//a[text() = \"Write a review\"]")
	private WebElement writeAReview;
	
	@FindBy(xpath = "//input[@name='name']")
	private WebElement inputName;
	
	@FindBy(xpath = "//textarea[@name='text']")
	private WebElement inputReview;
	
	@FindBy(xpath = "//input[@value='1'][@name='rating']")
	private WebElement inputRatingBad;
	
	@FindBy(xpath = "//input[@value='5'][@name='rating']")
	private WebElement inputRatingGood;
	
	@FindBy(xpath = "//button[@id='button-review']")
	private WebElement continueButton;
	
	@FindBy(xpath = "//div[@class=\"alert alert-success alert-dismissible\"]")
	private WebElement thankYouForYourReviewMessage;
	
	@FindBy(xpath = "//a[@class='dropdown-toggle'][text() = 'Laptops & Notebooks']")
	private WebElement laptopAndNoteBookTab;
	
	@FindBy(xpath = "//a[@href='http://tek-school.com/retail/index.php?route=product/category&path=18'][text() = 'Show All Laptops & Notebooks']")
	private WebElement showAllLaptopsNotebooks;
	
	@FindBy(xpath = "//img[@alt=\"MacBook\"]")
	private WebElement macBookItem;
	
	@FindBy(xpath = "//span[text() = ' 1 item(s) - $602.00']")
	private WebElement cartTotal;
	
	@FindBy(xpath = "//button[@class='btn btn-inverse btn-block btn-lg dropdown-toggle']")
	private WebElement cart;
	
	@FindBy(xpath = "//button[@title='Remove']")
	private WebElement removeFromCart;
	
	@FindBy(xpath = "//button[@onclick=\"compare.add('43');\"]")
	private WebElement compareMacBook;
	
	@FindBy(xpath = "//button[@onclick=\"compare.add('44');\"]")
	private WebElement compareMacBookAir;
	
	@FindBy(xpath = "//div[@class=\"alert alert-success alert-dismissible\"]")
	private WebElement successfullyAddedToProductComparisonMessage;
	
	@FindBy(xpath = "//a[text() = 'product comparison']")
	private WebElement productComparison;
	
	@FindBy(xpath = "//h1[text() = 'Product Comparison']")
	private WebElement productComparisonChart;
	
	@FindBy(xpath = "//button[@onclick=\"wishlist.add('46');\"]")
	private WebElement addSonyVaIOToWishList;
	
	@FindBy(xpath = "//div[@class=\"alert alert-success alert-dismissible\"]")
	private WebElement mustLogInToAddToWishList;
	
	@FindBy(xpath ="//img[@title='MacBook Pro']")
	private WebElement macBookPro;
	
	@FindBy(xpath ="//h2[text() = '$2,000.00']")
	private WebElement macBookProPrice;
	
	@FindBy(xpath = "//a[@title='My Account']")
	private WebElement myAccount;
	
	@FindBy(xpath = "//li//a[@href='http://tek-school.com/retail/index.php?route=account/login']")
	private WebElement login;
	
	@FindBy(xpath = "//input[@name='email']")
	private WebElement emailInput;
	
	@FindBy(xpath = "//input[@name='password']")
	private WebElement passwordInput;
	
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement loginButton;
	
	@FindBy(xpath = "//h2[text()='My Account']")
	private WebElement LoggedIn;
	
	@FindBy(xpath = "//a[text()='Register for an affiliate account']")
	private WebElement registerForAnAffiliateAccount;
	
	@FindBy(xpath = "//input[@name='agree']")
	private WebElement aboutUs;
	
	@FindBy(xpath = "//input[@id='input-company']")
	private WebElement companyInput;
	
	@FindBy(xpath = "//input[@id='input-website']")
	private WebElement websiteInput;
	
	@FindBy(xpath = "//input[@id='input-tax']")
	private WebElement taxInput;
	
	@FindBy(xpath = "//input[@id='input-cheque']")
	private WebElement chequeInput;
	
	@FindBy(xpath = "//input[@value='Continue']")
	private WebElement continueAffiliate;
	
	@FindBy(xpath = "//div[@class=\"alert alert-success alert-dismissible\"]")
	private WebElement successfullyMadeAffiliate;
	
	@FindBy(xpath = "//a[text() ='Edit your affiliate information']")
	private WebElement editYourAffiliateInformation;
	
	@FindBy(xpath = "//input[@value='bank']")
	private WebElement bankTransfer;
	
	@FindBy(xpath = "//input[@name='bank_name']")
	private WebElement bankName;
	
	@FindBy(xpath = "//input[@name='bank_branch_number']")
	private WebElement bankBranchNumber;
	
	@FindBy(xpath = "//input[@name='bank_swift_code']")
	private WebElement bankSwiftCode;
	
	@FindBy(xpath = "//input[@name='bank_account_name']")
	private WebElement bankAccountName;
	
	@FindBy(xpath = "//input[@name='bank_account_number']")
	private WebElement bankAccountNumber;
	
	@FindBy(xpath = "//input[@value='cheque']")
	private WebElement cheque;
	
	@FindBy(xpath = "//a[text()='Edit your account information']")
	private WebElement editYourAccountInformation;
	
	@FindBy(xpath = "//input[@name='firstname']")
	private WebElement firstNameInput;
	
	@FindBy(xpath = "//input[@name='lastname']")
	private WebElement lastNameInput;
	
	@FindBy(xpath = "//input[@name='email']")
	private WebElement emailAccountInput;
	
	@FindBy(xpath = "//input[@name='telephone']")
	private WebElement telephoneInput;
	
	@FindBy(xpath = "//div[@class=\"alert alert-success alert-dismissible\"]")
	private WebElement successfullyChangedAccountInfo;
	
	public void clickOnWebElement(String value)
	{
		WebDriverUtility.clickOnElement(webElementMap.get(value));
	}
	
	public boolean checkForWebElementDisplayed(String value)
	{
		if(webElementMap.get(value).isDisplayed())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean checkInputForValue(String input, String value)
	{
		if(webElementMap.get(input).getAttribute("value").equals(value))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean checkDropDownValue(String input, String value)
	{
		Select select = new Select(webElementMap.get(input));
		select.selectByVisibleText(value);
		if(select.getFirstSelectedOption().getAttribute("text").equals(value))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public void insertReviewValues(String name, String review, String rating)
	{
		inputName.sendKeys(name);
		inputReview.sendKeys(review);
		if (rating.equals("bad"))
		{
			inputRatingBad.click();			
		}
		else
		{
			inputRatingGood.click();
		}
	}
	
	public boolean checkInputForText(String input, String value)
	{
		if(webElementMap.get(input).getAttribute("innerText").equals(value))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public void inputUsernameAndPassworld(String email, String password)
	{
		emailInput.sendKeys(email);
		passwordInput.sendKeys(password);
	}
	
	public void insertAffiliateFormValues(String company, String website, String taxID, String cheque)
	{
		companyInput.clear();
		companyInput.sendKeys(company);
		websiteInput.clear();
		websiteInput.sendKeys(website);
		taxInput.clear();
		taxInput.sendKeys(taxID);
		chequeInput.clear();
		chequeInput.sendKeys(cheque);
	}
	
	public void insertBankInformation(String name, String branch, String swift, String account, String number)
	{
		bankName.clear();
		bankName.sendKeys(name);
		bankBranchNumber.clear();
		bankBranchNumber.sendKeys(branch);
		bankSwiftCode.clear();
		bankSwiftCode.sendKeys(swift);
		bankAccountName.clear();
		bankAccountName.sendKeys(account);
		bankAccountNumber.clear();
		bankAccountNumber.sendKeys(number);
	}
	
	public void insertAccountInformation(String firstname, String lastname, String email, String telephone)
	{
		firstNameInput.clear();
		firstNameInput.sendKeys(firstname);
		lastNameInput.clear();
		lastNameInput.sendKeys(lastname);
		emailAccountInput.clear();
		emailAccountInput.sendKeys(email);
		telephoneInput.clear();
		telephoneInput.sendKeys(telephone);
	}
	
	
	
	public void addAllWebElements()
	{
		webElementMap.put("desktopsTab", desktopsTab);
		webElementMap.put("showAllDesktops", showAllDesktops);
		webElementMap.put("iMac", iMac);
		webElementMap.put("addToCartHPLP3065", addToCartHPLP3065);
		webElementMap.put("quantity", quantity);
		webElementMap.put("addToCart", addToCart);
		webElementMap.put("successfullyAddedToCartMessage", successfullyAddedToCartMessage);
		webElementMap.put("addToCartCanonEOS5D", addToCartCanonEOS5D);
		webElementMap.put("dropDown", dropDown);
		webElementMap.put("canonEOS5D",canonEOS5D);
		webElementMap.put("writeAReview", writeAReview);
		webElementMap.put("continueButton", continueButton);
		webElementMap.put("thankYouForYourReviewMessage", thankYouForYourReviewMessage);
		webElementMap.put("laptopAndNoteBookTab", laptopAndNoteBookTab);
		webElementMap.put("showAllLaptopsNotebooks", showAllLaptopsNotebooks);
		webElementMap.put("macBookItem", macBookItem);
		webElementMap.put("cartTotal", cartTotal);
		webElementMap.put("cart", cart);
		webElementMap.put("removeFromCart", removeFromCart);
		webElementMap.put("compareMacBook", compareMacBook);
		webElementMap.put("compareMacBookAir", compareMacBookAir);
		webElementMap.put("successfullyAddedToProductComparisonMessage", successfullyAddedToProductComparisonMessage);
		webElementMap.put("productComparison", productComparison);
		webElementMap.put("productComparisonChart", productComparisonChart);
		webElementMap.put("addSonyVaIOToWishList", addSonyVaIOToWishList);
		webElementMap.put("mustLogInToAddToWishList", mustLogInToAddToWishList);
		webElementMap.put("macBookPro", macBookPro);
		webElementMap.put("macBookProPrice", macBookProPrice);
		webElementMap.put("myAccount", myAccount);
		webElementMap.put("login", login);
		webElementMap.put("loginButton", loginButton);
		webElementMap.put("LoggedIn", LoggedIn);
		webElementMap.put("registerForAnAffiliateAccount", registerForAnAffiliateAccount);
		webElementMap.put("aboutUs", aboutUs);
		webElementMap.put("companyInput", companyInput);
		webElementMap.put("websiteInput", websiteInput);
		webElementMap.put("taxInput", taxInput);
		webElementMap.put("chequeInput", chequeInput);
		webElementMap.put("successfullyMadeAffiliate", successfullyMadeAffiliate);
		webElementMap.put("continueAffiliate", continueAffiliate);
		webElementMap.put("editYourAffiliateInformation", editYourAffiliateInformation);
		webElementMap.put("bankTransfer", bankTransfer);
		webElementMap.put("aboutUs", aboutUs);
		webElementMap.put("cheque",cheque);
		webElementMap.put("editYourAccountInformation",editYourAccountInformation);
		webElementMap.put("successfullyChangedAccountInfo", successfullyChangedAccountInfo);
	}
}

