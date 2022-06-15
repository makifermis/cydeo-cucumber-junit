package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleSearchPage {

    //create contructor
    // initialize the driver instance and this class' instance using PageFactory.initElements
    public GoogleSearchPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    // We can start locating web elements using @FindBy annotation

    @FindBy(id = "W0wltc")
    public WebElement refuseCookiesButton;

    @FindBy(name = "q")
    public WebElement searchBox;


}
