package cadastro.driver;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navegador {

	private static WebDriver driver;

	public static WebDriver driver() {
		return driver;
	}

	public void abrirNavegador() {
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.drogariasaopaulo.com.br/login");

	}

	public void escrever(By elemento, String texto) {

		driver.findElement(elemento).sendKeys(texto);

	}

	public void clicar(By elemento) {

		driver.findElement(elemento).click();
		;

	}
	public void fecharNavegador() {

		driver.quit();

	}
	
	public void screenShot(String nomeEvidencia) throws IOException {


		TakesScreenshot scrShot = (TakesScreenshot) driver;
		File scrFile = scrShot.getScreenshotAs(OutputType.FILE);
		File destFile = new File("./Evidencias/" + nomeEvidencia + ".png");
		FileUtils.copyFile(scrFile, destFile);


		}

}