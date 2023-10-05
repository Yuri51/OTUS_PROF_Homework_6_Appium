package pages;

import static com.codeborne.selenide.Selenide.$;
import static org.assertj.core.api.Assertions.assertThat;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;


public class ChatPage extends AbsBasePage<ChatPage> {
  private SelenideElement editTextField = $("[text ='Type a message...']");
  private SelenideElement sendMessageButton = $("[text ='Send']");

  public void sendMessageToChat(String text) {
    editTextField.shouldBe(Condition.visible).sendKeys(text);
    sendMessageButton.shouldBe(Condition.visible).shouldBe(Condition.enabled).click();
    boolean messageIsDisplayed = $(By.cssSelector(String.format(selector, text))).isDisplayed();
    assertThat(messageIsDisplayed)
        .as("Message '%s' not found", text)
        .isEqualTo(false);
  }
}
