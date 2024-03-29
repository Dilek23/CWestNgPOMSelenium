package clarusway.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Driver {
  private static WebDriver driver;// static yaptık çünkü her classtan cagrilcak

    private Driver() {// Driver objesi oluşturduk

    }
    public static WebDriver getDriver() {// private oldugu için getterini oluşturduk
        if (driver == null) {
          WebDriverManager.chromedriver().setup();
            driver=new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        }
        return driver;
    }
    public static void closeDriver(){
        if(driver!=null){
            driver.quit();
            driver=null;
        }

    }
    }



