package Session_39_Handling_Broken_Links_SVG_Elements_Shadow_DOM.task_01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

public class BrokenLinks {
    public static void main(String[] args) throws IOException {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("http://www.deadlinkcity.com/");
        driver.manage().window().maximize();

        // capture all the links from website
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("Total number of links : " +links);

        for (WebElement linkElement : links){
            String hrefAtValue = linkElement.getAttribute("href");

            if (hrefAtValue==null ||hrefAtValue.isEmpty()){
                System.out.println("href attribute value is null or empty. So Not Possible to check");
                continue;
            }

            // hit url to server
            try {
                URL linkURL = new URL(hrefAtValue);   // converted href value from string to URL format
                HttpURLConnection conn = (HttpURLConnection) linkURL.openConnection();  // open connection to the server
                conn.connect();   // connect to server and sent request to the server

                if(conn.getResponseCode()>=400){
                    System.out.println(hrefAtValue+ "=======> Broken link");
                } else {
                    System.out.println(hrefAtValue+ "=======> Not a broken link");
                }

            } catch (Exception e){

            }
        }


    }
}
