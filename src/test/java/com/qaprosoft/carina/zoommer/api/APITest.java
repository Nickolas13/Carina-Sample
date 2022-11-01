package com.qaprosoft.carina.zoommer.api;

import com.qaprosoft.apitools.validation.JsonCompareKeywords;
import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.demo.api.GetUserMethods;
import com.qaprosoft.carina.demo.api.PostUserMethod;
import org.skyscreamer.jsonassert.JSONCompareMode;
import org.testng.annotations.Test;

public class APITest implements IAbstractTest {

    @Test
    public void getUsersTest(){
        GetUserMethods getUsersMethods = new GetUserMethods();
        getUsersMethods.callAPIExpectSuccess();
        getUsersMethods.validateResponse(JSONCompareMode.STRICT, JsonCompareKeywords.ARRAY_CONTAINS.getKey());
        getUsersMethods.validateResponseAgainstSchema("api/users/_get/response.schema");
    }

    @Test
    public void createNewUser(){
        PostUserMethod postUserMethod = new PostUserMethod();
        postUserMethod.callAPI();
        postUserMethod.validateResponse();
    }

}
