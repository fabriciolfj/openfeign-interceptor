package com.github.fabriciolfj;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ControllerHandler {


    @ExceptionHandler(PersonClientException.class)
    public ResponseEntity<?> handlePersonClientException(final PersonClientException e) {
        var dto = ErrorDTO.builder().message(e.getMessage()).code(e.getCode()).build();

        return ResponseEntity.badRequest().body(dto);
    }
}
