package extentions;

import com.codeborne.selenide.Configuration;
import drivers.AppiumSelenideDriver;
import io.appium.java_client.android.AndroidDriver;
import org.junit.jupiter.api.extension.BeforeAllCallback;
import org.junit.jupiter.api.extension.ExtensionContext;

public class AndroidExtension implements BeforeAllCallback {

  private AndroidDriver driver = null;

  @Override
  public void beforeAll(ExtensionContext extensionContext) throws Exception {
    Configuration.browser = AppiumSelenideDriver.class.getCanonicalName();
    Configuration.browserSize = null;
  }
}

