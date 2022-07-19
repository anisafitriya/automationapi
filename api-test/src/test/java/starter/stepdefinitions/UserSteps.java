package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.Delete;
import starter.user.Get;
import starter.user.Post;
import starter.user.Put;

public class UserSteps {
    @Steps
    Get get;

    @Steps
    Post post;

    @Steps
    Put put;

    @Steps
    Delete delete;



    @Given("I set GET api endpoints")
    public void iSetGetApiEndpoints(){
        get.setGetEndpoints();

    }
    @When("I send GET HTTP request")
    public void iSendGetHttpRequest(){
        get.sendGetHttpRequest();
    }
    @Then("I receive valid HTTP response code 200")
    public void iReceiveValidHttpResponseCode200(){
        get.validateHttpResponseCode200();
    }
    @And("I receive valid data for detail user")
    public void receiveValidDataForDetailUser(){
        get.validateDataDetailUser();
    }


    @Given("I set POST api endpoints")
    public void setPostApiEndpoints(){
        post.setPostApiEndpoints();
    }

    @When("I send POST HTTP request")
    public void sendPostHttpRequest(){
        post.sendPostHttpRequest();
    }

    @Then("I receive valid HTTP response code 201")
    public void i_receive_valid_http_response_code(){
        post.receiveHttpResponseCode201();

    }


    @And("I receive valid data for new user")
    public void validateDataNewUser(){
        post.receiveDataNewUser();
    }

    @Given("I set PUT api endpoints")
    public void i_set_put_api_endpoints() {
        put.setPutEndpoints();
    }

    @When("I send PUT HTTP request")
    public void i_send_put_http_request() {
        put.sendPutHttpRequest();
    }

    @Then("I receive valid data for updated user")
    public void i_receive_valid_data_for_updated_user() {
        put.receiveDataUpdatedUser();
    }

    @Given("I set DELETE api enspoints")
    public void i_set_delete_api_enspoints() {
       delete.setDeleteApiEndpoints();
    }
    @When("Isend DELETE HTTP request")
    public void isend_delete_http_request() {
        delete.sendDeleteHttpRequest();
    }
    @Then("I receive valid HTTP rsponse code 204")
    public void i_receive_valid_http_rsponse_code204(){
        delete.validateHttpResponseCode204();
    }

}
