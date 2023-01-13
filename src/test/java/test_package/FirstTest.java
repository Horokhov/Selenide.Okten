package test_package;

import base.BaseTest;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;
import org.testng.annotations.*;


import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class FirstTest extends BaseTest {
    @Test
    public void test() {
//        $(By.className("submit-button")).click();
        $(By.xpath("//input[@placeholder='Username']")).append("standard_user");
        ElementsCollection $$ = $$(By.xpath("//div[@class='inventory_list']//child::div[@class='inventory_item']//parent::div"));
    }
}
