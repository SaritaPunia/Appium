
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class DriverManager {
	private static IOSDriver driver;

	static {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		AppiumDriverLocalService service;
		int port = 4723;
		service = AppiumDriverLocalService
				.buildService(new AppiumServiceBuilder().withIPAddress("0.0.0.0").usingPort(4723));
		capabilities.setCapability("platformName", "iOS");
		capabilities.setCapability("deviceName", "iPhone 6");
		capabilities.setCapability("platformVersion", "11.0");

		// note if plateform version is 10 or above must to set
		// capabilities.setCapability("AUTOMATION_NAME","XCUITest")

		capabilities.setCapability("bundleId", "com.fiberlink.maas360.enterpriseappstore");
		// com.fiberlink.maas360.enterpriseappstore
		capabilities.setCapability("udid", "c51a0190f40c5fc58e6bd3e052e9a6985f53cb03");
		capabilities.setCapability("deviceOrientation", "portrait");
		capabilities.setCapability("appiumVersion", "1.7.1");
		// capabilities.setCapability("xcodeConfigfile",
		// "/usr/local/lib/node_modules/appium/node_modules/appium-xcuitest-driver/WebDriverAgent/Config.xcconfig");
		capabilities.setCapability("AUTOMATION_NAME", "XCUITest");
		capabilities.setCapability("newCommandTimeout","90");
		driver = new IOSDriver(service, capabilities);
	}

	public static IOSDriver getDriver() {
		return driver;

	}

}
