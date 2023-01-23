package test_package;

import base.BaseTest;
import com.codeborne.selenide.Condition;
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
        $(By.xpath("//input[@placeholder=\"Username\"]")).shouldBe(Condition.visible).append("standard_user");
        $(By.xpath("//input[@placeholder=\"Password\"]")).shouldBe(Condition.visible).append("secret_sauce");
        $(By.xpath("//input[@id='login-button']")).click();
//        $(By.xpath("//select[@class='product_sort_container']")).click();
        Selenide.sleep(2000);
//        Selenide.actions().sendKeys(Keys.ESCAPE).perform();
//        Selenide.sleep(3000);
//        String text = $(By.xpath("//div[@class=\"inventory_item_name\"][1]")).text();
//        for (String s : $$(By.xpath("//div[@class=\"inventory_item_name\"]")).texts()) {
//            System.out.println(s);
//        }
        $(By.xpath("//span[text()=\"Products\"]")).waitUntil(Condition.visible, 3000);


    }
}
