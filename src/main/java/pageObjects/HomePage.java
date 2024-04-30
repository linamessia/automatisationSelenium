package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Page{

    private WebDriver driver;

    @FindBy(id = "style_avatar_wrapper__pEGIQ")
    private WebElement avatar;

    @FindBy(id = "email_login")
    private WebElement emailLogin;

    @FindBy(id = "password_login")
    private WebElement passwordLogin;

    @FindBy(id = "btn_login")
    private WebElement boutonLogin;

    //Méthodes qui représentent les actions à faire sur la page de connexion
    private String URL = "https://ztrain-web.vercel.app/home";
    public void navigateToHomePage(){
        this.get(URL);
    }

    public void fillEmailLogin(String email){
        this.emailLogin.sendKeys(email);
    }

    public void fillPasswordLogin(String password){
        this.passwordLogin.sendKeys(password);
    }

    public void login(String email, String password){
        this.fillEmailLogin(email);
        this.fillPasswordLogin(password);
        this.boutonLogin.click();
    }

    public void register(){
        this.driver.get(URL);
        this.avatar.click();
        this.driver.findElement(By.cssSelector(".MuiTabs-scroller>div>button:nth-child(2)")).click();
        this.driver.findElement(By.id("email_register")).sendKeys();
    }





//    public void connexion(){
//        this.avatar.click();
//        this.emailLogin.sendKeys("testeur@gmail.com");
//        this.passwordLogin.sendKeys("12345678");
//        this.boutonLogin.click();
//    }
}
