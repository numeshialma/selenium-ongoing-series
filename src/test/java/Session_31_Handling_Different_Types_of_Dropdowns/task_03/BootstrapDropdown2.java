package Session_31_Handling_Different_Types_of_Dropdowns.task_03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class BootstrapDropdown2 {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//button[contains(@class,'multiselect')]")).click();  // opens dropdown options


        // 2. Capture all the options and find out size
        List<WebElement> options = driver.findElements(By.xpath("//ul[contains(@class,'multiselect')]//label"));
        System.out.println("Number of options : " +options.size());

        // 4. Select multiple options from dropdown
        for(WebElement op: options){
            if(op.getText().equals("Java") || op.getText().equals("Python") || op.getText().equals("MySQL")){

            }
        }
        
    }
}
