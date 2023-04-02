import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class ApplicationFormTest {

    @Test
    void shouldTestForm() {
        open("http://localhost:9999/");
        $("[data-test-id=name] input").setValue("Анна-Мария Виктория");
        $("[data-test-id=phone] input").setValue("+79258013714");
        $("[data-test-id=agreement]").click();
        $("button").click();
        $("[data-test-id=order-success]").shouldHave(exactText("Ваша заявка успешно отправлена! Наш менеджер свяжется с вами в ближайшее время."));
    }
}