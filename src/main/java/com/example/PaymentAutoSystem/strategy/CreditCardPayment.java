package com.example.PaymentAutoSystem.strategy;

public class CreditCardPayment implements PaymentStrategy{


    @Override
    public void pay(int amount) {
        System.out.println("Pagamento via cartão de crédito");
    }
}
