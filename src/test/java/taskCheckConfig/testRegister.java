package taskCheckConfig;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class testRegister {

        public static void main(String[] args) {
            System.setProperty("webdriver.chrome.driver",
                    "src/test/resources/drivers/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://flexi.pl");

            String acceptButton = "//*[@id=\"__layout\"]/div/div[1]/div[1]/div/div[2]/div/button";
            String registerButton = "//*[@id=\"__BVID__28\"]/ul/li[6]/a";
            String createAccount = "//*[@id=\"modal-login___BV_modal_body_\"]/div/div/div/div/div[2]/a";
            String email = "email";
            String emailRepeat = "emailRepeat";
            String password = "password";
            String passwordRepeat = "passwordRepeat";
            String firstName = "firstname";
            String lastName = "lastname";
            String phone = "phone";
            String city = "city";
            String acceptStatute = "//*[@id=\"__BVID__233\"]/div/div[1]/label/div/div/p";
            String registerAccountButton = "//*[@id=\"__BVID__179\"]/div/button";

            WebDriverWait wait0 = new WebDriverWait(driver, 20);
            wait0.until(ExpectedConditions.elementToBeClickable(By.xpath(acceptButton)));
            driver.findElement(By.xpath(acceptButton)).click();
            driver.findElement(By.xpath(registerButton)).click();
            WebDriverWait wait = new WebDriverWait(driver, 20);
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath(createAccount)));
            driver.findElement(By.xpath(createAccount)).click();
            WebDriverWait wait2 = new WebDriverWait(driver, 20);
            wait2.until(ExpectedConditions.elementToBeClickable(By.id(email)));
            driver.findElement(By.id(email)).sendKeys("janek2677789@o2.pl");
            driver.findElement(By.id(emailRepeat)).sendKeys("janek2677789@o2.pl");
            driver.findElement(By.id(password)).sendKeys("Janek1257!");
            driver.findElement(By.id(passwordRepeat)).sendKeys("Janek1257!");
            driver.findElement(By.id(firstName)).sendKeys("Jan");
            driver.findElement(By.id(lastName)).sendKeys("Kowalski");
            driver.findElement(By.id(phone)).sendKeys("365876987");
            driver.findElement(By.id(city)).sendKeys("Poznań");
            WebElement element = driver.findElement(By.xpath(acceptStatute));
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].click()", element);
            WebElement element2 = driver.findElement(By.xpath(registerAccountButton));
            JavascriptExecutor executor2 = (JavascriptExecutor)driver;
            executor2.executeScript("arguments[0].click()", element2);

//            driver.close();
        }}


