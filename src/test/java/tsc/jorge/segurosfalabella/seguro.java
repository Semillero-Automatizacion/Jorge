package tsc.jorge.segurosfalabella;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class seguro {

	static WebDriver driver;
	String url = "https://compratusoat.com.co/";
	
	
	
	@Test
	public void test() throws InterruptedException {
		
		WebElement placa = driver.findElement(By.xpath("//*[@id=\"pro2\"]/div[2]/input"));
		placa.sendKeys("DNR327");
		WebElement correo = driver.findElement(By.xpath("//*[@id=\"mail\"]"));
		correo.sendKeys("joshsdfsddsfdsf@gmail.com");
		WebElement nombre = driver.findElement(By.xpath("//*[@id=\"name\"]"));
		nombre.sendKeys("Josh");
		WebElement apellido = driver.findElement(By.xpath("//*[@id=\"apellidos\"]"));
		apellido.sendKeys("serrano");
		WebElement celular = driver.findElement(By.xpath("//*[@id=\"phone\"]"));
		celular.sendKeys("3131432457");
		WebElement terminos = driver.findElement(By.xpath("//*[@id=\"accept\"]"));
		terminos.click();
		Thread.sleep(1000);
		WebElement terminos2 = driver.findElement(By.xpath("//*[@id=\"cookies\"]/button"));
		terminos2.click();
		Thread.sleep(1000);
		WebElement terminos3 = driver.findElement(By.xpath("//*[@id=\"modalTerminos\"]/div/div/div[3]/button[2]"));
		terminos3.click();
		Thread.sleep(1000);
		WebElement cotizar = driver.findElement(By.xpath("//*[@id=\"btsubmit\"]"));
		cotizar.click();
		WebElement escoger1 = driver.findElement(By.xpath("//*[@id=\"test5\"]"));
		escoger1.click();
		WebElement siguiente = driver.findElement(By.xpath("//*[@id=\"paso1\"]/div[5]/div/div[2]/input[1]"));
		siguiente.click();
		Thread.sleep(4000);
		WebElement cedula = driver.findElement(By.xpath("//*[@id=\"cedula\"]"));
		cedula.sendKeys("11412350");
		Thread.sleep(8000);
		WebElement ciudad1 = driver.findElement(By.xpath("//*[@id=\"inputSelect\"]"));
		ciudad1.click();
		ciudad1.sendKeys("Bogota D.C.");		
		WebElement direccion = driver.findElement(By.xpath("//*[@id=\"addres\"]"));
		direccion.sendKeys("calle 31 45 63");
		WebElement siguiente1 = driver.findElement(By.xpath("//input[@class='btn btn-primary btn-green btn-interno fw-700']"));
		siguiente1.click();
		Thread.sleep(8000);
		WebElement noGracias = driver.findElement(By.xpath("//label[@class='radioButton no-gracias']//span[@class='checkmark']"));
		noGracias.click();
		WebElement siguiente2 = driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[4]/div[1]/div[2]/input[1]"));
		siguiente2.click();
		
		
		
	}
	
	@Before
	public void before() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get(url);
	    
	    Thread.sleep(8000);
	}
		
	
	
	@After
	public void after() {
		
	}
}
