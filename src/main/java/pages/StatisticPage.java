package pages;

import static com.codeborne.selenide.Selenide.$;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

public class StatisticPage extends AbsBasePage<StatisticPage> {

  private SelenideElement settingStatistic = $("[text='Settings']");
  private SelenideElement wordsWrittenField = $("[text='WORDS WRITTEN']");
  private SelenideElement currentStreakField = $("[text='CURRENT STREAK']");
  private SelenideElement maximumStreakField = $("[text='MAXIMUM STREAK']");
  private SelenideElement grammarLessonsTakenField = $("[text='GRAMMAR LESSONS TAKEN']");
  private SelenideElement wordsInVocabularyField = $("[text='WORDS IN VOCABULARY']");

  public StatisticPage wordsWrittenShouldBeVisible() {
    wordsWrittenField.shouldBe(Condition.visible);
    return this;
  }

  public StatisticPage maximumStreakShouldBeVisible() {
    maximumStreakField.shouldBe(Condition.visible);
    return this;
  }

  public StatisticPage grammarLessonsShouldBeVisible() {
    grammarLessonsTakenField.shouldBe(Condition.visible);
    return this;
  }

  public StatisticPage wordsInVocabularyShouldBeVisible() {
    wordsInVocabularyField.shouldBe(Condition.visible);
    return this;
  }

  public StatisticPage currentStreakShouldBeVisible() {
    currentStreakField.shouldBe(Condition.visible);
    return this;
  }
}
