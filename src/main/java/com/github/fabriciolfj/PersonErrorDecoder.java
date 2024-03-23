package com.github.fabriciolfj;

import feign.Response;
import feign.codec.ErrorDecoder;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PersonErrorDecoder implements ErrorDecoder {

    @Override
    public Exception decode(String error, Response response) {
        log.error("fail request person {}", response.reason());
        throw new PersonClientException(response.reason(), response.status());
    }
}
