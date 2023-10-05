package components.popups;

import static com.codeborne.selenide.Selenide.$;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import components.component.MenuComponent;
import org.openqa.selenium.By;

public class AlertPopup extends AbsPopupBase {

  private SelenideElement alertMessage = $(By.id("android:id/alertTitle"));
  private SelenideElement okButton = $(By.id("android:id/button1"));

  @Override
  public AlertPopup popupShouldBeVisible() {
    alertMessage.shouldBe(Condition.visible);

    return this;
  }

  @Override
  public AlertPopup popupShouldNotBeVisible() {
    alertMessage.shouldNotBe(Condition.visible);
    return this;
  }

  public MenuComponent clickOkButton() {
    okButton.click();
    return new MenuComponent();
  }
}
