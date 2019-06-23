package com.github.baez90.samples.java.quarkusDemo.models;

import org.apache.commons.lang3.builder.HashCodeBuilder;

public class GreetingResponse {

    private String greeting;

    public GreetingResponse() {
    }

    public GreetingResponse(String greeting) {
        this.greeting = greeting;
    }

    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (!(o instanceof GreetingResponse)) return false;

        GreetingResponse that = (GreetingResponse) o;

        return new org.apache.commons.lang3.builder.EqualsBuilder()
                .append(getGreeting(), that.getGreeting())
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(getGreeting())
                .toHashCode();
    }
}
