package pages;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.text;

public class GitHubSelenidePage {
    //locators
    final private SelenideElement
        headerTitle = $("#repository-container-header"),
        wikiTab = $("#wiki-tab"),
        headerWiki = $(byText("Welcome to the selenide wiki!")),
        wikiInputForSearch = $("#wiki-pages-filter"),
        wikiBox = $("#wiki-pages-box"),
        btnSoftAssertions = $x(".//a[text()='SoftAssertions']"),
        repoWrap = $(".repository-content "),
        wrap = $(".markdown-body");

    // actions
    public GitHubSelenidePage openPage() {
        open("https://github.com/selenide/selenide");
        headerTitle.shouldHave(text("selenide"));
        return this;
    }

    public GitHubSelenidePage goToWiki() {
        wikiTab.click();
        headerWiki.shouldHave(text("Welcome to the selenide wiki!"));
        return this;
    }

    public GitHubSelenidePage searchSoftAssertions() {
        wikiInputForSearch.setValue("SoftAssertions").pressEnter();
        wikiBox.shouldHave(text("SoftAssertions"));
        btnSoftAssertions.click();
        return this;
    }

    public GitHubSelenidePage checkJunit5InSoftAssertions() {
        repoWrap.shouldHave(text("SoftAssertions"));
        wrap.shouldHave(text("JUnit5 extension"));
        return this;
    }
}
