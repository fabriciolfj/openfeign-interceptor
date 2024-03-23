package com.github.fabriciolfj;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "personClient", url = "${person-client.url}", configuration = {PersonClientInterceptor.class, PersonClientError.class})
public interface PersonClient {

    @GetMapping("/customer/{code}")
    Person find(@PathVariable("code") String code);
}
