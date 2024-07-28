package stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


class LoginSteps
{
	WebDriver driver;

@Given("the user is on the nopcommerce login page")
public void the_user_is_on_the_nopcommerce_login_page() {
 driver=new ChromeDriver();
 driver.get("https://www.nopcommerce.com/en/login?returnUrl=%2Fen");
 driver.manage().window().maximize();
 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
 
 
}

@When("the user enters valid credentials \\( username: {string}, \"password: \"Twinkle@{int}\")")
public void the_user_enters_valid_credentials_username_password_twinkle(String email, String pwd) {
    driver.findElement(By.xpath(".//input[@id='Username']")).sendKeys(email);
    driver.findElement(By.xpath(".//input[@id='Password']")).sendKeys(pwd);
    
}

@When("the user clicks on the login button")
public void the_user_clicks_on_the_login_button() {
	driver.findElement(By.xpath("(.//input[@class='btn blue-button'])[2]")).click();
	}


@Then("the user should be redirected to the My Account page")
public void the_user_should_be_redirected_to_the_my_account_page() {
	
}
@Then("the user should see welcome message")
public void the_user_should_see_welcome_message() {

	
}

}