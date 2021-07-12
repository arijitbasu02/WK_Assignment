package com.wk.sel.test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.junit.Assert.assertTrue;

public class todotest1 {
    WebDriver driver;

    String baseUrl="https://todomvc.com/examples/angular2/";
/*To Enter One value to the ToDO List*/

    @Test
    public void Test1() throws java.lang.InterruptedException{

        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
  //      String baseUrl = "https://todomvc.com/examples/angular2/";
        driver.get(baseUrl);
       //driver.wait(5);
        //WebElement searchbox = driver.findElement(By.className("new-todo ng-pristine ng-valid ng-touched"));
         WebElement searchbox = driver.findElement(By.xpath("/html/body/todo-app/section/header/input"));
      //assertTrue(searchbox.isDisplayed());
        searchbox.sendKeys("Arijit");
        searchbox.sendKeys(Keys.ENTER);
       driver.close();
        driver.quit();
    }
/* To Enter Multiple Value in a loop in ToDO List*/
    @Test
    public void Test2() throws java.lang.InterruptedException{
        int i;
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        //      String baseUrl = "https://todomvc.com/examples/angular2/";
        driver.get(baseUrl);
        WebElement searchbox = driver.findElement(By.xpath("/html/body/todo-app/section/header/input"));
        for (i=1; i<=120;i++) {
            searchbox.sendKeys("Arijit");
            searchbox.sendKeys(Keys.ENTER);


        }

        String elementCount= driver.findElement(By.xpath("/html/body/todo-app/section/footer/span/strong")).getText();
        int quantity = Integer.parseInt(elementCount);

        Assert.assertEquals(i-1, quantity);
         driver.close();
         driver.quit();
    }
    /*To remove a value in ToDo List and make sure counts reflects fine*/
    @Test
    public void Test3() throws java.lang.InterruptedException{
        int i;
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        //      String baseUrl = "https://todomvc.com/examples/angular2/";
        driver.get(baseUrl);
        WebElement searchbox = driver.findElement(By.xpath("/html/body/todo-app/section/header/input"));

        for (i=1; i<=4;i++) {
            searchbox.sendKeys("Basu");
            searchbox.sendKeys(Keys.ENTER);


        }

        // new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.cssSelector("button.nsg-button"))).click();

        WebElement delete= driver.findElement(By.cssSelector(".todo-list > li:nth-child(1) > div:nth-child(1) > button:nth-child(3)"));

        JavascriptExecutor ex=(JavascriptExecutor)driver;
        ex.executeScript("arguments[0].click()", delete);
        // wait(5);
        // delete.click();
        String elementCount= driver.findElement(By.xpath("/html/body/todo-app/section/footer/span/strong")).getText();
        int quantity = Integer.parseInt(elementCount);
        driver.close();
        driver.quit();
        Assert.assertEquals(i-2, quantity);

    }
    /* To Scratch off a todo list elements and verify the count*/
       @Test
       public void Test4() throws java.lang.InterruptedException{
            int i;
           WebDriverManager.chromedriver().setup();
           WebDriver driver= new ChromeDriver();
           //      String baseUrl = "https://todomvc.com/examples/angular2/";
           driver.get(baseUrl);
           WebElement searchbox = driver.findElement(By.xpath("/html/body/todo-app/section/header/input"));

           for (i=1; i<=4;i++) {
               searchbox.sendKeys("Basu");
               searchbox.sendKeys(Keys.ENTER);


           }
           WebElement checkBox= driver.findElement(By.xpath("/html/body/todo-app/section/section/ul/li[1]/div/input"));
           checkBox.click();
           String elementCount= driver.findElement(By.xpath("/html/body/todo-app/section/footer/span/strong")).getText();
           int quantity = Integer.parseInt(elementCount);
           driver.close();
           driver.quit();
           Assert.assertEquals(i-2, quantity);

       }








}
