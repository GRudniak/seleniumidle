import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;

public class PageNavigationTest {
    private WebDriver driver;
    private final String BASE_URL = "http://lady-fit.pl";

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(BASE_URL);
    }

    @Test
    public void should_navigate_to_contact(){
        WebElement contactBtn = driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/a[7]/div"));
        contactBtn.click();
        WebElement contactDataText = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[1]/div[2]/div/h3"));
        contactDataText.getText();
        assertTrue(contactDataText.getText().contains("Dane kontaktowe:"));
    }

    @Test
    public void should_navigate_to_gallery(){
        WebElement galleryBtn = driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/a[6]/div"));
        galleryBtn.click();
    }

    @Test
    public void should_navigate_to_cennik(){
        WebElement cennikBtn = driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/a[4]/div"));
        cennikBtn.click();
        WebElement trampolinyText = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div[1]/div[1]/div[1]"));
        trampolinyText.getText();
        assertTrue(trampolinyText.getText().contains("Trampoliny"));
    }

    @Test
    public void should_navigate_to_classes_desc(){
        WebElement classesBtn = driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/a[3]/div"));
        classesBtn.click();
        WebElement classesText = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div[1]"));
        classesText.getText();
        assertTrue(classesText.getText().contains("Aeropilates"));
    }

    @Test
    public void should_navigate_to_news(){
        WebElement newsBtn = driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/a[2]/div"));
        newsBtn.click();
    }

    @Test
    public void should_navigate_to_about(){
        WebElement aboutBtn = driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/a[1]/div"));
        aboutBtn.click();
    }

    @After
    public void tearDown(){
        System.out.println("Shutting down webdriver...");
        driver.close();
    }
}
