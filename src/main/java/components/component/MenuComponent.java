package components.component;

import static com.codeborne.selenide.Selenide.$;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import pages.ChatPage;
import pages.StatisticPage;

public class MenuComponent extends AbsBaseComponent {

  private SelenideElement chatButton = $("[text='Chat']");
  private SelenideElement exerciseButton = $("[text='Exercise']");
  private SelenideElement grammarButton = $("[text='Grammar']");
  private SelenideElement statsButton = $("[text='Stats']");

  public MenuComponent chatButtonShouldBeVisible() {
    chatButton.shouldBe(Condition.enabled).shouldBe(Condition.visible);
    return this;
  }

  public MenuComponent exerciseButtonShouldBeVisible() {
    exerciseButton.shouldBe(Condition.enabled).shouldBe(Condition.visible);
    return this;
  }

  public MenuComponent grammarButtonShouldBeVisible() {
    grammarButton.shouldBe(Condition.enabled).shouldBe(Condition.visible);
    return this;
  }

  public MenuComponent statsButtonShouldBeVisible() {
    statsButton.shouldBe(Condition.enabled).shouldBe(Condition.visible);
    return this;
  }

  public StatisticPage clickStatsButton() {
    statsButton.click();
    return new StatisticPage();
  }

  public ChatPage clickChatButton() {
    chatButton.click();
    return new ChatPage();
  }
}


