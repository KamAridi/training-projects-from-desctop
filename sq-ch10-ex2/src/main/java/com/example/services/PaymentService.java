package com.example.services;

import com.example.model.PaymentDetails;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public PaymentDetails paymentTransaction(){
        throw new NotEnoughMoneyException();
    }
}
