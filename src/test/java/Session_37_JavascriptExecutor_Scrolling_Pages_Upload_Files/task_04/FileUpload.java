package Session_37_JavascriptExecutor_Scrolling_Pages_Upload_Files.task_04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
        driver.manage().window().maximize();

        // Single file upload - Test1.txt
        driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys("H:\\A_Feb_2024\\SDET_QA\\Selenium\\Test1.txt");

        if(driver.findElement(By.xpath("//ul[@id='fileList']//li")).getText().equals("Test1.txt")){
            System.out.println("File is successfully uploaded");
        } else {
            System.out.println("Upload failed");
        }
    }
}
