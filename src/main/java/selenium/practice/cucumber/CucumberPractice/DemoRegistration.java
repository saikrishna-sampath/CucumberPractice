package selenium.practice.cucumber.CucumberPractice;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DemoRegistration {
	FirefoxDriver driver;

	@Given("^The user is in demo resgitration page$")
	public void the_user_is_in_demo_resgitration_page() {
		System.setProperty("webdriver.gecko.driver",
				"D:\\Softwares\\Eclipse\\EclipsePhoton\\eclipse-workspace\\Practice\\CucumberPractice\\driver\\geckodriver.exe");

		driver = new FirefoxDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
	}

	@When("^The user enters all valid details \"([^\"]*)\", \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void the_user_enters_all_valid_details(String FirstName, String LastName, String Address, String EmailId, String Phone,
			String Gender, String Hobbies, String Language, String Skills, String Country, String DOB, String Password,
			String ConfirmPassword) {
		WebElement txtFirstName = driver.findElement(By.cssSelector("[ng-model='FirstName']"));
		WebElement txtLastName = driver.findElement(By.cssSelector("[ng-model='LastName']"));
		WebElement txtAddress = driver.findElement(By.cssSelector("[ng-model='Adress']"));
		WebElement txtEmail = driver.findElement(By.cssSelector("[ng-model='EmailAdress']"));
		WebElement txtPhone = driver.findElement(By.cssSelector("[ng-model='Phone']"));
		WebElement radioMale = driver.findElement(By.cssSelector("[value='Male']"));
		WebElement radioFemale = driver.findElement(By.cssSelector("[value='FeMale']"));
		WebElement checkCricket = driver.findElement(By.cssSelector("[value='Cricket']"));
		WebElement checkMovies = driver.findElement(By.cssSelector("[value='Movies']"));
		WebElement checkHockey = driver.findElement(By.cssSelector("[value='Hockey']"));
		WebElement selLang = driver.findElement(By.cssSelector("[id='msdd']"));
		/* WebElement optCzech = driver.findElement(By.xpath("//a[text()='Czech']"));
		WebElement optDanish = driver.findElement(By.xpath("//a[text()='Danish']"));
		WebElement optBulgarian = driver.findElement(By.xpath("//a[text()='Bulgarian']"));
		WebElement optCroation = driver.findElement(By.xpath("//a[text()='Croatian']")); */
		/*WebElement optSkillAPI = driver.findElement(By.cssSelector("[value='APIs']"));*/
		WebElement selSkills = driver.findElement(By.cssSelector("[ng-model='Skill']"));
		WebElement selCountry = driver.findElement(By.cssSelector("[ng-model='country']"));
		/*WebElement optCountryAustria = driver.findElement(By.cssSelector("[value='Austria']"));
		WebElement optCountryBahrain = driver.findElement(By.cssSelector("[value='Bahrain']"));*/
		WebElement selYear = driver.findElement(By.cssSelector("[ng-model='yearbox']"));
		WebElement selMonth = driver.findElement(By.cssSelector("[ng-model='monthbox']"));
		WebElement selDay = driver.findElement(By.cssSelector("[ng-model='daybox']"));
		WebElement txtPassword = driver.findElement(By.cssSelector("[ng-model='Password']"));
		WebElement txtConfirmPassword = driver.findElement(By.cssSelector("[ng-model='CPassword']"));
		WebElement btnSubmit = driver.findElement(By.cssSelector("[value='sign up']"));
		
		txtFirstName.sendKeys(FirstName);
		txtLastName.sendKeys(LastName);
		txtAddress.sendKeys(Address);
		txtEmail.sendKeys(EmailId);
		txtPhone.sendKeys(Phone);
		
		if (Gender.equals("Male")) {
			radioMale.click();
		} else {
			radioFemale.click();
		}
		
		String[] Hobby = Hobbies.split(", ");
		for (int i = 0; i < Hobby.length; i++) {
			if (Hobby[i].equals("Cricket")) {
				checkCricket.click();
			} else if (Hobby[i].equals("Movies")) {
				checkMovies.click();
			} else if (Hobby[i].equals("Hockey")) {
				checkHockey.click();
			}
		}
		
		Select selectCountry = new Select(selCountry);
		selectCountry.selectByVisibleText(Country);
		
		Select selectSkills = new Select(selSkills);
		selectSkills.selectByVisibleText(Skills);
		
		Select year = new Select(selYear);
		Select month = new Select(selMonth);
		Select date = new Select(selDay);
		String[] DateOfBirth = DOB.split("-");
		for (int i = 0; i < DateOfBirth.length; i++) {
			selYear.selectByVisibleText(DateOfBirth[i]);
		}
	}

	@Then("^Success message is shown after successful registration$")
	public void success_message_is_shown_after_successful_registration() {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}
}
