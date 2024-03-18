package com.zara.spring.java.infrastructure.config;

import com.zara.spring.java.services.PriceService;
import com.zara.spring.java.usescases.PriceUseCaseImpl;
import com.zara.spring.java.domain.ports.out.PriceRepositoryPort;
import com.zara.spring.java.infrastructure.repositories.JpaPriceRepositoryAdapter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {
    @Bean
    public PriceService priceService(PriceRepositoryPort priceRepositoryPort) {
        return new PriceService(
                new PriceUseCaseImpl(priceRepositoryPort)
        );
    }

    @Bean
    public PriceRepositoryPort priceRepositoryPort(JpaPriceRepositoryAdapter jpaPriceRepositoryAdapter) {
        return jpaPriceRepositoryAdapter;
    }

}
