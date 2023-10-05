package pages;

import com.codeborne.selenide.Selenide;

public abstract class AbsBasePage<T> {

  protected String selector = "[text ='%s']";

  public T open() {
    Selenide.open();
    return (T) this;
  }
}

