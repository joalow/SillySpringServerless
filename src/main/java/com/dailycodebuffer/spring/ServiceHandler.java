package com.dailycodebuffer.spring;
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyRequestEvent;
import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyResponseEvent;
import com.dailycodebuffer.spring.function.ToLowerCase;

import org.springframework.beans.factory.annotation.Autowired;

public class ServiceHandler implements RequestHandler<APIGatewayProxyRequestEvent, APIGatewayProxyResponseEvent> {

    @Autowired
    ToLowerCase toLowerCase;

    @Override
    public APIGatewayProxyResponseEvent handleRequest(APIGatewayProxyRequestEvent s, Context context) {
        context.getLogger().log("Input: " + s);
        APIGatewayProxyResponseEvent responseEvent = new APIGatewayProxyResponseEvent();
        responseEvent.setStatusCode(200);
        String he = toLowerCase.apply("HERE");
        responseEvent.setBody(he);
        return responseEvent;
    }

}