package com.github.fabriciolfj;

import feign.codec.ErrorDecoder;
import org.springframework.context.annotation.Bean;

public class PersonClientError {


    @Bean
    public ErrorDecoder personErrorDecoder() {
        return new PersonErrorDecoder();
    }
}
