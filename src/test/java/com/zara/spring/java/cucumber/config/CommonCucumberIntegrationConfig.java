package com.zara.spring.java.cucumber.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;

public class CommonCucumberIntegrationConfig {

    @Autowired
    protected MockMvc mockMvc;

	@Autowired
	protected ObjectMapper objectMapper;
}
