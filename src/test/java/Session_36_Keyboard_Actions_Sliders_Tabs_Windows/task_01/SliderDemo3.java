package Session_36_Keyboard_Actions_Sliders_Tabs_Windows.task_01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderDemo3 {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
        driver.manage().window().maximize();

        Actions act = new Actions(driver);

        // Min slider
        WebElement min_slider = driver.findElement(By.xpath("//div[@class='price-range-block']//span[1]"));
        System.out.println("Location of the min slider before moving : " +min_slider.getLocation());  // (59, 250) = (x,y)

        act.dragAndDropBy(min_slider,100,250).perform();
        System.out.println("Location of the min slider after moving : " +min_slider.getLocation());  // (158, 250) = (x,y)

        // Max slider
        WebElement max_slider = driver.findElement(By.xpath("//span[2]"));
        System.out.println("Location of the max slider before moving : " +max_slider.getLocation());  // (612, 250) = (x,y)

        act.dragAndDropBy(max_slider,-100,250).perform();
        System.out.println("Location of the min slider after moving : " +max_slider.getLocation());  // (512, 250) = (x,y)
    }
}
