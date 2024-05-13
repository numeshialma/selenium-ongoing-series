package Session_32_Handling_Auto_suggest_Dropdown_Static_Web_Table.task_01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class GoogleSearch_AutoSuggestDropdown {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("http://www.google.com");
        driver.manage().window().maximize();

        driver.findElement(By.name("q")).sendKeys("selenium");  // search box
        Thread.sleep(5000);

        List<WebElement> list = driver.findElements(By.xpath("//ul[@role='listbox]//li//div[@role='option']"));

        System.out.println(list.size());

        for(int i=0; i< list.size(); i++){
            System.out.println(list.get(i).getText());
            if(list.get(i).getText().equals("selenium")){
                list.get(i).click();
                break;
            }
        }
    }
}
