package com.example.demo.DependencyInjection;

import org.springframework.stereotype.Component;

@Component
public class OrderService {
    PaymentService paymentService;

    OrderService(PaymentService paymentService){
        this.paymentService = paymentService;
    }

    public void setPaymentService(PaymentService paymentService){
        this.paymentService=paymentService;
    }
    public void placeOrder(){
        paymentService.payment();
        System.out.println("Order Placed");
    }
}
