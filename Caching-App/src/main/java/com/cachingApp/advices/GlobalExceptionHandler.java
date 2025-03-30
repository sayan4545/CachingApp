package com.cachingApp.advices;

import com.cachingApp.exceptions.ResourceNotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.dialect.function.array.ArrayViaElementArgumentReturnTypeResolver;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice

public class GlobalExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<?> handleresourceNotFound(ResourceNotFoundException exception){
        log.error(exception.getLocalizedMessage());
        return ResponseEntity.notFound().build();
    }
}
