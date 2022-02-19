package tests;

import org.junit.jupiter.api.Test;
import pages.GitHubSelenidePage;

public class SoftAssertionsInJunitTest extends TestBase {
    GitHubSelenidePage gitHubSelenidePage = new GitHubSelenidePage();

    @Test
    void successReserchTest() {
        gitHubSelenidePage.openPage()
                .goToWiki()
                .searchSoftAssertions()
                .checkJunit5InSoftAssertions();
    }
}
