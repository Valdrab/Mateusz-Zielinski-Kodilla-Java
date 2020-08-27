package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class FacebookTestingApp {
    public static final String NEW_ACCOUNT_BUTTON_ID = "u_0_2";
    public static final String XPATH_MONTH = "//div[contains(@class, \"_5k_5\")]/span/span/select[1]";
    public static final String XPATH_DAY = "//div[contains(@class, \"_5k_5\")]/span/span/select[2]";
    public static final String XPATH_YEAR = "//div[contains(@class, \"_5k_5\")]/span/span/select[3]";

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.FIREFOX);
        driver.get("https://facebook.com/");

        WebElement newAccountButton = driver.findElement(By.id(NEW_ACCOUNT_BUTTON_ID));
        newAccountButton.click();

        TimeUnit.MILLISECONDS.sleep(100); //A short break to allow a pop-up element to load

        WebElement selectMonthCombo = driver.findElement(By.xpath(XPATH_MONTH));
        Select selectMonth = new Select(selectMonthCombo);
        selectMonth.selectByValue("5");

        WebElement selectDayCombo = driver.findElement(By.xpath(XPATH_DAY));
        Select selectDay = new Select(selectDayCombo);
        selectDay.selectByValue("1");

        WebElement selectYearCombo = driver.findElement(By.xpath(XPATH_YEAR));
        Select selectYear = new Select(selectYearCombo);
        selectYear.selectByValue("1990");
    }
}
