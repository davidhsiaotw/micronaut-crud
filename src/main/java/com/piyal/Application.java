package com.piyal;

import io.micronaut.runtime.Micronaut;

public class Application {

    public static void main(String[] args) {
        System.out.println("micronaut app is running...");
        Micronaut.run(Application.class, args);
    }
}
