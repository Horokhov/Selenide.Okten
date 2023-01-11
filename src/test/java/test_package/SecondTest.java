package test_package;

import base.BaseTest;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.*;

public class SecondTest extends BaseTest {
    @Test
    public void test2() {
        Selenide.sleep(5000);
    }

}
