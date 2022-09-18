package StepDefenitions;
import Pages.HomePage;
import Pages.SignUpPage;
import cucumber.api.PendingException;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Steps {
    WebDriver base_test_driver;
    HomePage homePage;
    SignUpPage signUpPage;
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

    @When("^the user enters an email that does not previously registered with$")
    public void the_user_enters_an_email_that_does_not_previously_registered_with() throws Throwable {
        signUpPage= new SignUpPage(base_test_driver);
        signUpPage.insertName("Nada Kandil");
        signUpPage.insertEmail("nada333@gmail.com");
        signUpPage.clickOnSignup();
        throw new PendingException();
    }

    @Then("^the user enters a registration form$")
    public void the_user_enters_a_registration_form() throws Throwable {
        signUpPage.clickOnGender();
        signUpPage.insertPassword("123456");
        signUpPage.insertDay();
        signUpPage.insertMonth();
        signUpPage.insertYear();
        signUpPage.clickOnNewSletter();
        signUpPage.clickOnSendOffers();
        signUpPage.insertFName("Nada");
        signUpPage.insertLName("Kandil");
        signUpPage.insertCompany("company");
        signUpPage.insertAddress("Street no.5");
        signUpPage.insertCountry("United States");
        signUpPage.insertState("0000");
        signUpPage.insertCity("Cairo");
        signUpPage.insertZipCode("00000");
        signUpPage.insertPhoneNo("+201000000000");
        signUpPage.clickOnSubmit();
        throw new PendingException();
    }

    @Then("^the user should be registered successfully$")
    public void the_user_should_be_registered_successfully() throws Throwable {
        signUpPage.clickOnContinue();
        String Check_SignUp = base_test_driver.findElement(By.xpath("/html/body/header/div/div/div/div[2]/div/ul/li[10]/a")).getText();

        Assert.assertEquals(Check_SignUp, "Logged in as Nada Kandil");
        throw new PendingException();
    }

    @When("^the user enters a pre-registered email$")
    public void the_user_enters_a_pre_registered_email() throws Throwable {
        signUpPage= new SignUpPage(base_test_driver);
        signUpPage.insertName("Nada Kandil");
        signUpPage.insertEmail("nada333@gmail.com");
        signUpPage.clickOnSignup();
        throw new PendingException();
    }

    @Then("^an error message must appear$")
    public void an_error_message_must_appear() throws Throwable {
        String check_errorMessage = base_test_driver.findElement(By.xpath("/html/body/section/div/div/div[3]/div/form/p")).getText();
        Assert.assertEquals(check_errorMessage, "Email Address already exist!");
        throw new PendingException();
    }


    @After
    public void teardown() throws Exception{
        base_test_driver.quit();
    }




}
