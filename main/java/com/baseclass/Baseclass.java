package com.baseclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.desktop.OpenUrl;
import java.awt.event.KeyEvent;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Baseclass {
	public WebDriver driver;
	public void Browser_Launch() {
		
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\kalai\\eclipse-workspace\\Batch2023\\Driver\\chromedriver.exe");
		    WebDriver driver = new ChromeDriver();	
		    	
	}
public void openUrl(String url) {
 driver.get(url);	
}
public void click(WebElement Element) {
Element.click();

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
}
public void deselectbyindex(WebElement in) {
	Select dd=new Select (in);
	
}
public void selectall(WebElement task) {
Select dd= new Select(task);
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
public void currentUrl() {
String currentUrl = driver.getCurrentUrl();
System.out.println();

}
public void title() {
String title = driver.getTitle();
}

public void navigate() {
driver.navigate().to("http://adactinhotelapp.com/");
}
public void back() {
	driver.navigate().back();	
} 

public void forward() {
	driver.navigate().forward();

}
public void refresh() {
	driver.navigate().refresh();

}

public void dragAndDrop(WebElement From,WebElement TO) {
Actions act =new Actions(driver);
act.dragAndDrop(From, TO);
}

private void manage() {
	driver.manage().window()
}

public void getwindowhandle() {
	String windowHandle = driver.getWindowHandle();
	driver.switchTo().window(windowHandle);
}

public void frame(WebElement element) {
	driver.switchTo().frame(element);

}
	
}









}
