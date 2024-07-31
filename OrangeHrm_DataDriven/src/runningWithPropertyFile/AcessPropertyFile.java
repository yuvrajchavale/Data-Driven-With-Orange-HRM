package runningWithPropertyFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AcessPropertyFile {
	
WebDriver driver;
Properties conpro;
	
@BeforeMethod
public void setUp() throws Throwable
{
	conpro = new Properties();
	//loading Property File
	conpro.load(new FileInputStream("./PropertyFiles/OrangeHrm.properties"));
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get(conpro.getProperty("Url"));
	driver.findElement(By.xpath(conpro.getProperty("ObjAdvancedButton"))).click();
	driver.findElement(By.xpath(conpro.getProperty("ObjProcessLink"))).click();
	driver.findElement(By.xpath(conpro.getProperty("ObjUser"))).sendKeys("Admin");
	driver.findElement(By.xpath(conpro.getProperty("ObjPassword"))).sendKeys("Qedge123!@#");
	driver.findElement(By.xpath(conpro.getProperty("ObjLogin"))).click();
	
	
    
}
@Test
public void newRecruitent() throws Throwable
{
	driver.findElement(By.xpath(conpro.getProperty("ObjRecruitmentButton"))).click();
	driver.findElement(By.xpath(conpro.getProperty("ObjAddButton"))).click();
	driver.findElement(By.xpath(conpro.getProperty("ObjFname"))).sendKeys("Yuvraj");
	driver.findElement(By.xpath(conpro.getProperty("ObjMnane"))).sendKeys("N");
	driver.findElement(By.xpath(conpro.getProperty("ObjLname"))).sendKeys("Chavale");
	driver.findElement(By.xpath(conpro.getProperty("ObjEmail"))).sendKeys("uv@gmail.com");
    driver.findElement(By.xpath(conpro.getProperty("ObjContactNo"))).sendKeys("9834464435");
    driver.findElement(By.xpath(conpro.getProperty("ObjKeywords"))).sendKeys("Software Engineer");
    driver.findElement(By.xpath(conpro.getProperty("ObjComment"))).sendKeys("New Employee in Stallantis Team");
}

@AfterMethod
public void tearDown()
{
	driver.quit();
}
}
