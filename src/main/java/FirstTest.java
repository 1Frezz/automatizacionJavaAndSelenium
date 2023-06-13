import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;
import io.github.bonigarcia.wdm.WebDriverManager;


public class FirstTest {
    private static WebDriver driver;
    public static void setUpDriver() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        driver = new ChromeDriver(options);
        driver.get("https://www.consultoriaglobal.com.ar/cgweb/");
        System.out.println("Se abrió correctamente");
        driver.manage().window().maximize();
        Thread.sleep(1000);
        System.out.println("Se maximizó la página");
    }

    String name = "Facundo";
    String email = "facudemarco@gmail.comm";
    String subject = "Test1";
    String message = "Esta es mi primera prueba con Selenium WebDriver y Java :)";
    String captcha = "LZW4";

    @BeforeMethod (alwaysRun = true)
    public void setUpClass() throws InterruptedException {
        setUpDriver();
    }

    @Test()
    public void firstTest() throws InterruptedException {
        driver.navigate().to("https://www.consultoriaglobal.com.ar/cgweb/?page_id=370");
        WebElement nameInput = driver.findElement(By.name("your-name"));
        nameInput.sendKeys(name);
        Thread.sleep(1000);
        System.out.println("Se introdujo el nombre en el formulario");
        WebElement emailInput = driver.findElement(By.name("your-email"));
        emailInput.sendKeys(email);
        Thread.sleep(1000);
        System.out.println("Se introdujo el email en el formulario");
        WebElement subjetInput = driver.findElement(By.name("your-subject"));
        subjetInput.sendKeys(subject);
        Thread.sleep(1000);
        System.out.println("Se introdujo el asunto en el formulario");
        WebElement messageInput = driver.findElement(By.name("your-message"));
        messageInput.sendKeys(message);
        Thread.sleep(1000);
        System.out.println("Se introdujo el mensaje en el formulario");
        WebElement captchaInput = driver.findElement(By.name("captcha-636"));
        captchaInput.sendKeys(captcha);
        Thread.sleep(1000);
        System.out.println("Se introdujo el captcha en el formulario");
        WebElement submit = driver.findElement(By.cssSelector("input[type='submit']"));
        submit.click();
        System.out.println("Se presionó el botón Enviar");
    }
/*
    @AfterMethod(alwaysRun=true)
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

 */
}