package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.openqa.selenium.support.PageFactory.initElements;

public class ElementsPage {

    @FindBy (css="input.gLFyf.gsfi")
    private WebElement searchInput;

    //поиск (
    @FindBy(css = "div[jsname='j93WEe']")
    public WebElement openBr;

    //поиск )
    @FindBy(css = "div[jsname='qCp9A']")
    public WebElement closeBr;

    //поиск +
    @FindBy(css = "div[jsname='XSr6wc']")
    public WebElement plus;

    //поиск *
    @FindBy(css = "div[jsname='YovRWb']")
    public WebElement mult;

    //поиск -
    @FindBy(css = "div[jsname='pPHzQc']")
    public WebElement minus;

    //поиск /
    @FindBy(css = "div[jsname='WxTTNd']")
    public WebElement division;

    //поиск =
    @FindBy(css = "div[jsname='Pt8tGc']")
    public WebElement equall;

    //поиск sin
    @FindBy(css = "div[jsname='aN1RFf']")
    public WebElement sin;

    //поиск 0
    @FindBy(css = "div[jsname='bkEvMb']")
    public WebElement zero;

    //поиск 1
    @FindBy(css = "div[jsname='N10B9']")
    public WebElement one;

    //поиск 2
    @FindBy(css = "div[jsname='lVjWed']")
    public WebElement two;

    //поиск 3
    @FindBy(css = "div[jsname='KN1kY']")
    public WebElement three;

    //поиск 4
    @FindBy(css = "div[jsname='xAP7E']")
    public WebElement four;

    //поиск 5
    @FindBy(css = "div[jsname='Ax5wH']")
    public WebElement five;

    //поиск 6
    @FindBy(css = "div[jsname='abcgof']")
    public WebElement six;

    //поиск выражения
    @FindBy(css="div[jsname='VkJw6']")
    private WebElement exp;

    //поиск результата
    @FindBy(css="span[jsname='VssY5c']")
    private WebElement result;

    public ElementsPage(WebDriver driver) {
    initElements(driver, this);
    }

    public void search(String text) {
        searchInput.sendKeys(text, Keys.ENTER);
    }

    public void clickOpenBr() {
        openBr.click();
    }

    public void clickCloseBr() {
        closeBr.click();
    }

    public void clickPlus() {
        plus.click();
    }

    public void clickmult() {
        mult.click();
    }

    public void clickminus() {
        minus.click();
    }

    public void clickdivision() {
        division.click();
    }

    public void clickequall() {
        equall.click();
    }

    public void clicksin() {
        sin.click();
    }

    public void clickzero() {
        zero.click();
    }

    public void clickOne() {
        one.click();
    }

    public void clicktwo() {
        two.click();
    }

    public void clickthree() {
        three.click();
    }

    public void clickfour() {
        four.click();
    }

    public void clickfive() {
        five.click();
    }

    public void clicksix() {
        six.click();
    }

    public String getExp() {return exp.getText();}
    public String getResult() {return result.getText();}

    }

