package com.wk.sel.test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.util.List;
/* Count element should not be enabled when list is blank*/
public class toDoNegativeScenarios {
    WebDriver driver;

    String baseUrl="https://todomvc.com/examples/angular2/";

    @Test
    public void Test5() throws java.lang.InterruptedException,java.lang.IllegalMonitorStateException{
        int i;
        String status;
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        //      String baseUrl = "https://todomvc.com/examples/angular2/";
        driver.get(baseUrl);
        WebElement searchbox = driver.findElement(By.xpath("/html/body/todo-app/section/header/input"));
        searchbox.sendKeys("Basu");
        searchbox.sendKeys(Keys.ENTER);
        //wait(2);
        // new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.cssSelector("button.nsg-button"))).click();

        WebElement delete= driver.findElement(By.cssSelector(".todo-list > li:nth-child(1) > div:nth-child(1) > button:nth-child(3)"));

        JavascriptExecutor ex=(JavascriptExecutor)driver;
        ex.executeScript("arguments[0].click()", delete);
        // wait(5);
        // delete.click();
        try {
            WebElement elements=  driver.findElement(By.xpath("/html/body/todo-app/section/footer/span/strong")) ;
            status="Present";
        }
        catch (org.openqa.selenium.NoSuchElementException e) {
            status="Not Present";
        }
        driver.close();
        driver.quit();
        Assert.assertEquals(status,"Not Present");
        //  System.out.println(abc);
        // driver.close();
        // driver.quit();
    }
    /* Enter a a string with more than 10,000 character and it should fail*/
    @Test
    public void Test6() throws java.lang.InterruptedException{

        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        //      String baseUrl = "https://todomvc.com/examples/angular2/";
        driver.get(baseUrl);
        WebElement searchbox = driver.findElement(By.xpath("/html/body/todo-app/section/header/input"));
        searchbox.sendKeys("Naksjnkjsdncjnkcakasklcaalkncalkncjknacjnklcjakjcakjncaskjnackjkcjasnkajkjacnkjcankjnaskjascsnkjcs ncsajknaxkk jnkja sjkac n jkasnkjacnkjckjacskjjkcaskjalqwcvnvglsakj lxsnckjadj ljkn ll n clc \n" +
                "\n" +
                "v Naksjnkjsdncjnkcakasklcaalkncalkncjknacjnklcjakjcakjncaskjnackjkcjasnkajkjacnkjcankjnaskjascsnkjcs ncsajknaxkk jnkja sjkac n jkasnkjacnkjckjacskjjkcaskjalqwcvnvglsakj lxsnckjadj ljkn ll n clc \n" +
                "Naksjnkjsdncjnkcakasklcaalkncalkncjknacjnklcjakjcakjncaskjnackjkcjasnkajkjacnkjcankjnaskjascsnkjcs ncsajknaxkk jnkja sjkac n jkasnkjacnkjckjacskjjkcaskjalqwcvnvglsakj lxsnckjadj ljkn ll n clc \n" +
                "Naksjnkjsdncjnkcakasklcaalkncalkncjknacjnklcjakjcakjncaskjnackjkcjasnkajkjacnkjcankjnaskjascsnkjcs ncsajknaxkk jnkja sjkac n jkasnkjacnkjckjacskjjkcaskjalqwcvnvglsakj lxsnckjadj ljkn ll n clc \n" +
                "Naksjnkjsdncjnkcakasklcaalkncalkncjknacjnklcjakjcakjncaskjnackjkcjasnkajkjacnkjcankjnaskjascsnkjcs ncsajknaxkk jnkja sjkac n jkasnkjacnkjckjacskjjkcaskjalqwcvnvglsakj lxsnckjadj ljkn ll n clc \n" +
                "Naksjnkjsdncjnkcakasklcaalkncalkncjknacjnklcjakjcakjncaskjnackjkcjasnkajkjacnkjcankjnaskjascsnkjcs ncsajknaxkk jnkja sjkac n jkasnkjacnkjckjacskjjkcaskjalqwcvnvglsakj lxsnckjadj ljkn ll n clc \n" +
                "Naksjnkjsdncjnkcakasklcaalkncalkncjknacjnklcjakjcakjncaskjnackjkcjasnkajkjacnkjcankjnaskjascsnkjcs ncsajknaxkk jnkja sjkac n jkasnkjacnkjckjacskjjkcaskjalqwcvnvglsakj lxsnckjadj ljkn ll n clc \n" +
                "Naksjnkjsdncjnkcakasklcaalkncalkncjknacjnklcjakjcakjncaskjnackjkcjasnkajkjacnkjcankjnaskjascsnkjcs ncsajknaxkk jnkja sjkac n jkasnkjacnkjckjacskjjkcaskjalqwcvnvglsakj lxsnckjadj ljkn ll n clc \n" +
                "Naksjnkjsdncjnkcakasklcaalkncalkncjknacjnklcjakjcakjncaskjnackjkcjasnkajkjacnkjcankjnaskjascsnkjcs ncsajknaxkk jnkja sjkac n jkasnkjacnkjckjacskjjkcaskjalqwcvnvglsakj lxsnckjadj ljkn ll n clc \n" +
                "Naksjnkjsdncjnkcakasklcaalkncalkncjknacjnklcjakjcakjncaskjnackjkcjasnkajkjacnkjcankjnaskjascsnkjcs ncsajknaxkk jnkja sjkac n jkasnkjacnkjckjacskjjkcaskjalqwcvnvglsakj lxsnckjadj ljkn ll n clc \n" +
                "Naksjnkjsdncjnkcakasklcaalkncalkncjknacjnklcjakjcakjncaskjnackjkcjasnkajkjacnkjcankjnaskjascsnkjcs ncsajknaxkk jnkja sjkac n jkasnkjacnkjckjacskjjkcaskjalqwcvnvglsakj lxsnckjadj ljkn ll n clc \n" +
                "Naksjnkjsdncjnkcakasklcaalkncalkncjknacjnklcjakjcakjncaskjnackjkcjasnkajkjacnkjcankjnaskjascsnkjcs ncsajknaxkk jnkja sjkac n jkasnkjacnkjckjacskjjkcaskjalqwcvnvglsakj lxsnckjadj ljkn ll n clc \n" +
                "Naksjnkjsdncjnkcakasklcaalkncalkncjknacjnklcjakjcakjncaskjnackjkcjasnkajkjacnkjcankjnaskjascsnkjcs ncsajknaxkk jnkja sjkac n jkasnkjacnkjckjacskjjkcaskjalqwcvnvglsakj lxsnckjadj ljkn ll n clc \n" +
                "Naksjnkjsdncjnkcakasklcaalkncalkncjknacjnklcjakjcakjncaskjnackjkcjasnkajkjacnkjcankjnaskjascsnkjcs ncsajknaxkk jnkja sjkac n jkasnkjacnkjckjacskjjkcaskjalqwcvnvglsakj lxsnckjadj ljkn ll n clc \n" +
                "Naksjnkjsdncjnkcakasklcaalkncalkncjknacjnklcjakjcakjncaskjnackjkcjasnkajkjacnkjcankjnaskjascsnkjcs ncsajknaxkk jnkja sjkac n jkasnkjacnkjckjacskjjkcaskjalqwcvnvglsakj lxsnckjadj ljkn ll n clc \n" +
                "Naksjnkjsdncjnkcakasklcaalkncalkncjknacjnklcjakjcakjncaskjnackjkcjasnkajkjacnkjcankjnaskjascsnkjcs ncsajknaxkk jnkja sjkac n jkasnkjacnkjckjacskjjkcaskjalqwcvnvglsakj lxsnckjadj ljkn ll n clc \n" +
                "Naksjnkjsdncjnkcakasklcaalkncalkncjknacjnklcjakjcakjncaskjnackjkcjasnkajkjacnkjcankjnaskjascsnkjcs ncsajknaxkk jnkja sjkac n jkasnkjacnkjckjacskjjkcaskjalqwcvnvglsakj lxsnckjadj ljkn ll n clc \n" +
                "Naksjnkjsdncjnkcakasklcaalkncalkncjknacjnklcjakjcakjncaskjnackjkcjasnkajkjacnkjcankjnaskjascsnkjcs ncsajknaxkk jnkja sjkac n jkasnkjacnkjckjacskjjkcaskjalqwcvnvglsakj lxsnckjadj ljkn ll n clc \n" +
                "Naksjnkjsdncjnkcakasklcaalkncalkncjknacjnklcjakjcakjncaskjnackjkcjasnkajkjacnkjcankjnaskjascsnkjcs ncsajknaxkk jnkja sjkac n jkasnkjacnkjckjacskjjkcaskjalqwcvnvglsakj lxsnckjadj ljkn ll n clc \n" +
                "Naksjnkjsdncjnkcakasklcaalkncalkncjknacjnklcjakjcakjncaskjnackjkcjasnkajkjacnkjcankjnaskjascsnkjcs ncsajknaxkk jnkja sjkac n jkasnkjacnkjckjacskjjkcaskjalqwcvnvglsakj lxsnckjadj ljkn ll n clc \n" +
                "Naksjnkjsdncjnkcakasklcaalkncalkncjknacjnklcjakjcakjncaskjnackjkcjasnkajkjacnkjcankjnaskjascsnkjcs ncsajknaxkk jnkja sjkac n jkasnkjacnkjckjacskjjkcaskjalqwcvnvglsakj lxsnckjadj ljkn ll n clc \n" +
                "Naksjnkjsdncjnkcakasklcaalkncalkncjknacjnklcjakjcakjncaskjnackjkcjasnkajkjacnkjcankjnaskjascsnkjcs ncsajknaxkk jnkja sjkac n jkasnkjacnkjckjacskjjkcaskjalqwcvnvglsakj lxsnckjadj ljkn ll n clc \n" +
                "Naksjnkjsdncjnkcakasklcaalkncalkncjknacjnklcjakjcakjncaskjnackjkcjasnkajkjacnkjcankjnaskjascsnkjcs ncsajknaxkk jnkja sjkac n jkasnkjacnkjckjacskjjkcaskjalqwcvnvglsakj lxsnckjadj ljkn ll n clc \n" +
                "Naksjnkjsdncjnkcakasklcaalkncalkncjknacjnklcjakjcakjncaskjnackjkcjasnkajkjacnkjcankjnaskjascsnkjcs ncsajknaxkk jnkja sjkac n jkasnkjacnkjckjacskjjkcaskjalqwcvnvglsakj lxsnckjadj ljkn ll n clc \n" +
                "Naksjnkjsdncjnkcakasklcaalkncalkncjknacjnklcjakjcakjncaskjnackjkcjasnkajkjacnkjcankjnaskjascsnkjcs ncsajknaxkk jnkja sjkac n jkasnkjacnkjckjacskjjkcaskjalqwcvnvglsakj lxsnckjadj ljkn ll n clc \n" +
                "Naksjnkjsdncjnkcakasklcaalkncalkncjknacjnklcjakjcakjncaskjnackjkcjasnkajkjacnkjcankjnaskjascsnkjcs ncsajknaxkk jnkja sjkac n jkasnkjacnkjckjacskjjkcaskjalqwcvnvglsakj lxsnckjadj ljkn ll n clc \n" +
                "Naksjnkjsdncjnkcakasklcaalkncalkncjknacjnklcjakjcakjncaskjnackjkcjasnkajkjacnkjcankjnaskjascsnkjcs ncsajknaxkk jnkja sjkac n jkasnkjacnkjckjacskjjkcaskjalqwcvnvglsakj lxsnckjadj ljkn ll n clc \n" +
                "Naksjnkjsdncjnkcakasklcaalkncalkncjknacjnklcjakjcakjncaskjnackjkcjasnkajkjacnkjcankjnaskjascsnkjcs ncsajknaxkk jnkja sjkac n jkasnkjacnkjckjacskjjkcaskjalqwcvnvglsakj lxsnckjadj ljkn ll n clc \n" +
                "Naksjnkjsdncjnkcakasklcaalkncalkncjknacjnklcjakjcakjncaskjnackjkcjasnkajkjacnkjcankjnaskjascsnkjcs ncsajknaxkk jnkja sjkac n jkasnkjacnkjckjacskjjkcaskjalqwcvnvglsakj lxsnckjadj ljkn ll n clc \n" +
                "Naksjnkjsdncjnkcakasklcaalkncalkncjknacjnklcjakjcakjncaskjnackjkcjasnkajkjacnkjcankjnaskjascsnkjcs ncsajknaxkk jnkja sjkac n jkasnkjacnkjckjacskjjkcaskjalqwcvnvglsakj lxsnckjadj ljkn ll n clc \n" +
                "Naksjnkjsdncjnkcakasklcaalkncalkncjknacjnklcjakjcakjncaskjnackjkcjasnkajkjacnkjcankjnaskjascsnkjcs ncsajknaxkk jnkja sjkac n jkasnkjacnkjckjacskjjkcaskjalqwcvnvglsakj lxsnckjadj ljkn ll n clc \n" +
                "Naksjnkjsdncjnkcakasklcaalkncalkncjknacjnklcjakjcakjncaskjnackjkcjasnkajkjacnkjcankjnaskjascsnkjcs ncsajknaxkk jnkja sjkac n jkasnkjacnkjckjacskjjkcaskjalqwcvnvglsakj lxsnckjadj ljkn ll n clc \n" +
                "Naksjnkjsdncjnkcakasklcaalkncalkncjknacjnklcjakjcakjncaskjnackjkcjasnkajkjacnkjcankjnaskjascsnkjcs ncsajknaxkk jnkja sjkac n jkasnkjacnkjckjacskjjkcaskjalqwcvnvglsakj lxsnckjadj ljkn ll n clc \n" +
                "Naksjnkjsdncjnkcakasklcaalkncalkncjknacjnklcjakjcakjncaskjnackjkcjasnkajkjacnkjcankjnaskjascsnkjcs ncsajknaxkk jnkja sjkac n jkasnkjacnkjckjacskjjkcaskjalqwcvnvglsakj lxsnckjadj ljkn ll n clc \n" +
                "Naksjnkjsdncjnkcakasklcaalkncalkncjknacjnklcjakjcakjncaskjnackjkcjasnkajkjacnkjcankjnaskjascsnkjcs ncsajknaxkk jnkja sjkac n jkasnkjacnkjckjacskjjkcaskjalqwcvnvglsakj lxsnckjadj ljkn ll n clc \n" +
                "Naksjnkjsdncjnkcakasklcaalkncalkncjknacjnklcjakjcakjncaskjnackjkcjasnkajkjacnkjcankjnaskjascsnkjcs ncsajknaxkk jnkja sjkac n jkasnkjacnkjckjacskjjkcaskjalqwcvnvglsakj lxsnckjadj ljkn ll n clc \n" +
                "Naksjnkjsdncjnkcakasklcaalkncalkncjknacjnklcjakjcakjncaskjnackjkcjasnkajkjacnkjcankjnaskjascsnkjcs ncsajknaxkk jnkja sjkac n jkasnkjacnkjckjacskjjkcaskjalqwcvnvglsakj lxsnckjadj ljkn ll n clc \n" +
                "Naksjnkjsdncjnkcakasklcaalkncalkncjknacjnklcjakjcakjncaskjnackjkcjasnkajkjacnkjcankjnaskjascsnkjcs ncsajknaxkk jnkja sjkac n jkasnkjacnkjckjacskjjkcaskjalqwcvnvglsakj lxsnckjadj ljkn ll n clc \n" +
                "Naksjnkjsdncjnkcakasklcaalkncalkncjknacjnklcjakjcakjncaskjnackjkcjasnkajkjacnkjcankjnaskjascsnkjcs ncsajknaxkk jnkja sjkac n jkasnkjacnkjckjacskjjkcaskjalqwcvnvglsakj lxsnckjadj ljkn ll n clc \n" +
                "Naksjnkjsdncjnkcakasklcaalkncalkncjknacjnklcjakjcakjncaskjnackjkcjasnkajkjacnkjcankjnaskjascsnkjcs ncsajknaxkk jnkja sjkac n jkasnkjacnkjckjacskjjkcaskjalqwcvnvglsakj lxsnckjadj ljkn ll n clc \n" +
                "Naksjnkjsdncjnkcakasklcaalkncalkncjknacjnklcjakjcakjncaskjnackjkcjasnkajkjacnkjcankjnaskjascsnkjcs ncsajknaxkk jnkja sjkac n jkasnkjacnkjckjacskjjkcaskjalqwcvnvglsakj lxsnckjadj ljkn ll n clc \n" +
                "Naksjnkjsdncjnkcakasklcaalkncalkncjknacjnklcjakjcakjncaskjnackjkcjasnkajkjacnkjcankjnaskjascsnkjcs ncsajknaxkk jnkja sjkac n jkasnkjacnkjckjacskjjkcaskjalqwcvnvglsakj lxsnckjadj ljkn ll n clc \n" +
                "Naksjnkjsdncjnkcakasklcaalkncalkncjknacjnklcjakjcakjncaskjnackjkcjasnkajkjacnkjcankjnaskjascsnkjcs ncsajknaxkk jnkja sjkac n jkasnkjacnkjckjacskjjkcaskjalqwcvnvglsakj lxsnckjadj ljkn ll n clc \n" +
                "Naksjnkjsdncjnkcakasklcaalkncalkncjknacjnklcjakjcakjncaskjnackjkcjasnkajkjacnkjcankjnaskjascsnkjcs ncsajknaxkk jnkja sjkac n jkasnkjacnkjckjacskjjkcaskjalqwcvnvglsakj lxsnckjadj ljkn ll n clc \n" +
                "Naksjnkjsdncjnkcakasklcaalkncalkncjknacjnklcjakjcakjncaskjnackjkcjasnkajkjacnkjcankjnaskjascsnkjcs ncsajknaxkk jnkja sjkac n jkasnkjacnkjckjacskjjkcaskjalqwcvnvglsakj lxsnckjadj ljkn ll n clc \n" +
                "Naksjnkjsdncjnkcakasklcaalkncalkncjknacjnklcjakjcakjncaskjnackjkcjasnkajkjacnkjcankjnaskjascsnkjcs ncsajknaxkk jnkja sjkac n jkasnkjacnkjckjacskjjkcaskjalqwcvnvglsakj lxsnckjadj ljkn ll n clc \n" +
                "Naksjnkjsdncjnkcakasklcaalkncalkncjknacjnklcjakjcakjncaskjnackjkcjasnkajkjacnkjcankjnaskjascsnkjcs ncsajknaxkk jnkja sjkac n jkasnkjacnkjckjacskjjkcaskjalqwcvnvglsakj lxsnckjadj ljkn ll n clc \n" +
                "Naksjnkjsdncjnkcakasklcaalkncalkncjknacjnklcjakjcakjncaskjnackjkcjasnkajkjacnkjcankjnaskjascsnkjcs ncsajknaxkk jnkja sjkac n jkasnkjacnkjckjacskjjkcaskjalqwcvnvglsakj lxsnckjadj ljkn ll n clc \n" +
                "Naksjnkjsdncjnkcakasklcaalkncalkncjknacjnklcjakjcakjncaskjnackjkcjasnkajkjacnkjcankjnaskjascsnkjcs ncsajknaxkk jnkja sjkac n jkasnkjacnkjckjacskjjkcaskjalqwcvnvglsakj lxsnckjadj ljkn ll n clc \n" +
                "Naksjnkjsdncjnkcakasklcaalkncalkncjknacjnklcjakjcakjncaskjnackjkcjasnkajkjacnkjcankjnaskjascsnkjcs ncsajknaxkk jnkja sjkac n jkasnkjacnkjckjacskjjkcaskjalqwcvnvglsakj lxsnckjadj ljkn ll n clc \n" +
                "Naksjnkjsdncjnkcakasklcaalkncalkncjknacjnklcjakjcakjncaskjnackjkcjasnkajkjacnkjcankjnaskjascsnkjcs ncsajknaxkk jnkja sjkac n jkasnkjacnkjckjacskjjkcaskjalqwcvnvglsakj lxsnckjadj ljkn ll n clc \n" +
                "Naksjnkjsdncjnkcakasklcaalkncalkncjknacjnklcjakjcakjncaskjnackjkcjasnkajkjacnkjcankjnaskjascsnkjcs ncsajknaxkk jnkja sjkac n jkasnkjacnkjckjacskjjkcaskjalqwcvnvglsakj lxsnckjadj ljkn ll n clc \n" +
                "Naksjnkjsdncjnkcakasklcaalkncalkncjknacjnklcjakjcakjncaskjnackjkcjasnkajkjacnkjcankjnaskjascsnkjcs ncsajknaxkk jnkja sjkac n jkasnkjacnkjckjacskjjkcaskjalqwcvnvglsakj lxsnckjadj ljkn ll n clc \n" +
                "Naksjnkjsdncjnkcakasklcaalkncalkncjknacjnklcjakjcakjncaskjnackjkcjasnkajkjacnkjcankjnaskjascsnkjcs ncsajknaxkk jnkja sjkac n jkasnkjacnkjckjacskjjkcaskjalqwcvnvglsakj lxsnckjadj ljkn ll n clc \n" +
                "Naksjnkjsdncjnkcakasklcaalkncalkncjknacjnklcjakjcakjncaskjnackjkcjasnkajkjacnkjcankjnaskjascsnkjcs ncsajknaxkk jnkja sjkac n jkasnkjacnkjckjacskjjkcaskjalqwcvnvglsakj lxsnckjadj ljkn ll n clc \n" +
                "Naksjnkjsdncjnkcakasklcaalkncalkncjknacjnklcjakjcakjncaskjnackjkcjasnkajkjacnkjcankjnaskjascsnkjcs ncsajknaxkk jnkja sjkac n jkasnkjacnkjckjacskjjkcaskjalqwcvnvglsakj lxsnckjadj ljkn ll n clc \n" +
                "Naksjnkjsdncjnkcakasklcaalkncalkncjknacjnklcjakjcakjncaskjnackjkcjasnkajkjacnkjcankjnaskjascsnkjcs ncsajknaxkk jnkja sjkac n jkasnkjacnkjckjacskjjkcaskjalqwcvnvglsakj lxsnckjadj ljkn ll n clc \n" +
                "Naksjnkjsdncjnkcakasklcaalkncalkncjknacjnklcjakjcakjncaskjnackjkcjasnkajkjacnkjcankjnaskjascsnkjcs ncsajknaxkk jnkja sjkac n jkasnkjacnkjckjacskjjkcaskjalqwcvnvglsakj lxsnckjadj ljkn ll n clc \n" +
                "Naksjnkjsdncjnkcakasklcaalkncalkncjknacjnklcjakjcakjncaskjnackjkcjasnkajkjacnkjcankjnaskjascsnkjcs ncsajknaxkk jnkja sjkac n jkasnkjacnkjckjacskjjkcaskjalqwcvnvglsakj lxsnckjadj ljkn ll n clc \n" +
                "Naksjnkjsdncjnkcakasklcaalkncalkncjknacjnklcjakjcakjncaskjnackjkcjasnkajkjacnkjcankjnaskjascsnkjcs ncsajknaxkk jnkja sjkac n jkasnkjacnkjckjacskjjkcaskjalqwcvnvglsakj lxsnckjadj ljkn ll n clc \n" +
                "Naksjnkjsdncjnkcakasklcaalkncalkncjknacjnklcjakjcakjncaskjnackjkcjasnkajkjacnkjcankjnaskjascsnkjcs ncsajknaxkk jnkja sjkac n jkasnkjacnkjckjacskjjkcaskjalqwcvnvglsakj lxsnckjadj ljkn ll n clc \n" +
                "Naksjnkjsdncjnkcakasklcaalkncalkncjknacjnklcjakjcakjncaskjnackjkcjasnkajkjacnkjcankjnaskjascsnkjcs ncsajknaxkk jnkja sjkac n jkasnkjacnkjckjacskjjkcaskjalqwcvnvglsakj lxsnckjadj ljkn ll n clc \n" +
                "Naksjnkjsdncjnkcakasklcaalkncalkncjknacjnklcjakjcakjncaskjnackjkcjasnkajkjacnkjcankjnaskjascsnkjcs ncsajknaxkk jnkja sjkac n jkasnkjacnkjckjacskjjkcaskjalqwcvnvglsakj lxsnckjadj ljkn ll n clc \n" +
                "Naksjnkjsdncjnkcakasklcaalkncalkncjknacjnklcjakjcakjncaskjnackjkcjasnkajkjacnkjcankjnaskjascsnkjcs ncsajknaxkk jnkja sjkac n jkasnkjacnkjckjacskjjkcaskjalqwcvnvglsakj lxsnckjadj ljkn ll n clc \n" +
                "Naksjnkjsdncjnkcakasklcaalkncalkncjknacjnklcjakjcakjncaskjnackjkcjasnkajkjacnkjcankjnaskjascsnkjcs ncsajknaxkk jnkja sjkac n jkasnkjacnkjckjacskjjkcaskjalqwcvnvglsakj lxsnckjadj ljkn ll n clc \n" +
                "Naksjnkjsdncjnkcakasklcaalkncalkncjknacjnklcjakjcakjncaskjnackjkcjasnkajkjacnkjcankjnaskjascsnkjcs ncsajknaxkk jnkja sjkac n jkasnkjacnkjckjacskjjkcaskjalqwcvnvglsakj lxsnckjadj ljkn ll n clc \n" +
                "Naksjnkjsdncjnkcakasklcaalkncalkncjknacjnklcjakjcakjncaskjnackjkcjasnkajkjacnkjcankjnaskjascsnkjcs ncsajknaxkk jnkja sjkac n jkasnkjacnkjckjacskjjkcaskjalqwcvnvglsakj lxsnckjadj ljkn ll n clc \n" +
                "Naksjnkjsdncjnkcakasklcaalkncalkncjknacjnklcjakjcakjncaskjnackjkcjasnkajkjacnkjcankjnaskjascsnkjcs ncsajknaxkk jnkja sjkac n jkasnkjacnkjckjacskjjkcaskjalqwcvnvglsakj lxsnckjadj ljkn ll n clc \n" +
                "Naksjnkjsdncjnkcakasklcaalkncalkncjknacjnklcjakjcakjncaskjnackjkcjasnkajkjacnkjcankjnaskjascsnkjcs ncsajknaxkk jnkja sjkac n jkasnkjacnkjckjacskjjkcaskjalqwcvnvglsakj lxsnckjadj ljkn ll n clc \n" +
                "Naksjnkjsdncjnkcakasklcaalkncalkncjknacjnklcjakjcakjncaskjnackjkcjasnkajkjacnkjcankjnaskjascsnkjcs ncsajknaxkk jnkja sjkac n jkasnkjacnkjckjacskjjkcaskjalqwcvnvglsakj lxsnckjadj ljkn ll n clc \n" +
                "Naksjnkjsdncjnkcakasklcaalkncalkncjknacjnklcjakjcakjncaskjnackjkcjasnkajkjacnkjcankjnaskjascsnkjcs ncsajknaxkk jnkja sjkac n jkasnkjacnkjckjacskjjkcaskjalqwcvnvglsakj lxsnckjadj ljkn ll n clc \n" +
                "Naksjnkjsdncjnkcakasklcaalkncalkncjknacjnklcjakjcakjncaskjnackjkcjasnkajkjacnkjcankjnaskjascsnkjcs ncsajknaxkk jnkja sjkac n jkasnkjacnkjckjacskjjkcaskjalqwcvnvglsakj lxsnckjadj ljkn ll n clc \n" +
                "Naksjnkjsdncjnkcakasklcaalkncalkncjknacjnklcjakjcakjncaskjnackjkcjasnkajkjacnkjcankjnaskjascsnkjcs ncsajknaxkk jnkja sjkac n jkasnkjacnkjckjacskjjkcaskjalqwcvnvglsakj lxsnckjadj ljkn ll n clc \n" +
                "Naksjnkjsdncjnkcakasklcaalkncalkncjknacjnklcjakjcakjncaskjnackjkcjasnkajkjacnkjcankjnaskjascsnkjcs ncsajknaxkk jnkja sjkac n jkasnkjacnkjckjacskjjkcaskjalqwcvnvglsakj lxsnckjadj ljkn ll n clc \n" +
                "Naksjnkjsdncjnkcakasklcaalkncalkncjknacjnklcjakjcakjncaskjnackjkcjasnkajkjacnkjcankjnaskjascsnkjcs ncsajknaxkk jnkja sjkac n jkasnkjacnkjckjacskjjkcaskjalqwcvnvglsakj lxsnckjadj ljkn ll n clc \n" +
                "Naksjnkjsdncjnkcakasklcaalkncalkncjknacjnklcjakjcakjncaskjnackjkcjasnkajkjacnkjcankjnaskjascsnkjcs ncsajknaxkk jnkja sjkac n jkasnkjacnkjckjacskjjkcaskjalqwcvnvglsakj lxsnckjadj ljkn ll n clc \n" +
                "Naksjnkjsdncjnkcakasklcaalkncalkncjknacjnklcjakjcakjncaskjnackjkcjasnkajkjacnkjcankjnaskjascsnkjcs ncsajknaxkk jnkja sjkac n jkasnkjacnkjckjacskjjkcaskjalqwcvnvglsakj lxsnckjadj ljkn ll n clc \n" +
                "Naksjnkjsdncjnkcakasklcaalkncalkncjknacjnklcjakjcakjncaskjnackjkcjasnkajkjacnkjcankjnaskjascsnkjcs ncsajknaxkk jnkja sjkac n jkasnkjacnkjckjacskjjkcaskjalqwcvnvglsakj lxsnckjadj ljkn ll n clc \n" +
                "Naksjnkjsdncjnkcakasklcaalkncalkncjknacjnklcjakjcakjncaskjnackjkcjasnkajkjacnkjcankjnaskjascsnkjcs ncsajknaxkk jnkja sjkac n jkasnkjacnkjckjacskjjkcaskjalqwcvnvglsakj lxsnckjadj ljkn ll n clc \n" +
                "Naksjnkjsdncjnkcakasklcaalkncalkncjknacjnklcjakjcakjncaskjnackjkcjasnkajkjacnkjcankjnaskjascsnkjcs ncsajknaxkk jnkja sjkac n jkasnkjacnkjckjacskjjkcaskjalqwcvnvglsakj lxsnckjadj ljkn ll n clc \n" +
                "Naksjnkjsdncjnkcakasklcaalkncalkncjknacjnklcjakjcakjncaskjnackjkcjasnkajkjacnkjcankjnaskjascsnkjcs ncsajknaxkk jnkja sjkac n jkasnkjacnkjckjacskjjkcaskjalqwcvnvglsakj lxsnckjadj ljkn ll n clc \n" +
                "Naksjnkjsdncjnkcakasklcaalkncalkncjknacjnklcjakjcakjncaskjnackjkcjasnkajkjacnkjcankjnaskjascsnkjcs ncsajknaxkk jnkja sjkac n jkasnkjacnkjckjacskjjkcaskjalqwcvnvglsakj lxsnckjadj ljkn ll n clc \n" +
                "Naksjnkjsdncjnkcakasklcaalkncalkncjknacjnklcjakjcakjncaskjnackjkcjasnkajkjacnkjcankjnaskjascsnkjcs ncsajknaxkk jnkja sjkac n jkasnkjacnkjckjacskjjkcaskjalqwcvnvglsakj lxsnckjadj ljkn ll n clc \n" +
                "Naksjnkjsdncjnkcakasklcaalkncalkncjknacjnklcjakjcakjncaskjnackjkcjasnkajkjacnkjcankjnaskjascsnkjcs ncsajknaxkk jnkja sjkac n jkasnkjacnkjckjacskjjkcaskjalqwcvnvglsakj lxsnckjadj ljkn ll n clc \n" +
                "Naksjnkjsdncjnkcakasklcaalkncalkncjknacjnklcjakjcakjncaskjnackjkcjasnkajkjacnkjcankjnaskjascsnkjcs ncsajknaxkk jnkja sjkac n jkasnkjacnkjckjacskjjkcaskjalqwcvnvglsakj lxsnckjadj ljkn ll n clc \n" +
                "\n");
        searchbox.sendKeys(Keys.ENTER);
        driver.close();
        driver.quit();
    }
    /*edit and clear a field in the list. The count should be reduced by 1*/
    @Test
    public void Test7() throws java.lang.InterruptedException{
        int i;

        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get(baseUrl);
        WebElement searchbox = driver.findElement(By.xpath("/html/body/todo-app/section/header/input"));
        for (i=1; i<=4;i++) {
            searchbox.sendKeys("Arijit");
            searchbox.sendKeys(Keys.ENTER);


        }
        Actions action = new Actions(driver);
        String elementCount= driver.findElement(By.xpath("/html/body/todo-app/section/footer/span/strong")).getText();
        int quantity = Integer.parseInt(elementCount);
        //String Labeltext= driver.findElement(By.xpath("/html/body/todo-app/section/section/ul/li[2]/div/label")).getText();
       WebElement elementLocator = driver.findElement(By.xpath("/html/body/todo-app/section/section/ul/li[2]/div/label"));
        action.doubleClick(elementLocator).perform();
        driver.findElement(By.xpath("/html/body/todo-app/section/section/ul/li[2]/input")).clear();
        driver.close();
        driver.quit();

        Assert.assertEquals(i-2, quantity);
        //driver.close();
        //driver.quit();
    }
    /*edit and clear a field in the list and then refresh the page. The content of the list should stay the same and count should reduce By 1*/
    @Test
    public void Test8() throws java.lang.InterruptedException{
        int i;

        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get(baseUrl);
        WebElement searchbox = driver.findElement(By.xpath("/html/body/todo-app/section/header/input"));
        for (i=1; i<=4;i++) {
            searchbox.sendKeys("Arijit");
            searchbox.sendKeys(Keys.ENTER);


        }
        Actions action = new Actions(driver);
        String elementCount= driver.findElement(By.xpath("/html/body/todo-app/section/footer/span/strong")).getText();
        int quantity = Integer.parseInt(elementCount);
        //String Labeltext= driver.findElement(By.xpath("/html/body/todo-app/section/section/ul/li[2]/div/label")).getText();
        WebElement elementLocator = driver.findElement(By.xpath("/html/body/todo-app/section/section/ul/li[2]/div/label"));
        action.doubleClick(elementLocator).perform();
        driver.findElement(By.xpath("/html/body/todo-app/section/section/ul/li[2]/input")).clear();
        driver.navigate().refresh();
        driver.close();
        driver.quit();
        Assert.assertEquals(i-2, quantity);

    }



}
