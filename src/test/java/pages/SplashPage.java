package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.FindBy;

public class SplashPage extends BasePage {

    public SplashPage(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@resource-id='com.sheygam.contactapp:id/version_text']")
    MobileElement versionText;

    public boolean validateVersionCorrect(){
        return isTextEqual(versionText, "Version 1.0.0");
    }



// TODO
/*
Add method to goToAuthPage should return object of AuthenticationPage
 */
    public AuthenticationPage goToAuthPage() {
        pause(5000);
        return new AuthenticationPage(driver);
    }


}
