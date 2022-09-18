package StepDefenitions;

import Pages.AddToCart_Checkout_Page;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.SignUpPage;
import cucumber.api.PendingException;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Steps2 {
    WebDriver base_test_driver;
    HomePage homePage;
    SignUpPage signUpPage;
    LoginPage loginPage;
    AddToCart_Checkout_Page addToCart_checkout_page;
    @Before
    public void setUp() throws Exception{
        WebDriverManager.chromedriver().setup();
        base_test_driver = new ChromeDriver();
        new ChromeOptions();
        base_test_driver.manage().window().maximize();
        base_test_driver.get("http://automationexercise.com/");
        homePage = new HomePage(base_test_driver);
        signUpPage = new SignUpPage(base_test_driver);
    }

    @Given("^the user is on the website$")
    public void the_user_is_on_the_website() throws Throwable {

        homePage.clickOnSignupLoginBtn();
        throw new PendingException();
    }

    @And("the user is on login page")
    public void theUserIsOnLoginPage() {
        loginPage = new LoginPage(base_test_driver);
        loginPage.insertEmailLogin("nada@gmail.com");
        loginPage.insertPasswordLogin("12345");
        loginPage.clickOnLoginBtn();
    }

    @And("the user navigates to products page to add products")
    public void theUserNavigatesToProductsPageToAddProducts() {
        addToCart_checkout_page = new AddToCart_Checkout_Page(base_test_driver);
        addToCart_checkout_page.clickOnProducts();
        addToCart_checkout_page.clickOnProduct1();
        addToCart_checkout_page.clickOnAddToCart();
        addToCart_checkout_page.clickOnProducts();
        addToCart_checkout_page.clickOnProduct2();
        addToCart_checkout_page.clickOnAddToCart();
        addToCart_checkout_page.clickOnProducts();
    }



    @And("the user is on cart page")
    public void theUserIsOnCartPage() {
        addToCart_checkout_page.clickOnCart();
    }

    @And("the user clicks on proceed to checkout")
    public void theUserClicksOnProceedToCheckout() {
        addToCart_checkout_page.clickOnProceedToCheckOut();
    }

    @And("the user clicks on place order")
    public void theUserClicksOnPlaceOrder() {
        addToCart_checkout_page.clickOnPlaceOrder();
    }

    @And("the user enters his payment information")
    public void theUserEntersHisPaymentInformation() {
        addToCart_checkout_page.insertCardName("Nada Kandil");
        addToCart_checkout_page.insertCardNo("202");
        addToCart_checkout_page.insertCardCVC("311");
        addToCart_checkout_page.insertCardExp1("03");
        addToCart_checkout_page.insertCardExp2("2023");
    }

    @And("the user clicks on pay and confirm order")
    public void theUserClicksOnPayAndConfirmOrder() {
        addToCart_checkout_page.clickOnConfirmOrder();
    }

    @And("the user clicks on download invoice")
    public void theUserClicksOnDownloadInvoice() {
        addToCart_checkout_page.clickOnDownloadInvoice();
    }

    @And("the user clicks on continue")
    public void theUserClicksOnContinue() {
        addToCart_checkout_page.clickOnContinueFinal();
    }

    @When("the user clicks on logout")
    public void theUserClicksOnLogout() {
        homePage.clickOnLogout();
    }

    @Then("The login page will appear")
    public void theLoginPageWillAppear() {
        String check_logout = base_test_driver.findElement(By.xpath("/html/body/section/div/div/div[1]/div/h2")).getText();
        Assert.assertEquals(check_logout,"Login to your account");
    }
    @After
    public void teardown() throws Exception{
        base_test_driver.quit();
    }


}
