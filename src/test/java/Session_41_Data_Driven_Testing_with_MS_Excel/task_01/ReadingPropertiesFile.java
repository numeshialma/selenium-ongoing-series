package Session_41_Data_Driven_Testing_with_MS_Excel.task_01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collection;
import java.util.Properties;
import java.util.Set;

public class ReadingPropertiesFile {

    public static void main(String[] args) throws IOException {

        // Location of properties file
        FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\testdata\\config.properties");

        // Loading properties file
        Properties propertiesObj = new Properties();
        propertiesObj.load(file);

        // Reading data from properties file
        String url = propertiesObj.getProperty("appurl");
        String email = propertiesObj.getProperty("email");
        String pwd = propertiesObj.getProperty("password");
        String orid = propertiesObj.getProperty("orderid");
        String custid = propertiesObj.getProperty("custid");

        System.out.println(url+" " +email+" " +pwd+" " +orid+" " +custid);

        // Reading all the keys from properties file
        Set<String> keys=propertiesObj.stringPropertyNames();
        System.out.println(keys);    // [password, orderid, custid, appurl, email]

        Set<Object> keys1 = propertiesObj.keySet();
        System.out.println(keys1);   // [password, orderid, custid, appurl, email]

        // Reading all the values from properties file
        Collection<Object> values = propertiesObj.values();
        System.out.println(values);   // [abcxyz, 123, 234, https://demo.opencart.com/, abc@email.com]

        file.close();

    }

}
