package pages.realt_home;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.base.BasePage;

public class RealtHomePage extends BasePage {
    public RealtHomePage(WebDriver driver) {
        super(driver);
    }

    private final By countRooms = By.id("rooms");
    private final By optionsToRooms = By.xpath("//*[@id=\"rooms\"]/option[3]");
    private final By findBtn = By.xpath("//*[@id=\"residentialInputs\"]/div[1]/form/div[2]/div[2]/a[2]");

    public RealtHomePage enterCountRooms() {
        driver.findElement(countRooms).click();
        driver.findElement(optionsToRooms).click();
        return this;
    }
    public RealtHomePage clikToFind() {
        WebElement btnFind = driver.findElement(findBtn);
        waitElementVisible(btnFind).click();
        return this;
    }
}
//*[@id="rooms"]/option[3]
//*[@id="residentialInputs"]/div[1]/form/div[2]/div[2]/a[2]