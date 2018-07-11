import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Test {
    public static void main(String[] args) throws InterruptedException {
        MainPageMail mainPageMail;
        WebDriver driver;
        Auth auth;
        SentMessage sentMessage;
        mainPageMail=new MainPageMail();
        driver = new ChromeDriver();
        auth = new Auth(driver);
        sentMessage= new SentMessage(driver);
        driver.get(mainPageMail.OpenMainPage());
        auth.Author("testmail11072018","Qwerty1234");

        sentMessage.clickWrite("ddd@mail.ru","Тема","Необходимо ввести текст сообщения");

    }
}