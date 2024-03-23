package com.github.fabriciolfj;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/person")
public class PersonController {

    private final PersonClient personClient;

    @GetMapping("/{code}")
    public Person getPerson(@PathVariable("code") final String code) {
        return personClient.find(code);
    }
}
