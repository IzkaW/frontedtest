package jsystems.cucumberTest.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import jsystems.cucumberTest.ConfigSteps;
import jsystems.cucumberTest.pages.*;
import org.openqa.selenium.WebDriver;
import pages.DataTest;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class LoginStep {

    WebDriver driver;

    MainPage mainPage;

    LoginPage loginPage;
    PasswordPage passwordPage;

    MainPersonalPage mainPersonalPage;
    PersonalPage personalPage;
    NotificationPage notificationPage;

    public LoginStep(ConfigSteps configSteps){
        try {
            driver = configSteps.setUp();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    @Given("^User jest na wordpress website \"([^\"]*)\"$")
    public void UserJestNaWordpressWebsite(String website)throws Throwable {
        driver.get(website);
        mainPage = new MainPage(driver);
        assertTrue(mainPage.logIn.isDisplayed());
    }


    @When("^User clicks to login button$")
    public void userClicksToLoginButton() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        mainPage.logIn.click();
     //   throw new PendingException();


    }

    @Then("^User is on first login page$")
    public void userIsOnFirstLoginPage() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        loginPage = new LoginPage(driver);
        assertTrue(loginPage.buttoncontinue.isDisplayed());
   //     throw new PendingException();
    }

    @When("^User enter login and press <Continue>$")
    public void userEnterLoginAndPressContinue() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        loginPage.usernameInput.sendKeys(DataTest.username);
        loginPage.buttoncontinue.click();
     //   throw new PendingException();
    }

    @Then("^User is on password page$")
    public void userIsOnPasswordPage() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        passwordPage = new PasswordPage(driver);
        assertTrue(passwordPage.buttonLogIn.isDisplayed());
      //  throw new PendingException();
    }

    @When("^User enter password and press <LogIn>$")
    public void userEnterPasswordAndPressLogIn() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        passwordPage.passwordInput.sendKeys(DataTest.userpassword);
        passwordPage.buttonLogIn.click();
       // throw new PendingException();
    }

    @Then("^User is on main login page$")
    public void userIsOnMainLoginPage() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    mainPersonalPage = new MainPersonalPage(driver);
       // throw new PendingException();
    }

    @When("^User press avatar$")
    public void userPressAvatar() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        mainPersonalPage.avatar.click();
       // throw new PendingException();
    }

    @Then("^User is on personal page$")
    public void userIsOnPersonalPage() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        personalPage = new PersonalPage(driver);
        assertTrue(personalPage.notification.isDisplayed());
        assertFalse(personalPage.saveProfileDetailsButton.isEnabled());
       // throw new PendingException();
    }

    @When("^User clicks notification link$")
    public void userClicksNotificationLink() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        personalPage.notification.click();
       // throw new PendingException();
    }

    @Then("^User is on notification page$")
    public void userIsOnNotificationPage() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        notificationPage = new NotificationPage(driver);
        assertTrue(notificationPage.firstCheckbox.isSelected());
       // throw new PendingException();
    }

    @When("^User clicks checkbox$")
    public void userClicksCheckbox() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        notificationPage.firstCheckbox.click();
       // throw new PendingException();
    }

    @Then("^Checkbox is unselected$")
    public void checkboxIsUnselected() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        assertFalse(notificationPage.firstCheckbox.isSelected());
       // throw new PendingException();
    }
}
