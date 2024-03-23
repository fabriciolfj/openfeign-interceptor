package com.github.fabriciolfj;

import feign.RequestInterceptor;
import feign.RequestTemplate;

import java.util.UUID;

public class PersonClientInterceptor implements RequestInterceptor {

    @Override
    public void apply(RequestTemplate requestTemplate) {
        requestTemplate.header("client-id", UUID.randomUUID().toString());
    }
}
