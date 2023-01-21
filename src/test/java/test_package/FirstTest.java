package test_package;

import base.BaseTest;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.*;


import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class FirstTest extends BaseTest {
    @Test
    public void test() {
        $(By.xpath("//input[@placeholder=\"Username\"]")).append("standard_user");
        $(By.xpath("//input[@placeholder=\"Password\"]")).append("secret_sauce");
        $(By.xpath("//input[@id='login-button']")).click();
        $(By.xpath("//select[@class='product_sort_container']")).click();
        Selenide.sleep(1000);
        Selenide.actions().sendKeys(Keys.ESCAPE).perform();
        Selenide.sleep(3000);
    }
}
