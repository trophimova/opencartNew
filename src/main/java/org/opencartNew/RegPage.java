package org.opencartNew;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class RegPage extends AbstractPage{

    public RegPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = ".//a[@title='Личный кабинет']")
    private WebElement personalAccount;

    @FindBy(xpath = ".//ul[@class='dropdown-menu dropdown-menu-right']//a")
    private WebElement registration;

    @FindBy(xpath = ".//input[@id='input-firstname']")
    private WebElement inputFirstname;

    @FindBy(xpath = ".//input[@id='input-lastname']")
    private WebElement inputLastname;

    @FindBy(xpath = ".//input[@id='input-email']")
    private WebElement inputEmail;

    @FindBy(xpath = ".//input[@id='input-telephone']")
    private WebElement inputTelephone;

    @FindBy(xpath = ".//input[@id='input-password']")
    private WebElement inputPassword;

    @FindBy(xpath = ".//input[@id='input-confirm']")
    private WebElement inputConfirm;

    @FindBy(xpath = ".//input[@type='checkbox']")
    private WebElement checkbox;

    @FindBy(xpath = ".//input[@type='submit']")
    private WebElement submit;

    @FindBy(xpath = ".//div[@id='content']//h1")
    private WebElement title;

    public RegPage clickPersonalAccount() {
        personalAccount.click();
        return this;
    }

    public RegPage clickRegistration() {
        registration.click();
        return this;
    }

    public RegPage clickFirstname() {
        inputFirstname.click();
        return this;
    }


    public RegPage validFirstname() {
        inputFirstname.sendKeys(Data.getRandomFirstname());
        return this;
    }

    public RegPage clickLastname() {
        inputLastname.click();
        return this;
    }

    public RegPage validLastname() {
        inputLastname.sendKeys(Data.getRandomLastname());
        return this;
    }

    public RegPage clickEmail() {
        inputEmail.click();
        return this;
    }

    public RegPage validEmail() {
        inputEmail.sendKeys(Data.getRandomEmail());
        return this;
    }

    public RegPage clickTelephone() {
        inputTelephone.click();
        return this;
    }

    public RegPage validTelephone() {
        inputTelephone.sendKeys(Data.getRandomTelephone());
        return this;
    }

    public RegPage clickPassword() {
        inputPassword.click();
        return this;
    }

    public RegPage validPassword() {
        inputPassword.sendKeys(Data.password);
        return this;
    }

    public RegPage clickConfirm() {
        inputConfirm.click();
        return this;
    }

    public RegPage validConfirm() {
        inputConfirm.sendKeys(Data.password);
        return this;
    }

    public RegPage clickCheckbox() {
        checkbox.click();
        return this;
    }

    public RegPage clickSubmitButton() {
        submit.click();
        return this;
    }

    public RegPage title() {
        getWait().until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//div[@id='content']//h1")));
        return this;
    }

    public String getNameTitle() {
        String nameTitle = title.getText();
        return nameTitle;
    }

}
