package com.geekbrains.lesson5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CookiesExampleTest {
    WebDriver driver;


    @BeforeAll
    static void setupDriver(){
        WebDriverManager.chromedriver().setup();


    }

    @BeforeEach
    void runDriver() {
        driver = new ChromeDriver();
    }
    @Test
    void loginToDiaryWithCookieTest() throws InterruptedException {



        driver.get("https://diary.ru");

        Thread.sleep(3000);

        Cookie cookie = new Cookie("_identity_", "c37508bb6c8afa2d28fbc4b4e1acea229a4a5703bdab0bc98942343da02da611a%3A2%3A%7Bi%3A0%3Bs%3A10%3A%22_identity_%22%3Bi%3A1%3Bs%3A52%3A%22%5B3557545%2C%22ThH1j_52w7OWmehc8z3RdCGV81YbFVKY%22%2C2592000%5D%22%3B%7D");
        driver.manage().addCookie(cookie);
        driver.navigate().refresh();

        driver.manage().deleteCookie(cookie);

        Thread.sleep(5000);
    }

    @AfterEach
    void tearDown() {
        driver.quit();

    }

}