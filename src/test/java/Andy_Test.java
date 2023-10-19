
import components.component.MenuComponent;
import extentions.AndroidExtension;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import pages.ChatPage;
import pages.StartPage;
import pages.StatisticPage;

@ExtendWith(AndroidExtension.class)

public class Andy_Test {

  @BeforeAll
  static void beforeAll() {
    StartPage startPage = new StartPage();
    startPage.openChatPage();
  }

  @Test
  @DisplayName("Проверка отображения кнопок на главной странице")
  public void pageMenuButtonVisible_Test() {
    new MenuComponent()
        .chatButtonShouldBeVisible()
        .exerciseButtonShouldBeVisible()
        .statsButtonShouldBeVisible()
        .grammarButtonShouldBeVisible();
  }

  @Test
  @DisplayName("Проверка отображения полей раздела статистики")
  public void statisticPageFieldVisible_Test() {
    new MenuComponent()
        .clickStatsButton();
    new StatisticPage()
        .wordsInVocabularyShouldBeVisible()
        .maximumStreakShouldBeVisible()
        .wordsWrittenShouldBeVisible()
        .grammarLessonsShouldBeVisible()
        .currentStreakShouldBeVisible();
  }
}




