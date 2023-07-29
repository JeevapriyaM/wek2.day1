package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Editinglead {

	public static void main(String[] args) {
		
//  1. Launch URL "http://leaftaps.com/opentaps/control/login"
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		
//  2. Enter UserName and Password Using Id Locator
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
//  3. Click on Login Button using Class Locator
		driver.findElement(By.className("decorativeSubmit")).click();
		
//  4. Click on CRM/SFA Link
		driver.findElement(By.linkText("CRM/SFA")).click();
				
//  5. Click on Leads Button
		driver.findElement(By.linkText("Leads")).click();
		
//  6. Click on Create Lead 
		driver.findElement(By.linkText("Create Lead")).click();
		
//  7. Enter CompanyName Field Using id Locator
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("StayPositive");
		
//  8. Enter FirstName Field Using id Locator
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Hope");
		
//  9. Enter LastName Field Using id Locator
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Karma");
		
//  10. Enter FirstName(Local) Field Using id Locator
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Skie");
		
//  11. Enter Department Field Using any Locator of Your Choice
		driver.findElement(By.name("departmentName")).sendKeys("MotherNature");
		
//  12. Enter Description Field Using any Locator of your choice 
		driver.findElement(By.id("createLeadForm_description")).sendKeys("I care for myself. The more solitary, the more friendless, the more unsustained I am, the more I will respect myself.");
		
//  13. Enter your email in the E-mail address Field using the locator of your choice
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("jeevapriya@testleaf.com");
		
//  14. Click on Create Button
		driver.findElement(By.className("smallSubmit")).click();
		
//   15. Click on edit button
		driver.findElement(By.linkText("Edit")).click();
		
//   16. Clear the Description Field using .clear()
		driver.findElement(By.id("updateLeadForm_description")).clear();
		
//  17. Fill ImportantNote Field with Any text
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Edited the lead");
		
//  18. Click on update button 
		driver.findElement(By.className("smallSubmit")).click();
		
//  19. Get the Title of Resulting Page. refer the video  using driver.getTitle()
		System.out.println("Title of Resulting Page: " + driver.getTitle());
		
driver.close();

	}

}
