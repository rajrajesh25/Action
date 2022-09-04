package org.act1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action1 {

	public static void main(String[] args) throws AWTException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Actions\\Driver\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://www.facebook.com/");
driver.manage().window().maximize();
WebElement txtUserName = driver.findElement(By.id("email"));
txtUserName.sendKeys("greens");
Actions a = new Actions(driver);
a.doubleClick(txtUserName).perform();
a.contextClick(txtUserName).perform();
Robot r = new Robot();
r.keyPress(KeyEvent.VK_DOWN);
r.keyRelease(KeyEvent.VK_DOWN);
r.keyPress(KeyEvent.VK_DOWN);
r.keyRelease(KeyEvent.VK_DOWN);
r.keyPress(KeyEvent.VK_DOWN);
r.keyRelease(KeyEvent.VK_DOWN);

r.keyPress(KeyEvent.VK_ENTER);
r.keyRelease(KeyEvent.VK_ENTER);

WebElement txtPassword = driver.findElement(By.id("pass"));
a.doubleClick(txtPassword).perform();
WebElement txtSrc = driver.findElement(By.id("email"));
WebElement txtDest = driver.findElement(By.id("pass"));
txtDest.sendKeys("greens");
a.dragAndDrop(txtSrc, txtDest).perform();
	}

}
