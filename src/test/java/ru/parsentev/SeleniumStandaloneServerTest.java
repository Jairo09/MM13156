package ru.parsentev;

import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.Selenium;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

import static org.hamcrest.core.Is.is;
import org.junit.Assert;
import static org.junit.Assert.assertThat;
import org.openqa.selenium.Platform;
import org.openqa.selenium.support.ui.Select;

/**
 * Tests for selenium standalone server.
 * @author parsentev
 * @since 19.11.2015
 */
public class SeleniumStandaloneServerTest {
 

    @Test
    public void executeInternetExplorer() throws MalformedURLException {
       DesiredCapabilities capability = DesiredCapabilities.internetExplorer();
       capability.setBrowserName("internet explorer");
       capability.setPlatform(Platform.ANY);
       WebDriver driver = new RemoteWebDriver( new URL("http://localhost:13333/wd/hub"), capability);
       driver.manage().window().maximize();
        //this.PruebaUno(driver);
        this.PruebaDos(driver);
        this.PruebaTres(driver);
        //this.PruebaCuatro(driver);
        this.PruebaCinco(driver);
        //this.PruebaSeis(driver);
        this.PruebaSiete(driver);
        this.PruebaOcho(driver);
        this.PruebaNueve(driver);
        this.PruebaDiez(driver);
        this.PruebaOnce(driver);
        driver.close();
    }
    
      @Test
    public void executeFirefoxDriver() throws MalformedURLException {
       DesiredCapabilities capability = DesiredCapabilities.firefox();
       capability.setBrowserName("firefox");
       capability.setPlatform(Platform.ANY);
       WebDriver driver = new RemoteWebDriver( new URL("http://localhost:13333/wd/hub"), capability);
       driver.manage().window().maximize();
        //this.PruebaUno(driver);
        this.PruebaDos(driver);
        this.PruebaTres(driver);
        //this.PruebaCuatro(driver);
        this.PruebaCinco(driver);
        //this.PruebaSeis(driver);
        this.PruebaSiete(driver);
        this.PruebaOcho(driver);
        this.PruebaNueve(driver);
        this.PruebaDiez(driver);
        this.PruebaOnce(driver);
        driver.close();
    }
    
    

     @Test
    public void executeChromeDriver() throws MalformedURLException {
        DesiredCapabilities capability = DesiredCapabilities.chrome();
        capability.setPlatform(Platform.ANY);
        WebDriver driver = new RemoteWebDriver( new URL("http://localhost:13333/wd/hub"), capability);
        driver.manage().window().maximize();
       
        //this.PruebaUno(driver);
        this.PruebaDos(driver);
        this.PruebaTres(driver);
        //this.PruebaCuatro(driver);
        this.PruebaCinco(driver);
        //this.PruebaSeis(driver);
        this.PruebaSiete(driver);
        this.PruebaOcho(driver);
        this.PruebaNueve(driver);
        this.PruebaDiez(driver);
        this.PruebaOnce(driver);
        driver.close();
   
    }
    
    
    //LOGIN
    private void PruebaDos(final WebDriver driver) throws MalformedURLException {
       
        
        driver.get("http://157.245.93.119/login");
        WebElement nombre = driver.findElement(By.id("email"));
        nombre.sendKeys("admin@gmail.com");
        driver.findElement(By.id("password")).sendKeys("EoMmTa14");
        // Doy click en el boton submit
	WebElement boton = driver.findElement(By.className("btn"));
	boton.click();
          
        
        //Assert.assertEquals("http//157.245.93.119", driver.getCurrentUrl());
    }
    //OPCION REGISTRAR USUARIO
    private void PruebaTres(WebDriver driver) throws MalformedURLException {
       
        WebElement btnRegister = driver.findElement(By.name("registerUser"));
        btnRegister.click();
       try {
         Thread.sleep(2000);
       
       }catch (InterruptedException ex) {
              Logger.getLogger(SeleniumStandaloneServerTest.class.getName()).log(Level.SEVERE, null, ex);
       }
    }
    
    //REGISTRAR
    private void PruebaCuatro(WebDriver driver) throws MalformedURLException {
       
        WebElement nombre = driver.findElement(By.name("name"));
        nombre.sendKeys("Luis Flores");
        WebElement correo = driver.findElement(By.name("email"));
        correo.sendKeys("flores@gmail.com");
        Select lista = new Select (driver.findElement(By.id("rol"))  );
        lista.selectByValue("2");
        WebElement contrasenia = driver.findElement(By.id("password"));
        contrasenia.sendKeys("qwerty12345");
        WebElement contraseniaConf = driver.findElement(By.id("password-confirm"));
        contraseniaConf.sendKeys("qwerty12345");
        WebElement btnEnviar = driver.findElement(By.name("enviar"));
        btnEnviar.click();
        
        WebElement notifi = driver.findElement(By.name("alertSuccess"));
       // Assert.assertTrue(notifi.isEnabled());
       try {
         Thread.sleep(2000);
         driver.quit();
       }catch (InterruptedException ex) {
              Logger.getLogger(SeleniumStandaloneServerTest.class.getName()).log(Level.SEVERE, null, ex);
       }
    }
    
    //ALUMNO
    private void PruebaCinco(final WebDriver driver) throws MalformedURLException {
        WebElement nombre = driver.findElement(By.name("name"));
        nombre.sendKeys("Jonathan Matínez");
        WebElement correo = driver.findElement(By.name("email"));
        correo.sendKeys("martinez@gmail.com");
        Select lista = new Select (driver.findElement(By.id("rol"))  );
        lista.selectByValue("3");
        WebElement contrasenia = driver.findElement(By.id("password"));
        contrasenia.sendKeys("qwerty12345");
        WebElement contraseniaConf = driver.findElement(By.id("password-confirm"));
        contraseniaConf.sendKeys("qwerty12345");
        WebElement btnEnviar = driver.findElement(By.name("enviar"));
        btnEnviar.click();
        
        WebElement notifi = driver.findElement(By.name("alertSuccess"));
       // Assert.assertTrue(notifi.isEnabled());
       try {
         Thread.sleep(2000);
         //driver.quit();
       }catch (InterruptedException ex) {
              Logger.getLogger(SeleniumStandaloneServerTest.class.getName()).log(Level.SEVERE, null, ex);
       }
      
    }
    
    private void PruebaSeis(final WebDriver driver) throws MalformedURLException {
        WebElement nombre = driver.findElement(By.name("name"));
        nombre.sendKeys("Mario González");
        WebElement correo = driver.findElement(By.name("email"));
        correo.sendKeys("gonzalez@gmail.com");
        Select lista = new Select (driver.findElement(By.id("rol"))  );
        lista.selectByValue("3");
        WebElement contrasenia = driver.findElement(By.id("password"));
        contrasenia.sendKeys("qwerty12345");
        WebElement contraseniaConf = driver.findElement(By.id("password-confirm"));
        contraseniaConf.sendKeys("qwerty12345");
        WebElement btnEnviar = driver.findElement(By.name("enviar"));
        btnEnviar.click();
        
        WebElement notifi = driver.findElement(By.name("alertSuccess"));
       // Assert.assertTrue(notifi.isEnabled());
       try {
         Thread.sleep(2000);
         driver.quit();
       }catch (InterruptedException ex) {
              Logger.getLogger(SeleniumStandaloneServerTest.class.getName()).log(Level.SEVERE, null, ex);
       }
    }
    //BOTON GESTION
    private void PruebaSiete(WebDriver driver) throws MalformedURLException {
        try {
         Thread.sleep(5000);
       
       }catch (InterruptedException ex) {
              Logger.getLogger(SeleniumStandaloneServerTest.class.getName()).log(Level.SEVERE, null, ex);
       }
        WebElement btnGestionar = driver.findElement(By.name("gestion"));
        btnGestionar.click();
       try {
         Thread.sleep(2000);
       
       }catch (InterruptedException ex) {
              Logger.getLogger(SeleniumStandaloneServerTest.class.getName()).log(Level.SEVERE, null, ex);
       }
    }
    
    private void PruebaOcho(WebDriver driver) throws MalformedURLException {
       
        WebElement buscar = driver.findElement(By.name("buscarUser"));
        buscar.sendKeys("Jonathan");
       try {
         Thread.sleep(2000);
       
       }catch (InterruptedException ex) {
              Logger.getLogger(SeleniumStandaloneServerTest.class.getName()).log(Level.SEVERE, null, ex);
       }
    }
    
    private void PruebaNueve(WebDriver driver) throws MalformedURLException {
       
        WebElement btnEditar = driver.findElement(By.name("editarUsuario"));
        btnEditar.click();
       /*
        WebElement NombreUsuario = driver.findElement(By.id("nombreUsuario"));
        NombreUsuario.clear();
        NombreUsuario.sendKeys("Hugo Gonzalez");
        */
         try {
              Thread.sleep(2000);
          } catch (InterruptedException ex) {
              Logger.getLogger(SeleniumStandaloneServerTest.class.getName()).log(Level.SEVERE, null, ex);
          }
        WebElement EmailUsuario = driver.findElement(By.id("emailUsuario"));
        EmailUsuario.clear();
        EmailUsuario.sendKeys("correoeditado@gmail.com");
        
        WebElement btnActualizar = driver.findElement(By.name("actualizarUsuario"));
        btnActualizar.click();
          try {
              Thread.sleep(5000);
          } catch (InterruptedException ex) {
              Logger.getLogger(SeleniumStandaloneServerTest.class.getName()).log(Level.SEVERE, null, ex);
          }
       WebElement btnAE = driver.findElement(By.className("swal2-confirm"));
        btnAE.click();
        try {
              Thread.sleep(5000);
          } catch (InterruptedException ex) {
              Logger.getLogger(SeleniumStandaloneServerTest.class.getName()).log(Level.SEVERE, null, ex);
          }
       
    }
    
     private void PruebaDiez(WebDriver driver) throws MalformedURLException {
       
        WebElement btnEliminar = driver.findElement(By.name("eliminarUsuario"));
        btnEliminar.click();
        try {
         Thread.sleep(5000);
       
       }catch (InterruptedException ex) {
              Logger.getLogger(SeleniumStandaloneServerTest.class.getName()).log(Level.SEVERE, null, ex);
       }
        
        WebElement btnC = driver.findElement(By.className("swal2-confirm"));
        btnC.click();
        
       try {
         Thread.sleep(2000);
       
       }catch (InterruptedException ex) {
              Logger.getLogger(SeleniumStandaloneServerTest.class.getName()).log(Level.SEVERE, null, ex);
       }
       
       WebElement btnCC = driver.findElement(By.className("swal2-confirm"));
        btnCC.click();
     }
     
     private void PruebaOnce(WebDriver driver) throws MalformedURLException {
       
        WebElement nav = driver.findElement(By.id("navbarDropdown"));
        nav.click();
        try {
         Thread.sleep(2000);
       
       }catch (InterruptedException ex) {
              Logger.getLogger(SeleniumStandaloneServerTest.class.getName()).log(Level.SEVERE, null, ex);
       }
        
        WebElement btnC = driver.findElement(By.name("cerrarSesion"));
        btnC.click();
        
       try {
         Thread.sleep(2000);
       
       }catch (InterruptedException ex) {
              Logger.getLogger(SeleniumStandaloneServerTest.class.getName()).log(Level.SEVERE, null, ex);
       }
     }

}

