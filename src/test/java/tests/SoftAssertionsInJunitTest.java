package tests;

import org.junit.jupiter.api.Test;
import pages.GitHubSelenidePage;
import pages.TheInternetDragAndDropPage;

public class SoftAssertionsInJunitTest extends TestBase {
    GitHubSelenidePage gitHubSelenidePage = new GitHubSelenidePage();
    TheInternetDragAndDropPage theInternetDragAndDropPage = new TheInternetDragAndDropPage();

    @Test
    void successReserchTest() {
        gitHubSelenidePage.openPage()
                .goToWiki()
                .searchSoftAssertions()
                .checkJunit5InSoftAssertions();
    }

    @Test
    void checkDragAndDrop () {
        theInternetDragAndDropPage.openPage()
                .dragAndDropElement()
                .checkElement();
    }
}
