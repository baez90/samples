package com.github.baez90.samples.java.quarkusDemo;

import com.github.baez90.samples.java.quarkusDemo.models.GreetingResponse;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class GreetingResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public GreetingResponse hello() {
        return new GreetingResponse("Hello, World!");
    }
}