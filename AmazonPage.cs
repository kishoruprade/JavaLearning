using AutomationFramework;
using OpenQA.Selenium;
using OpenQA.Selenium.Interactions;
using OpenQA.Selenium.Support.UI;
using SeleniumExtras.PageObjects;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TestManagement.PageObjects
{
    class AmazonPage
    {
        public AmazonPage()
        {
            PageFactory.InitElements(PropertyCollection.driver, this);
        }

        [FindsBy(How = How.PartialLinkText, Using = "OnePlus 7 (Red, 8GB RAM, 256GB Storage): Amazon.in")]
        public IWebElement lnkDeviceOnePlus { get; set; }

        [FindsBy(How = How.Id, Using = "add-to-cart-button")]
        public IWebElement btnAddToCart { get; set; }

        [FindsBy(How = How.PartialLinkText, Using = "View Cart")]
        public IWebElement lnkViewCart { get; set; }

        [FindsBy(How = How.Id, Using = "nav-cart")]
        public IWebElement navCart { get; set; }

        [FindsBy(How = How.PartialLinkText, Using = "Hello, Sign in")]
        public IWebElement lnkSignIn { get; set; }

        [FindsBy(How = How.Id, Using = "ap_email")]
        public IWebElement txtMail { get; set; }

        [FindsBy(How = How.Id, Using = "continue")]
        public IWebElement btnContinue { get; set; }

        [FindsBy(How = How.Id, Using = "ap_password")]
        public IWebElement txtPassword { get; set; }

        [FindsBy(How = How.Id, Using = "signInSubmit")]
        public IWebElement btnSignInSubmit { get; set; }

        [FindsBy(How = How.XPath, Using = "*//input[@aria-label= 'Delete OnePlus 7 (Red, 8GB RAM, 256GB Storage)'][@value='Delete']")]
        public IWebElement lnkDelete { get; set; }

        [FindsBy(How = How.CssSelector, Using = "div.sc-list-item-removed-msg.a-padding-medium")]
        public IWebElement lnkBodyText { get; set; }

        [FindsBy(How = How.Id, Using = "twotabsearchtextbox")]
        public IWebElement txtSearchbox { get; set; }

        [FindsBy(How = How.PartialLinkText, Using = "OnePlus 6T (Midnight Black, 8GB RAM, 128GB Storage)")]
        public IWebElement lnkNewProduct { get; set; }

        [FindsBy(How = How.XPath, Using = ".//*[@id='nav-link-accountList']")]
        public IWebElement lnkSignoutHover { get; set; }

        [FindsBy(How = How.PartialLinkText, Using = "Sign Out")]
        public IWebElement lnkSignOut { get; set; }

        public Boolean AddDeviceToCartAndVerify()
        {
            new WebDriverWait(PropertyCollection.driver, TimeSpan.FromSeconds(5)).Until(SeleniumExtras.WaitHelpers.ExpectedConditions.ElementToBeClickable(lnkDeviceOnePlus));
            lnkDeviceOnePlus.Click();
            btnAddToCart.Click();

            PropertyCollection.PublishMessage("Device1 Added to Cart");
            try
            {
                lnkViewCart.Click();
                navCart.Click();
            }
            catch (Exception ex)
            {
                navCart.Click();
            }
            string text = PropertyCollection.driver.FindElement(By.ClassName("sc-list-item-content")).Text;

            if (text.Contains("OnePlus 7"))
            {
                PropertyCollection.PublishMessage("Device1 present in Cart");
                return true;
            }
            else
            {
                PropertyCollection.PublishMessage("Device1 is not present in Cart");
                return false;
            }
        }

        public Boolean SignInAndVerify(string strUsername, string strPassword)
        {
            new WebDriverWait(PropertyCollection.driver, TimeSpan.FromSeconds(5)).Until(SeleniumExtras.WaitHelpers.ExpectedConditions.ElementToBeClickable(lnkSignIn));
            lnkSignIn.Click();
            txtMail.SendKeys(strUsername);
            btnContinue.Click();
            txtPassword.SendKeys(strPassword);
            btnSignInSubmit.Click();
            PropertyCollection.PublishMessage("User Signed in successfully");
            string text2 = PropertyCollection.driver.FindElement(By.Id("sc-active-cart")).Text;
            if (text2.Contains("OnePlus 7"))
            {
                PropertyCollection.PublishMessage("Device1 added to Cart & verified after sign in");
                return true;
            }
            else
            {
                PropertyCollection.PublishMessage("Device1 is not added to Cart");
                return false;
            }
        }

        public Boolean DeleteAndVerify()
        {
            lnkDelete.Click();
            PropertyCollection.PublishMessage("Device1 deleted from Cart");
            System.Threading.Thread.Sleep(2000);
            string bodytext = lnkBodyText.Text;
            if ((bodytext.Contains("OnePlus 7 (Red, 8GB RAM, 256GB Storage) was removed from Shopping Cart.")))
            {
                PropertyCollection.PublishMessage("Device1 deletion verified");
                return true;
            }
            {
                PropertyCollection.PublishMessage("Device1 is not deleted from Cart");
                return false;
            }
        }

        public Boolean AddAnotherProductToCart()
        {
            string product2 = "OnePlus 6T";
            //new WebDriverWait(PropertyCollection.driver, TimeSpan.FromSeconds(5)).Until(SeleniumExtras.WaitHelpers.ExpectedConditions.ElementToBeClickable(By.Id("twotabsearchtextbox")));
            System.Threading.Thread.Sleep(2000);
            PropertyCollection.driver.FindElement(By.Id("twotabsearchtextbox")).SendKeys("one pluse 6T" + Keys.Enter);
            //new WebDriverWait(PropertyCollection.driver, TimeSpan.FromSeconds(5)).Until(SeleniumExtras.WaitHelpers.ExpectedConditions.ElementToBeClickable(By.PartialLinkText("OnePlus 6T (Midnight Black, 8GB RAM, 128GB Storage)")));
            System.Threading.Thread.Sleep(2000);
            PropertyCollection.driver.FindElement(By.PartialLinkText("OnePlus 6T (Midnight Black, 8GB RAM, 128GB Storage)")).Click();

            List<String> tabs2 = new List<String>(PropertyCollection.driver.WindowHandles);
            PropertyCollection.driver.SwitchTo().Window(tabs2[1]);
            //---> Add to cart and verify
            PropertyCollection.driver.FindElement(By.Id("add-to-cart-button")).Click();
            try
            {
                PropertyCollection.driver.FindElement(By.PartialLinkText("View Cart")).Click();
                PropertyCollection.driver.FindElement(By.Id("nav-cart")).Click();
            }
            catch (Exception e)
            {

                PropertyCollection.driver.FindElement(By.Id("nav-cart")).Click();
            }

            String updatedCartText = PropertyCollection.driver.FindElement(By.ClassName("sc-list-item-content")).Text;

            if (updatedCartText.Contains("OnePlus 6T"))
            {

                return true;
            }
            else
            {
                return false;
            }
        }

        public void SignOut()
        {
            Actions act = new Actions(PropertyCollection.driver);
            act.MoveToElement(lnkSignoutHover).Build().Perform();
            System.Threading.Thread.Sleep(2000);
            lnkSignOut.Click();
        }

    }
}
