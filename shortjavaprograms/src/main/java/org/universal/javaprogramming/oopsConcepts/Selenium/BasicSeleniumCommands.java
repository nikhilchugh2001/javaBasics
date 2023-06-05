package org.universal.javaprogramming.oopsConcepts.Selenium;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BasicSeleniumCommands {
	
	
	public static void alertAccept(WebDriver driver, String str) {
		
		Alert alert =driver.switchTo().alert();
		alert.sendKeys(str);
		alert.accept();
	}
	
	/**
	 * 
	 * @param driver
	 * @param by
	 * @param value
	 */
	
	public static void selectDropdown(WebDriver driver, String by, String value) {
		WebElement element = driver.findElement(By.xpath("//select[id='']"));
		Select select = new Select(element);
		
		
		
		
		switch(by) {
		
		case "value":
			select.selectByValue(value);
			break;
		case "text":
			select.selectByVisibleText(value);
			break;
		default:
			select.selectByIndex(Integer.parseInt(value));
			
		}
		
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		String s1 = new String("Hello");    //String 1  
        String s2 = new String(" World");    //String 2  
        String s = String.format("%s%s",s1,s2);   //String 3 to store the result  
            System.out.println(s.toString());  //Displays result  
            
            
            List<String> liststr = Arrays.asList("abc", "pqr", "xyz"); //List of String array  
            String str = liststr.stream().collect(Collectors.joining(", ")); //performs joining operation  
                System.out.println(str.toString());  //Displays result  

	}

}
