package tests;

import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.SearchPage1;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class googleCalc1 {

    private static WebDriver driver;
    private static SearchPage1 searchPage1;

    @BeforeAll
    public static void init() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
        searchPage1 = new SearchPage1(driver);
    }

    @Test
    @DisplayName("Проверка операций с целыми числами")
    public void test1() {
        driver.get("http://google.com");
        searchPage1.search("Калькулятор");
        searchPage1.clickOpenBr(); //(
        searchPage1.clickOne();// 1
        searchPage1.clickPlus();// +
        searchPage1.clicktwo();// 2
        searchPage1.clickCloseBr();// )
        searchPage1.clickmult();// *
        searchPage1.clickthree();// 3
        searchPage1.clickminus();// -
        searchPage1.clickfour();// 4
        searchPage1.clickzero();// 0
        searchPage1.clickdivision();// /
        searchPage1.clickfive();// 5
        searchPage1.clickequall();// =
        assertEquals("(1 + 2) × 3 - 40 ÷ 5 =", searchPage1.getExp());
        assertEquals("1", searchPage1.getResult());
    }

    @Test
    @DisplayName("Проверка деления на 0")
    public void test2() {
        driver.get("http://google.com");
        searchPage1.search("Калькулятор");
        searchPage1.clicksix();// 6
        searchPage1.clickdivision();// /
        searchPage1.clickzero();// 0
        searchPage1.clickequall();// =
        assertEquals("6 ÷ 0 =", searchPage1.getExp());
        assertEquals("Infinity", searchPage1.getResult());
    }

    @AfterAll
    public static void teardown() {
           driver.quit();
    }
}
