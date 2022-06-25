package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CloudTablesPage {

    public CloudTablesPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//button[@class='dt-button buttons-create']")
    public WebElement newButton;

    @FindBy(id = "DTE_Field_first_name")
    public WebElement firstNameBox;

    @FindBy(id = "DTE_Field_last_name")
    public WebElement lastNameBox;

    @FindBy(id = "DTE_Field_position")
    public WebElement positionBox;

    @FindBy(id = "DTE_Field_salary")
    public WebElement salaryBox;

    @FindBy(xpath = "//button[@class='btn']")
    public WebElement createButton;

    @FindBy(xpath = "//input[@type='search']")
    public WebElement searchBox;

    @FindBy(xpath = "//table[@id='example']/tbody/tr[1]/td[2]")
    public WebElement tableFirstRawName;

    @FindBy(xpath = "//button[@class='dt-button buttons-selected buttons-remove']")
    public WebElement deleteButton;

    @FindBy(xpath = "//div[@data-dte-e='form_buttons']/button")
    public WebElement deleteVerificationButton;

    @FindBy(xpath = "//td[.='No matching records found']")
    public WebElement errorMessage;


}
