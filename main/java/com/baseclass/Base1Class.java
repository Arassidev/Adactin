package com.baseclass;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Base1Class {
	public WebDriver driver;
	private void Browser_Launch() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kalai\\eclipse-workspace\\Batch2023\\Driver\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();	
	    	
	}
	public void openUrl(String Url) {
	  driver.get(Url);
	}
	public void sendkeys(WebElement element.String) {
	  element.sendKeys(key);
	}
	public void click(WebElement Element) {
	  Element.click();
	}
	public void maximize() {
	  driver.manage().window().maximize();
	}
	public void close() {
	  driver.close();
	}
	public void quit() {
	  driver.quit();
	}
	public void navigate(String url) {
	  driver.navigate().to(url);
	}
	public void navigateback() {
	  driver.navigate().back();	
	} 
	public void navigateforward() {
	  driver.navigate().forward();
	}
	public void refresh() {
	  driver.navigate().refresh();
	}
	public void alertaccept() {
	  driver.switchTo().alert().accept();
	}
	public void alertdismiss() {
		driver.switchTo().alert().dismiss();
	}
	public void promptalert(String key) {
		driver.switchTo().alert().sendKeys(key);
	}
	public void frame(WebElement element) {
		driver.switchTo().frame(element);
	}
	public void defaultcontent() {
		driver.switchTo().defaultContent();
	}
	public void selectbyIndex(WebElement Element,int index) {
		Select d=new Select(Element);
		d.selectByIndex(index);
	}
	public void selecybyvalue(WebElement Element,String value) {
		Select d=new Select(Element);
		d.selectByValue(value);
	}
	public void selectbyvisibletext(WebElement text) {
		Select a= new Select(text);
		a.selectByVisibleText("text");
	}
	public void deselectbyindex(WebElement index) {
		Select k= new Select(index);
		k.deselectByIndex(2);
	}
	public void deslectvalue(WebElement Value) {
		Select k=new Select(Value);
		k.deselectByValue("12345");
	}
	public void deselectbyvisibletext(WebElement mark) {
		Select k=new Select(mark);
		k.deselectByVisibleText("text");
	}
	public void deselctall(WebElement code) {
		Select k= new Select(code);
		k.deselectAll();
	}
	public void isdisplayed(WebElement element) {
		boolean displayed = element.isDisplayed();
		System.out.println(displayed);
	}
	public void isenable(WebElement element) {
		boolean enabled = element.isEnabled();
		System.out.println(enabled);
	}
	public void isselected(WebElement element) {
		boolean selected = element.isSelected();
		System.out.println(selected);
	}
	
	public void currenturl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
	}
	public void gettitle() {
		String title = driver.getTitle();
		System.out.println(title);
	}
	public void robot() {
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_RIGHT);
	    r.keyRelease(KeyEvent.VK_RIGHT);
	    r.keyPress(KeyEvent.VK_ENTER);
	    r.keyRelease(KeyEvent.VK_ENTER);
	}
	public void actionclick() {
		Actions act=new Actions (driver);
		act.click();
	}
	public void actionContextClick(WebElement click) {
		Actions act=new Actions (driver);
		act.contextClick(click);
	}

	private void actionDoubleClick(WebElement target) {
		Actions act=new Actions (driver);
		act.doubleClick(target);

	}
	public void actionMoveToElement(WebElement move) {
		Actions act=new Actions (driver);
		act.moveToElement(move);
	}
	public void actionDragAndDrop(WebElement From,WebElement To) {
		Actions act =new Actions (driver);
		act.dragAndDrop(From, To);
	}
	public void threadsleep() {
		Thread.sleep(2000);
	}
	public void screenshot(String path) {
		TakesScreenshot k=(TakesScreenshot)driver;
		File source = k.getScreenshotAs(OutputType.FILE);
		File destination =new File(path);
		FileUtils.copyFile(source, destination);
	}
	public void implicitWait(int sec) {
		driver.manage().timeouts().implicitlyWait(sec,TimeUnit.SECONDS);

	}
	
	
}
