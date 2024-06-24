package tesebase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utility.WebdriverUtil;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class WebTestbase {

    public Properties prop;
     public static WebDriver driver;

    public WebTestbase() {// constructor
        FileInputStream fileInputStream = null; // for reading the file bytewise we will create an object of FileInputStream
        try {
            fileInputStream = new FileInputStream(System.getProperty("user.dir") +  "/src/main/resources/properties/config.properties");

        } catch (Exception e) {
            e.printStackTrace();
        }
       prop = new Properties();// for accessing the properties of proprty file.
        try {
            prop.load(fileInputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void intialization(){
        String browser=prop.getProperty("browserName");
        if(browser.equalsIgnoreCase("chrome")){
            System.getProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ "/src/main/resources/drivers/chromedriver.exe");
            driver=new ChromeDriver();
        }else {
            throw new RuntimeException("select the correct browser");
        }

        driver.get(prop.getProperty("url"));
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(WebdriverUtil.PAGE_LOAD_TIMEOUT));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(WebdriverUtil.IMPLICIT_WAIT));

    }


}
