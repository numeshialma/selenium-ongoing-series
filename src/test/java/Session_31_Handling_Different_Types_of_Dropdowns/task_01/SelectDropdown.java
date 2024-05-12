package Session_31_Handling_Different_Types_of_Dropdowns.task_01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class SelectDropdown {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        WebElement dropCountryEle = driver.findElement(By.xpath("//select[@id='country']"));

        Select dropCountry = new Select(dropCountryEle);

        // select option from the dropdown
        dropCountry.selectByVisibleText("France");
        dropCountry.selectByValue("france");
        dropCountry.selectByIndex(0);

    }
}
