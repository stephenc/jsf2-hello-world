package com.blogspot.javaadventure.cloudbees.run;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

public class GreeterBeanTest {
    @Test
    public void nullNameMeansNoGreeting() throws Exception {
        GreeterBean instance = new GreeterBean();
        instance.setName(null);
        assertThat(instance.getResponse(), nullValue());
    }

    @Test
    public void noNameMeansNoGreeting() throws Exception {
        GreeterBean instance = new GreeterBean();
        instance.setName("");
        assertThat(instance.getResponse(), nullValue());
    }

    @Test
    public void aNameMeansGreeting() throws Exception {
        GreeterBean instance = new GreeterBean();
        instance.setName("Fred");
        assertThat(instance.getResponse(), notNullValue());
    }
}
