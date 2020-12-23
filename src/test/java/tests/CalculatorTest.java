package tests;

import io.appium.java_client.MobileElement;
import org.junit.jupiter.api.Test;
import pages.MainPage;

public class CalculatorTest {
    private final MainPage mainPage = new MainPage();
    private final MobileElement sumButton = mainPage.getSumButton();
    private final MobileElement subButton = mainPage.getSubButton();
    private final MobileElement multiButton = mainPage.getMultiButton();
    private final MobileElement divButton = mainPage.getDivButton();
    private final MobileElement equalButton = mainPage.getEqualButton();
    private final MobileElement result = mainPage.getResult();
    private final MobileElement digit3 = mainPage.getDigit3();
    private final MobileElement digit6 = mainPage.getDigit6();

    @Test
    public void sumOfTwoNumbers(){
        digit6.click();
        sumButton.click();
        digit3.click();
        equalButton.click();
        System.out.println("Sum result: " + result.getText());
    }

    @Test
    public void subtractionOfTwoNumbers(){
        digit6.click();
        subButton.click();
        digit3.click();
        equalButton.click();
        System.out.println("Subtraction result: " + result.getText());
    }

    @Test
    public void multiplyTwoNumbers(){
        digit6.click();
        multiButton.click();
        digit3.click();
        equalButton.click();
        System.out.println("Multiply result: " + result.getText());
    }

    @Test
    public void divisionOfTwoNumbers(){
        digit6.click();
        divButton.click();
        digit3.click();
        equalButton.click();
        System.out.println("Division result: " + result.getText());
    }
}
