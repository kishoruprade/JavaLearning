using OpenQA.Selenium;
using SeleniumExtras.PageObjects;
using SeleniumExtras.WaitHelpers;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using AutomationFramework;
using OpenQA.Selenium.Support.UI;

namespace TestManagement.PageObjects
{
    class GooglePage
    {
        public GooglePage()
        {
            PageFactory.InitElements(PropertyCollection.driver, this);
        }
        
        [FindsBy(How = How.Name, Using = "q")]
        public IWebElement txtSearch { get; set; }

        [FindsBy(How = How.Name, Using = "btnK")]
        public IWebElement btnSearch { get; set; }

        [FindsBy(How = How.LinkText, Using = "Images")]
        public IWebElement lnkImages { get; set; }

        public void GoogleSearch(string strstrDeviceName)
        {
            new WebDriverWait(PropertyCollection.driver, TimeSpan.FromSeconds(5)).Until(SeleniumExtras.WaitHelpers.ExpectedConditions.ElementToBeClickable(txtSearch));
            txtSearch.SendKeys(strstrDeviceName + Keys.Enter);

            PropertyCollection.log.Debug("Google Search completed");
            Reports.test.Pass("Google Search completed");
        }
    }
}
