package com.zara.spring.java;

import org.junit.platform.suite.api.*;

import static io.cucumber.junit.platform.engine.Constants.GLUE_PROPERTY_NAME;

@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource(CucumberGetPriceByDateTest.PATH_FEATURES)
@ConfigurationParameter(key = GLUE_PROPERTY_NAME, value = CucumberGetPriceByDateTest.BASE_PACKAGE)
public class CucumberGetPriceByDateTest {
    public static final String PATH_FEATURES = "features";
    public static final String BASE_PACKAGE = "com.zara.spring.java";
}
