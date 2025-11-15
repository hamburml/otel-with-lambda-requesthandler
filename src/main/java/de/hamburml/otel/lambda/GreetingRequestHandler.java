package de.hamburml.otel.lambda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

import io.quarkus.logging.Log;

public class GreetingRequestHandler implements RequestHandler<Object, String> {

    @Override
    public String handleRequest(Object unused, Context context) {
        Log.info("hello stdout");

        return "Hello from Quarkus";
    }
}
