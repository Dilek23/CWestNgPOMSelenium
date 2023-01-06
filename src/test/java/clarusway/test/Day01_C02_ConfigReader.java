package clarusway.test;

import org.testng.annotations.Test;
import clarusway.utilities.ConfigReader;
import clarusway.utilities.Driver;

public class Day01_C02_ConfigReader {
// tek driver actık ve kapattık
    @Test
    public void readConfig() {
        Driver.getDriver().get(ConfigReader.getProperty("google_url"));
        Driver.closeDriver();

    }
}
