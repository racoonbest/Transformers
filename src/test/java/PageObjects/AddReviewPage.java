package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import static org.junit.Assert.assertEquals;

public class AddReviewPage {

    WebDriver driver;

    By bookTitle = By.cssSelector(".product-title");
    By addRvw = By.linkText("Add your review");
    By error = By.cssSelector(".validation-summary-errors");
    By review1 = By.cssSelector("#AddProductReview_Title");
    By review2 = By.cssSelector("#AddProductReview_ReviewText");
    By review3 = By.cssSelector("#addproductrating_5");
    By review4 = By.cssSelector("[value = 'Submit review'");
    By accept = By.cssSelector(".result");

    public AddReviewPage(WebDriver driver){
        this.driver=driver;
    }
    public void productTitle(){
        driver.findElement(bookTitle).click();
    }

    public void addReview(){
        driver.findElement(addRvw).click();
    }

    public void errorMsg(){
      String expErr =  "Only registered users can write reviews";
      String actErr = driver.findElement(error).getText();
      assertEquals(expErr,actErr);
    }

    public void reviewForm(){
        driver.findElement(review1).sendKeys("I like this book");
        driver.findElement(review2).sendKeys("Highly recommend");
        driver.findElement(review3).click();
        driver.findElement(review4).click();
    }
    public void acceptMsg() {
        String expAcc =  "Product review is successfully added.";
        String actAcc = driver.findElement(accept).getText();
        assertEquals(expAcc,actAcc);

    }
}
