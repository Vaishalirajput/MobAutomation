package BasicConfigurations;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class BasicConfig {
	
	public static AndroidDriver driver;
	static DesiredCapabilities capbt = new DesiredCapabilities();
	static SystemLocations sysLoc = new SystemLocations();
	static Properties prop= new Properties();
	
	public AndroidDriver launchApp() throws IOException, InterruptedException
	//public static void main(String[] args) throws IOException, InterruptedException
	{
		
		prop = sysLoc.getConfigLocation();
		capbt.setCapability("platformName", prop.getProperty("platform"));
		capbt.setCapability("deviceName",prop.getProperty("deviceName"));
		capbt.setCapability("app",prop.getProperty("app"));
		capbt.setCapability("noReset", true);
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capbt);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		return driver; 
		
	
	}
	
	public static String adbCommands(String cmd) throws IOException, InterruptedException {

		String line = "null";
        String fLine = "";
		Runtime run = Runtime.getRuntime();
		Process pr = run.exec(cmd);

		pr.waitFor();

		BufferedReader buf = new BufferedReader(new InputStreamReader(pr.getInputStream()));
		while ((line=buf.readLine())!=null) {
		fLine = fLine + " " + line;
		}
		return fLine;
		}
}