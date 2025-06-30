package com.company.BehaviouralPatterns.StrategyPattern;


class PaymentService{

    public void processPayment(String paymentMethod){
        if(paymentMethod.equals("CREDIT_CARD")){
            System.out.println("Payment through credit card");

        }else if(paymentMethod.equals("PAYPAL")){
            System.out.println("payment through paypal");
        }else{
            System.out.println("Unsupported Payment options");
        }
    }
}

public class WithoutStrategyPattern {

    public static void main(String[] args) {
        PaymentService ps = new PaymentService();

        ps.processPayment("CREDIT_CARD");
    }
}
