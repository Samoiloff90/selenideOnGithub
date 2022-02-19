package pages;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class TheInternetDragAndDropPage {
    //locators
    final private SelenideElement
        squareOne = $("#column-a"),
        squareTwo = $("#column-b");

    //action
     public TheInternetDragAndDropPage openPage() {
         open("https://the-internet.herokuapp.com/drag_and_drop");
         $$("header").first().shouldHave(text("A"));
         return this;
    }

    public TheInternetDragAndDropPage dragAndDropElement() {
        $(squareOne).dragAndDropTo(squareTwo);
         return this;
    }

    public TheInternetDragAndDropPage checkElement() {
        $$("header").first().shouldHave(text("B"));
        return this;
    }

}
