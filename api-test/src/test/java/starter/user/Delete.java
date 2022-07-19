package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class Delete {
    protected static String url = "https://reqres.in/api/";

    @Step("I set DELETE api endpoints")
    public String setDeleteApiEndpoints(){
        return url + "users/2";
    }

    @Step("I send DELETE HTTP request")
    public void sendDeleteHttpRequest(){

        SerenityRest.given().delete(setDeleteApiEndpoints());
    }

    @Step("I receive valid HTTP response code 204")
    public void validateHttpResponseCode204(){
        restAssuredThat(response -> response.statusCode(204));
    }


}
