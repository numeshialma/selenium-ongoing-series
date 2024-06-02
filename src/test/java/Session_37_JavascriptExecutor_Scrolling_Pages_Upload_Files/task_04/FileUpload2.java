package Session_37_JavascriptExecutor_Scrolling_Pages_Upload_Files.task_04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload2 {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
        driver.manage().window().maximize();

        // Multiple files upload - Test1.txt Test2.txt
        String file1 = "H:\\A_Feb_2024\\SDET_QA\\Selenium\\Test1.txt";
        String file2 = "H:\\A_Feb_2024\\SDET_QA\\Selenium\\Test2.txt";

        driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys(file1+"\n"+file2);

        int noOfFilesUploaded = driver.findElements(By.xpath("//ul[@id='fileList']//li")).size();

        // validation 1 - Number of files
        if(noOfFilesUploaded==2) {
            System.out.println("All files are uploaded");
        } else {
            System.out.println("Files are not uploaded or incorrect files uploaded");
        }

        // validate file names
        if(driver.findElement(By.xpath("//ul[@id='fileList']//li[1]")).getText().equals("test1.txt")
            && driver.findElement(By.xpath("//ul[@id='fileList']//li[2]")).getText().equals("test2.txt") ) {
            System.out.println("File names are matching");
        } else {
            System.out.println("File names are not matching");
        }
    }
}
