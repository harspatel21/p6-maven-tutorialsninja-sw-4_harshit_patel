package com.tutorialsninja.testsuite;
// **** Created By Harshit Patel ****

import com.tutorialsninja.pages.MyAccounts;
import com.tutorialsninja.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyAccountsTest extends BaseTest {
    MyAccounts myAccounts = new MyAccounts();

    @Test
    public void verifyUserShouldNavigateToRegisterPageSuccessfully() {

        //1.1 Clickr on My Account Link.
        myAccounts.clickOnMyAccounts();

        //1.2 Call the method “selectMyAccountOptions” method and pass the parameter “Register”
        myAccounts.selectMyAccountOptions("Register");

        //1.3 Verify the text “Register Account”
        Assert.assertEquals(myAccounts.getRegisterText(), "Register Account", "Not Matching");

    }

    @Test
    public void verifyUserShouldNavigateToLoginPageSuccessfully() {
        myAccounts.clickOnMyAccounts();
        myAccounts.selectMyAccountOptions("Login");
        Assert.assertEquals(myAccounts.getReturningCustomerText(), "Returning Customer", "Not Matching");

    }

    @Test
    public void verifyThatUserRegisterAccountSuccessfully() {
        //3.1 Clickr on My Account Link.
        myAccounts.clickOnMyAccounts();

        //3.2 Call the method “selectMyAccountOptions” method and pass the parameter “Register”
        myAccounts.selectMyAccountOptions("Register");

        //3.3 Enter First Name
        //3.4 Enter Last Name
        //3.5 Enter Email
        //3.6 Enter Telephone
        //3.7 Enter Password
        //3.8 Enter Password Confirm
        myAccounts.fieldRegisterAccountDetails();

        //3.9 Select Subscribe Yes radio button
        myAccounts.clickOnRadioButton();

        //3.10 Click on Privacy Policy check box
        myAccounts.clickOnAgree();

        //3.11 Click on Continue button
        myAccounts.clickOnContinue();

        //3.12 Verify the message “Your Account Has Been Created!”
        Assert.assertEquals(myAccounts.getAccountText(), "Your Account Has Been Created!", "Not Matching");

        //3.13 Click on Continue button
        myAccounts.clickOnCont();

        //3.14 Click on My Account Link.
        myAccounts.clickOnMyAccounts();

        //3.15 Call the method “selectMyAccountOptions” method and pass the parameter “Logout”
        myAccounts.selectMyAccountOptions("Logout");

        //3.16 Verify the text “Account Logout”
        Assert.assertEquals(myAccounts.getLogOutText(), "Account Logout", "Not matching");

        //3.17 Click on Continue button
        myAccounts.clickOnCont();
    }

    @Test
    public void verifyThatUserShouldLoginAndLogoutSuccessfully() {
        //4.1 Click on My Account Link.
        myAccounts.clickOnMyAccounts();

        //4.2 Call the method “selectMyAccountOptions” method and pass the parameter “Login”
        myAccounts.selectMyAccountOptions("Login");

        //4.3 Enter Email address
        //4.4 Enter Last Name
        //4.5 Enter Password
        myAccounts.sendEmailPasswordDetails();

        //4.6 Click on Login button
        myAccounts.clickOnSubmit();

        //4.7 Verify text “My Account”
        Assert.assertEquals(myAccounts.getMyAccountText(), "My Account", "Not matching");


        //4.8 Click on My Account Link.
        myAccounts.clickOnMyAccounts();

        //4.9 Call the method “selectMyAccountOptions” method and pass the parameter “Logout”
        myAccounts.selectMyAccountOptions("Logout");

        //4.10 Verify the text “Account Logout”
        Assert.assertEquals(myAccounts.getAccountLogOutText(), "Account Logout", "Not matching");

        //4.11 Click on Continue button
        myAccounts.clickOnLastContinue();

    }
}
