package BddFramework;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

public class LoginTestDefinitions {
    Context context;
    public LoginTestDefinitions(){
        context=new Context();
    }

    @Given("User on login page")
    public void user_on_login_page() {
        System.out.println(" - User on login page");
    }

    @When("User enter {string} and {string}")
    public void user_enter_credentials(String userName, String password) {
        System.out.println(" - Enter :: " + userName + " and " + password);
    }
    @When("User click on submit")
    public void user_click_on_submit() {
        System.out.println(" - User click on submit");
    }
    @Then("User verify products page")
    public void user_verify_products_page() {
        System.out.println("- User verify products page");
    }

    @And("User verify single product")
    public void userVerifySingleProduct() {
        System.out.println("User verify single product");
    }

    @When("User enter login credentials using below row")
    public void userEnterLoginCredentialsUsingBelowRow(DataTable dataTable) {
        List<String> firstRowTableData=dataTable.row(0);
        System.out.println("email::"+firstRowTableData.get(3));
        for(String data:firstRowTableData){
            System.out.println(data);
        }

    }

    @When("User enter login credentials using row header")
    public void userEnterLoginCredentialsUsingRowHeader(DataTable dataTable) {
        List<Map<String,String>> data=dataTable.asMaps(String.class,String.class);
        String userName=null;
        String password=null;
        String phoneNumber=null;
        String email=null;

        for(Map<String,String> data1:data){
            userName=data1.get("username");
            password=data1.get("password");
            phoneNumber=data1.get("phone");
            email=data1.get("email");

        }
        System.out.println(userName);
        System.out.println(password);
        System.out.println(phoneNumber);
        System.out.println(email);

        context.setMapData("un",userName);
        context.setMapData("pw",password);
        context.setMapData("pn",password);
        context.setMapData("em",email);

    }


}
