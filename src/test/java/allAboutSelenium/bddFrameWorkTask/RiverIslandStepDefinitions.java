package allAboutSelenium.bddFrameWorkTask;

import io.cucumber.java.en.*;
import org.testng.annotations.BeforeClass;

public class RiverIslandStepDefinitions {
    HomePage homePage;
    ProductsPage productsPage;

    Context context;
    public RiverIslandStepDefinitions(){
        context=new Context();
    }

    

    @Given("the user is on the Home Page")
    public void theUserIsOnTheHomePage() {
        System.out.println("hi");
    }

    @When("the user selects a category from the menu")
    public void theUserSelectsACategoryFromTheMenu() {
        
    }

    @And("the user selects a product from the products page")
    public void theUserSelectsAProductFromTheProductsPage() {
        
    }

    @Then("the user verifies the product name and product title")
    public void theUserVerifiesTheProductNameAndProductTitle() {
        
    }

    @When("the user selects the product size")
    public void theUserSelectsTheProductSize() {
        
    }

    @And("the user clicks on the {string} button")
    public void theUserClicksOnTheButton(String arg0) {
        
    }

    @Then("the user verifies the product name and price in the bag")
    public void theUserVerifiesTheProductNameAndPriceInTheBag() {
        
    }

    @And("the user adds the product to the wishlist")
    public void theUserAddsTheProductToTheWishlist() {
    }
}
