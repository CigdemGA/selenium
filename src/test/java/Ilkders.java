import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ilkders {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/libs/driver/chromedriver.exe");
       WebDriver driver=new ChromeDriver();
       driver.get("https://amazon.com");

    }
}