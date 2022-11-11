package com.example.aspects;

import com.example.model.ErrorDetails;
import com.example.services.NotEnoughMoneyException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionControllerAdvice {

    @ExceptionHandler(NotEnoughMoneyException.class)
    public ResponseEntity<ErrorDetails> errorDetails(){
        ErrorDetails errorDetails = new ErrorDetails();
        errorDetails.setMessage("Payment is not working");
        return ResponseEntity
                .badRequest()
                .body(errorDetails);
    }
}
