package tests;

import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.ElementsPage;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalcTests {

    private static WebDriver driver;
    private static ElementsPage elementsPage;

    @BeforeEach
    public void init() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
        elementsPage = new ElementsPage(driver);
    }

    @Test
    @DisplayName("Проверка операций с целыми числами")
    public void test1() {
        driver.get("http://google.com");
        elementsPage.search("Калькулятор");
        elementsPage.clickOpenBr(); //(
        elementsPage.clickOne();// 1
        elementsPage.clickPlus();// +
        elementsPage.clicktwo();// 2
        elementsPage.clickCloseBr();// )
        elementsPage.clickmult();// *
        elementsPage.clickthree();// 3
        elementsPage.clickminus();// -
        elementsPage.clickfour();// 4
        elementsPage.clickzero();// 0
        elementsPage.clickdivision();// /
        elementsPage.clickfive();// 5
        elementsPage.clickequall();// =
        assertEquals("(1 + 2) × 3 - 40 ÷ 5 =", elementsPage.getExp());
        assertEquals("1", elementsPage.getResult());
    }

    @Test
    @DisplayName("Проверка деления на 0")
    public void test2() {
        driver.get("http://google.com");
        elementsPage.search("Калькулятор");
        elementsPage.clicksix();// 6
        elementsPage.clickdivision();// /
        elementsPage.clickzero();// 0
        elementsPage.clickequall();// =
        assertEquals("6 ÷ 0 =", elementsPage.getExp());
        assertEquals("Infinity", elementsPage.getResult());
    }

    @Test
    @DisplayName("Проверка ошибки при отсутствии значения")
    public void test3() {
        driver.get("http://google.com");
        elementsPage.search("Калькулятор");
        elementsPage.clicksin();// sin
        elementsPage.clickequall();// =
        assertEquals("sin() =", elementsPage.getExp());
        assertEquals("Error", elementsPage.getResult());
    }

    @AfterEach
    public void teardown() {
        driver.quit();
    }
}
