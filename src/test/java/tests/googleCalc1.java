package tests;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.SearchPage;

public class googleCalc1 {


    @Test
    public void test1() {

        WebDriver driver = new ChromeDriver();
        driver.get("http://google.com");
        driver.findElement(By.cssSelector("input.gLFyf.gsfi")).sendKeys("Калькулятор", Keys.ENTER);
        driver.findElement(By.cssSelector("div[jsname='j93WEe']")).click();// (
        driver.findElement(By.cssSelector("div[jsname='N10B9']")).click();// 1
        driver.findElement(By.cssSelector("div[jsname='XSr6wc']")).click();// +
        driver.findElement(By.cssSelector("div[jsname='lVjWed']")).click();// 2
        driver.findElement(By.cssSelector("div[jsname='qCp9A']")).click();// )
        driver.findElement(By.cssSelector("div[jsname='YovRWb']")).click();// *
        driver.findElement(By.cssSelector("div[jsname='KN1kY']")).click();// 3
        driver.findElement(By.cssSelector("div[jsname='pPHzQc']")).click();// -
        driver.findElement(By.cssSelector("div[jsname='xAP7E']")).click();// 4
        driver.findElement(By.cssSelector("div[jsname='bkEvMb']")).click();// 0
        driver.findElement(By.cssSelector("div[jsname='WxTTNd']")).click();// /
        driver.findElement(By.cssSelector("div[jsname='Ax5wH']")).click();// 5
        driver.findElement(By.cssSelector("div[jsname='Pt8tGc']")).click();// =
        driver.quit();


    }
}
