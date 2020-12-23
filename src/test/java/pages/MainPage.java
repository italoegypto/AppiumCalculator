package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import util.DriverManager;

public class MainPage {
    private final AppiumDriver<MobileElement> driver = DriverManager.getDriver();

    MobileElement sumButton = driver.findElementByAccessibilityId("plus");
    MobileElement subButton = driver.findElementByAccessibilityId("minus");
    MobileElement multiButton = driver.findElementByAccessibilityId("multiply");
    MobileElement divButton = driver.findElementByAccessibilityId("divide");
    MobileElement equalButton = driver.findElementByAccessibilityId("equals");
    MobileElement result = driver.findElementById("com.android.calculator2:id/result");
    MobileElement digit3 = driver.findElementById("com.android.calculator2:id/digit_3");
    MobileElement digit6 = driver.findElementById("com.android.calculator2:id/digit_6");

    public MobileElement getSumButton() {

        return sumButton;
    }

    public MobileElement getSubButton() {
        return subButton;
    }

    public MobileElement getMultiButton() {

        return multiButton;
    }

    public MobileElement getDivButton() {

        return divButton;
    }

    public MobileElement getEqualButton() {
        return equalButton;
    }

    public MobileElement getResult() {
        return result;
    }


    public MobileElement getDigit3() {
        return digit3;
    }

    public MobileElement getDigit6() {
        return digit6;
    }

}