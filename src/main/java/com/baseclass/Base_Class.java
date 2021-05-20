package com.baseclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base_Class {
	
	// WebElement methods
	// sendKeys
	public static void inputkeys(WebElement element, String str) {
		element.sendKeys(str);
	}

	// click
	public static void clickonelement(WebElement element) {
		element.click();
	}

	// is selected
	public static void isselected(WebElement element) {
		boolean selected = element.isSelected();
		System.out.println(selected);
	}

	// getText
	public static void getText(WebElement element) {
		String text = element.getText();
		System.out.println(text);

	}

	// isDisplay
	public static void isdisplay(WebElement element) {
		boolean displayed = element.isDisplayed();
		System.out.println(displayed);
	}

	// isEnable
	public static void isenable(WebElement element) {
		boolean enabled = element.isEnabled();
		System.out.println(enabled);
	}

	// dropDowm
	public static void dropdown(WebElement element, String option, String input) {
		Select s = new Select(element);
		if (option.equals("index")) {
			int parseInt = Integer.parseInt(input);
			s.selectByIndex(parseInt);
		} else if (option.equals("value")) {
			s.selectByValue(input);
		} else if (option.equals("text")) {
			s.selectByVisibleText(input);
		}

	}

	// TakesScreenshot
	public static void screenshot(String path) throws IOException {
		TakesScreenshot ts = (TakesScreenshot)driver ;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File(path);
		FileUtils.copyFile(source, destination);

	}

	// Actions
	// contextclick
	public static void contextclick(WebElement element) {
		Actions ac = new Actions(driver);
		ac.contextClick(element).build().perform();

	}

	// moveToElement
	public void movetoelement(WebElement element) {
		Actions ac = new Actions(driver);
		ac.moveToElement(element).build().perform();

	}

	// Doubleclick
	public static void doubleclick(WebElement element) {
		Actions ac = new Actions(driver);
		ac.doubleClick(element).build().perform();

	}

	// Robot
	public static void robot() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}

	// web driver
	// browser launch
	public static WebDriver driver;// null driver

	public static WebDriver browserlaunch(String browser) {
		try {
			if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver",
						"E:\\BA\\DESKTOP\\eclipse-workspace\\Adactinhotelapp\\Driver\\chromedriver.exe");
				driver = new ChromeDriver();
			} else if (browser.equalsIgnoreCase("ie")) {
				System.setProperty("webdriver.ie.driver", "");
				driver = new InternetExplorerDriver();
			} else {
				System.out.println("invaild");

			}

			driver.manage().window().maximize();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return driver ;
	}

	// get
	public static void get(String url) {
		driver.get(url);
	}

	// close
	public static void close() {
		driver.close();

	}

	// quite
	public static void quite() {
		driver.quit();
	}

	// navigate
	public static void navigate(String url) {
		driver.navigate().to(url);
	}

	// navigate back
	public static void back() {
		driver.navigate().back();
	}

	// navigate forward
	public static void forward() {
		driver.navigate().forward();
	}

	// refresh
	public static void refersh() {
		driver.navigate().refresh();
	}

	// getTitle
	public static void gettitle() {
		String title = driver.getTitle();
		System.out.println(title);
	}

	// getUrl
	public static void geturl() {
		String url =driver .getCurrentUrl();
		System.out.println(url);
	}

	// Alert
	public static void confirmAlert() {
		Alert alert =driver .switchTo().alert();
		alert.accept();
	}

	// promptAlert
	public static void promptAlert(String key) {
		Alert promptalert =driver .switchTo().alert();
		promptalert.sendKeys(key);
		promptalert.accept();
	}

	// frames
	public static void frames(WebElement element) {
		driver.switchTo().frame(element);

	}

	// implicitWait
	public static void implicitwait() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	// ExplicitWait
	public static void explicitwait(long seconds, WebElement element) {
		WebDriverWait wait = new WebDriverWait( driver, seconds);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	// windowHandles
	public static void windowHandles(String url) {
		Set<String> windowHandles =driver .getWindowHandles();
		for (String allid : windowHandles) {
			String title =driver .switchTo().window(allid).getTitle();
			System.out.println(title);

		}
		String actualtitle = url;
		for (String actualid : windowHandles) {
			if (driver.switchTo().window(actualid).getTitle().equals(actualtitle)) {
				break;

			}
		}

	}

}
