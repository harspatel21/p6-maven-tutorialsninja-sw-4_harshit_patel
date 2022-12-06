package com.tutorialsninja.testsuite;
// **** Created By Harshit Patel ****

import com.tutorialsninja.pages.HomePage;
import com.tutorialsninja.testbase.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest {

    HomePage homePage = new HomePage();

    @Test

    public void verifyUserShouldNavigateToDesktopsPageSuccessfully() {
        //1.1 Mouse hover on “Desktops” Tab and click
        homePage.mouseHoverToElementAndClick(By.linkText("Desktops"));

        //1.2 call selectMenu method and pass the menu = “Show All Desktops”
        homePage.selectMenu("Show All Desktops");

        //1.3 Verify the text ‘Desktops’
        String expectedMessage = "Desktops";
        Assert.assertEquals(homePage.verifyDesktopText(), expectedMessage, "Not on Desktop Page");
    }

    @Test
    public void verifyUserShouldNavigateToLaptopsAndNotebooksPageSuccessfully() {

        //2.1 Mouse hover on “Laptops & Notebooks” Tab and click
        homePage.mouseHoverToElementAndClick(By.linkText("Laptops & Notebooks"));

        //2.2 call selectMenu method and pass the menu = “Show All Laptops & Notebooks”
        homePage.selectMenu("Show All Laptops & Notebooks");

        //2.3 Verify the text ‘Laptops & Notebooks’
        String expectedMessage = "Laptops & Notebooks";
        Assert.assertEquals(homePage.verifyLaptopAndNotebookText(), expectedMessage, "Not on Laptops & Notebooks Page");
    }

    @Test
    public void verifyUserShouldNavigateToComponentsPageSuccessfully() {

        //3.1 Mouse hover on “Components” Tab and click
        homePage.mouseHoverToElementAndClick(By.linkText("Components"));
        //3.2 call selectMenu method and pass the menu = “Show All Components”
        homePage.selectMenu("Show All Components");

        //3.3 Verify the text ‘Components’ homePage.mouseHoverToElementAndClick(By.linkText("Components"));
        String expectedMessage = "Components";
        Assert.assertEquals(homePage.verifyComponentsText(), expectedMessage, "Not on Components Page");
    }
}

