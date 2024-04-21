package com.zara.spring.java.cucumber.steps;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.zara.spring.java.cucumber.config.CucumberIntegrationConfig;
import com.zara.spring.java.dto.PriceDTO;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.io.IOException;

import static org.assertj.core.api.Assertions.*;

@CucumberContextConfiguration
@TestExecutionListeners(listeners = { DependencyInjectionTestExecutionListener.class })
public class GetPriceByDateTestSteps extends CucumberIntegrationConfig {

    private static final String URL = "/api/price?productId={productId}&brandId={brandId}&date={Date}";
    @Autowired
    private ObjectMapper objectMapper;
    @Autowired
    private MockMvc mockMvc;
    private MvcResult resultOut;
    @When("I send a request to get a Price by {string}, Product Id {int} and Brand Id {int}")
    public void iSendARequestToGetAPriceByDateProductIdAndBrandId(String date, int productId, int brandId) throws Exception {
        resultOut = this.mockMvc.perform(MockMvcRequestBuilders.get(URL, productId, brandId, date))
                .andReturn();
    }

    @Then("I verify the Price {string} received")
    public void iVerifyThePriceIdReceived(String id) throws IOException {
        PriceDTO priceDTO = objectMapper.readValue(resultOut.getResponse().getContentAsByteArray(), PriceDTO.class);
        assertThat(priceDTO.getPriceListId()).isEqualTo(Integer.parseInt(id));
    }
}
