package pages;

import static com.codeborne.selenide.Selenide.$;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import components.popups.AlertPopup;

public class StartPage extends AbsBasePage<StartPage> {
  private SelenideElement skipButton = $("[text ='Skip >']");
  private SelenideElement nextButton = $("[text ='Next']");

  public StartPage nextButtonPresent() {
    nextButton.shouldBe(Condition.visible);
    return this;
  }

  public StartPage skipButtonPresent() {
    skipButton.shouldBe(Condition.visible);
    return this;
  }

  public StartPage clickNextButton() {
    $(nextButton).click();
    return this;
  }

  public boolean isStartPageOpened() {
    return nextButton.isDisplayed();
  }

  public ChatPage clickSkipButton() {
    skipButton.click();
    return new ChatPage();
  }

  public ChatPage openChatPage() {
    new StartPage()
        .open()
        .nextButtonPresent()
        .clickNextButton()
        .nextButtonPresent()
        .clickNextButton()
        .skipButtonPresent()
        .clickSkipButton();
    new AlertPopup()
        .popupShouldBeVisible()
        .clickOkButton();
    return new ChatPage();
  }
}
