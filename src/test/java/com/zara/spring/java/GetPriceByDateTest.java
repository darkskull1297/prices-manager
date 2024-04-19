package com.zara.spring.java;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.zara.spring.java.dto.PriceDTO;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.spring.CucumberContextConfiguration;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.io.IOException;

import static org.assertj.core.api.Assertions.*;

@Slf4j
@DirtiesContext
@CucumberContextConfiguration
@TestExecutionListeners(listeners = { DependencyInjectionTestExecutionListener.class })
@SpringBootTest
@ActiveProfiles("test")
@ExtendWith(SpringExtension.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@AutoConfigureMockMvc
public class GetPriceByDateTest {

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
