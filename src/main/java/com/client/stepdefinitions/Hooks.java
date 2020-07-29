package com.client.stepdefinitions;

import com.client.library.DriverClass;
import com.client.library.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    DriverManager driverManager = new DriverManager();

    @Before("@ui")
    public void beforeScenario(){
        driverManager.createDriver(new DriverClass());
    }

    @After
    public void afterScenario(){
        driverManager.cleanDriver();
    }
}
