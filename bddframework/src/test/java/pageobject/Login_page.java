package pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login_page
{
	@FindBy(id="txtuId")
	public static WebElement username;
	
	@FindBy(id="txtPword")
	public static WebElement password;
	
	@FindBy(xpath="//*[@name='login']")
	public static WebElement login;
	
	@FindBy(xpath="(//*[contains(@src,'images')])[5]")
	public static WebElement BranchesBTN;
	
	@FindBy(xpath="//*[@name='BtnNewBR']")
	public static WebElement NewBranch; 
	
    @FindBy(xpath="//*[@name='txtAdd1']")
    public static WebElement Add1;
    
    @FindBy(xpath="//*[@name='Txtadd2']")
    public static WebElement Add2;
    
    @FindBy(xpath="//*[@name='txtadd3']")
    public static WebElement Add3;
    
    @FindBy(xpath="//*[@name='txtArea']")
    public static WebElement BranchArea1;
    
    @FindBy(xpath="//*[@name='txtZip']")
    public static WebElement zipcode;
    
    @FindBy(xpath="//*[@name='lst_counrtyU']")
    public static WebElement Branchcountry;
    
    @FindBy(xpath="//*[@name='lst_stateI']")
    public static WebElement BranchState1;
    
    @FindBy(xpath="//*[@name='lst_cityI']")
    public static WebElement BranchCity1;
    
    @FindBy(xpath="//*[@name='btn_insert']")
    public static WebElement Submit;
    
    @FindBy(xpath="//*[@name='Btn_Reset']")
    public static WebElement Reset;
    
    @FindBy(xpath="//*[@name='Btn_cancel']")
    public static WebElement cancel;
    
    @FindBy(xpath="//*[text()='BranchId']")
    public static WebElement BranchId;
    
    @FindBy(xpath="//*[text()='BranchName']")
    public static WebElement BranchName;
    
    @FindBy(xpath="//*[text()='Address']")
    public static WebElement Address;
    
    @FindBy(xpath="//*[text()='Area']")
    public static WebElement Area;
    
    @FindBy(xpath="(//*[text()='City'])[1]")
    public static WebElement BranchCity;
    
    @FindBy(xpath="(//*[text()='State'])[1]")
    public static WebElement BranchState;
    
    @FindBy(xpath="//*[text()='Edit']")
    public static WebElement Edit;
    
    @FindBy(xpath="//*[text()='Delete']")
    public static WebElement Delete;
    
    
    
    
    
    
    
	

}
