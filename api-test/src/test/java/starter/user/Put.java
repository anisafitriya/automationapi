package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class Put {
    protected static String url = "https://reqres.in/api/";

    @Step("I set PUT api endpoints")
    public String setPutEndpoints(){
        return url + "users/2";
    }

    @Step("I send PUT HTTP request")
    public void sendPutHttpRequest(){

        JSONObject requestBody = new JSONObject();
        requestBody.put("name","morpheus");
        requestBody.put("job","zion resident");
        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).put(setPutEndpoints());
    }

    @Step("I receive valid data for updated user")
    public void receiveDataUpdatedUser() {
        restAssuredThat(response -> response.body("name", equalTo("morpheus")));
        restAssuredThat(response -> response.body("job", equalTo("zion resident")));

    }

}
