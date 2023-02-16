import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Configuration.*;
import static com.codeborne.selenide.Selenide.*;

public class TextBoxTests {

    @BeforeAll
    static void beforeAll() {
        holdBrowserOpen = true;
        browserSize = "1920x1080";
        baseUrl = "https://demoqa.com";
    }

    @Test
    void fillFormTest() {

        // открыть сайт
        open("https://demoqa.com/text-box");

        //вводим значение в поле
        //или $("(id=userName)")
        $("#userName").setValue("Elena");
        $("#userEmail").setValue("Elena@mail.ru");
        $("#currentAddress").setValue("Address1");
        $("#permanentAddress").setValue("Address2");

        // нажимаем кнопку Submit
        $("#submit").click();

        // проверяем, что поле стало видимым
        $("#output").shouldBe(Condition.visible);

        // проверяем, что подполя поля output содержат текст
        $("#output #name").shouldHave(text("Elena"));
        $("#output #email").shouldHave(text("Elena@mail.ru"));
        $("#output #currentAddress").shouldHave(text("Address1"));
        $("#output #permanentAddress").shouldHave(text("Address2"));

        // как еще можно обращаться к элементам
        $x("//*[id=email]").setValue("1");
        //обращение по классу
        $("class=mb-1").setValue("123");
        $(".mb-1").setValue("123");
        $(".mb-1,mt-4 row").setValue("123");
        $x("//input[@class='mb-1'][@class='mt-4 row']");
    }
}
