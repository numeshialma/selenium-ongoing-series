package Session_26_WebDriver_Methods_Part_1.task_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethods2 {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.nopcommerce.com/register");
        driver.manage().window().maximize();

        /** isSelected() */
        WebElement male_rd = driver.findElement(By.xpath("//input[@id='gender-male']"));
        WebElement female_rd = driver.findElement(By.xpath("//input[@id='gender-female']"));

        System.out.println("Before selection.....");
        System.out.println(male_rd.isSelected());    // false
        System.out.println(female_rd.isSelected());   // false

        System.out.println("After selecting male....");
        male_rd.click();    // select male radio button

        System.out.println(male_rd.isSelected());    // true
        System.out.println(female_rd.isSelected());   // false


        boolean newsLetterStatus = driver.findElement(By.xpath("//input[@id='Newsletter']")).isSelected();
        System.out.println("News letter checkbox status " +newsLetterStatus);   // News letter checkbox status true

    }
}
