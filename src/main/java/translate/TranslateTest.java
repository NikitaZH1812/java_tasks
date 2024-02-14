package translate;

import io.github.bonigarcia.wdm.WebDriverManager;
        import org.openqa.selenium.By;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.safari.SafariDriver;
        import org.openqa.selenium.support.ui.WebDriverWait;
        import org.openqa.selenium.support.ui.ExpectedConditions;
        import org.testng.annotations.AfterClass;
        import org.testng.annotations.BeforeClass;
        import org.testng.annotations.DataProvider;
        import org.testng.annotations.Test;

        import java.time.Duration;

        import static org.testng.Assert.assertEquals;

public class TranslateTest {
    private WebDriver driver;
    private final String sourceLanguage = "uk";

    @BeforeClass
    public void setup() {
        WebDriverManager.getInstance(SafariDriver.class).setup();
        driver = new SafariDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @DataProvider(name = "targetLanguages")
    public Object[][] targetLanguages() {
        return new Object[][]{
                {"de"}, {"fr"}, {"es"}, {"it"},
                {"ja"}, {"ko"}, {"zh-CN"}, {"pt"}, {"ar"},
                {"hi"}, {"vi"}, {"th"}, {"id"}, {"tr"},
                {"pl"}, {"cs"}, {"sv"}, {"hu"}, {"fi"}
        };
    }

    @DataProvider(name = "expectedTranslations")
    public Object[][] expectedTranslations() {
        return new Object[][]{
                {"de", "Ich werde TestNG beherrschen"},
                {"fr", "Je vais maîtriser TestNG"},
                {"es", "Dominaré TestNG"},
                {"it", "Imparerò TestNG"},
                {"ja", "私はTestNGをマスターします"},
                {"ko", "나는 TestNG를 마스터 할 것이다"},
                {"zh-CN", "我会掌握TestNG"},
                {"pt", "Ich werde TestNG cool lernen"},
                {"ar", "سأتقن TestNG"},
                {"hi", "मैं TestNG को सीखूँगा"},
                {"vi", "Tôi sẽ nắm bắt TestNG"},
                {"th", "ฉันจะเรียนรู้ TestNG"},
                {"id", "Saya akan menguasai TestNG"},
                {"tr", "TestNG'yi öğreneceğim"},
                {"pl", "Opanuję TestNG"},
                {"cs", "Naučím se TestNG"},
                {"sv", "Jag kommer att behärska TestNG"},
                {"hu", "Mester leszek a TestNG-ben"},
                {"fi", "Aion hallita TestNG: tä"}
        };
    }

    @Test(dataProvider = "targetLanguages", dataProviderClass = TranslateTest.class)
    public void testTranslation(String targetLanguage) {
        String translateUrl = "https://translate.google.com/?sl=" + sourceLanguage + "&tl=" + targetLanguage;

        driver.navigate().to(translateUrl);

        WebElement inputTextArea = driver.findElement(By.cssSelector("textarea[aria-label='Source text']"));
        inputTextArea.sendKeys("Я круто вивчу TestNG");

        WebElement translationResult = driver.findElement(By.cssSelector("span[class='ryNqvb']"));
        String translatedText = translationResult.getText();

        String expectedTranslation = getExpectedTranslation(targetLanguage);
        assertEquals(translatedText, expectedTranslation, "Переклад не відповідає очікуваному значенню.");
    }

    private String getExpectedTranslation(String targetLanguage) {
        // Знаходимо очікуваний переклад за допомогою мови цільової
        for (Object[] translation : expectedTranslations()) {
            String lang = (String) translation[0];
            String text = (String) translation[1];
            if (lang.equals(targetLanguage)) {
                return text;
            }
        }
        return "";
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
