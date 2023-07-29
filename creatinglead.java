package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class creatinglead {

	public static void main(String[] args) {
//		 1. Launch URL "http://leaftaps.com/opentaps/control/login"
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		
//		  2. Enter UserName and Password Using Id Locator
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
//		  3. Click on Login Button using Class Locator
		driver.findElement(By.className("decorativeSubmit")).click();
		
//		  4. Click on CRM/SFA Link
		driver.findElement(By.linkText("CRM/SFA")).click();
		
//		  5. Click on Leads Button
		driver.findElement(By.linkText("Leads")).click();
		
//		  6. Click on Create Lead 
		driver.findElement(By.linkText("Create Lead")).click();
		
//		  7. Enter CompanyName Field Using id Locator
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		
//		  8. Enter FirstName Field Using id Locator
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Jeeva");
		
//		  9. Enter LastName Field Using id Locator
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Priya");
		
//		  10. Enter FirstName(Local) Field Using id Locator
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("JLo");
		
//		  11. Enter Department Field Using any Locator of Your Choice
		driver.findElement(By.name("departmentName")).sendKeys("IT");
		
//		  12. Enter Description Field Using any Locator of your choice 
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Hi am Jeeva Manual Tester");

		
//		  13. Enter your email in the E-mail address Field using the locator of your choice
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("jeevapriya@testleaf.com");
		
//		  14. Click on Create Button
		driver.findElement(By.className("smallSubmit")).click();
		
//       15. Get the Title of Resulting Page. refer the video  using driver.getTitle()
		System.out.println("Title of Resulting Page: " + driver.getTitle());
		
		
		


	}

}
