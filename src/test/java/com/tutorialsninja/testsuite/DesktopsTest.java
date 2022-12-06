package com.tutorialsninja.testsuite;
// **** Created By Harshit Patel ****

import com.tutorialsninja.pages.Desktops;
import com.tutorialsninja.testbase.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class DesktopsTest extends BaseTest {

    Desktops desktops = new Desktops();

    @Test
    public void verifyProductArrangeInAlphaBaticalOrder() {
        //1.1 Mouse hover on Desktops Tab.and click
        //1.2 Click on “Show All Desktops”
        desktops.getMouseHoverDesktop();

        //1.3 Select Sort By position "Name: Z to A"
        //1.4 Verify the Product will arrange in Descending order.
        desktops.alphabeticalOrder();
    }

    @Test
    public void verifyProductAddedToShoppingCartSuccessFully() {
        //2.1 Mouse hover on Desktops Tab. and click
        //2.2 Click on “Show All Desktops”
        desktops.getMouseHoverDesktop();

//2.3 Select Sort By position "Name: A to Z"
        //2.4 Select product “HP LP3065”
        desktops.aToZAlphabeticalOrder();

        //2.5 Verify the Text "HP LP3065"
        assertAssert("HP LP3065 Not Matched ", desktops.exptectedTextMessage("HP LP3065"), desktops.actualTextToVerify(By.xpath("//h1[contains(text(),'HP LP3065')]")));

        //2.6 Select Delivery Date "2022-11-30"
        desktops.deliveryDate();

        //2.7.Enter Qty "1” using Select class.
        //2.8 Click on “Add to Cart” button
        desktops.clickOnAddToCart();

        //2.9 Verify the Message “Success: You have added HP LP3065 to your shopping cart!”
        assertAssert("Not added to Cart", desktops.exptectedTextMessage("Success: You have added HP LP3065 to your shopping cart!"), desktops.actualTextToVerify(By.xpath("//div[@class = 'alert alert-success alert-dismissible']")).substring(0, 56));

        //2.10 Click on link “shopping cart” display into success message
        desktops.clickOnShoppingCart();

        //2.11 Verify the text "Shopping Cart"
        assertAssert("Not on Shopping Cart ", desktops.exptectedTextMessage("Shopping Cart"), desktops.actualTextToVerify(By.xpath("//div[@id='content']//h1")).substring(0, 13));

        //2.12 Verify the Product name "HP LP3065
        assertAssert("HP LP3065 Not found ", desktops.exptectedTextMessage("HP LP3065"), desktops.actualTextToVerify(By.xpath("//div[@class = 'table-responsive']/table/tbody/tr/td[2]/a")));

        //2.13 Verify the Delivery Date "2022-11-30"
        assertAssert("Invalid Date ", desktops.exptectedTextMessage("2022-11-30"), desktops.actualTextToVerify(By.xpath("(//small[contains(text(), '2022-11-30')])[2]")).substring(15, 25));

        //2.14 Verify the Model "Product21"
        assertAssert("Product 21 Not found", desktops.exptectedTextMessage("Product 21"), desktops.actualTextToVerify(By.xpath("//div[@class = 'table-responsive']/table/tbody/tr/td[3]")));

        //Convert Currency in to £
        desktops.currencyConverter();

        //2.15 Verify the Todat "£74.73"
        assertAssert("Price is incorrect", desktops.exptectedTextMessage("£74.73"), desktops.actualTextToVerify(By.xpath("//div[@class = 'table-responsive']/table/tbody/tr/td[6]")));

    }
}
