package com.company.BehaviouralPatterns.StrategyPattern;

interface PaymentMethod{
    void pay();
}

class DebitCard implements PaymentMethod{

    @Override
    public void pay() {
        System.out.println("PAY through debit card");
    }
}

class CreditCard implements PaymentMethod{

    @Override
    public void pay() {
        System.out.println("pay through credit card");
    }
}


class PaymentServiceIn{

    PaymentMethod pm ;

    public void setPaymentMethod(PaymentMethod paymmentMethod){
        this.pm=paymmentMethod;
    }
    public void processPayment(){
        pm.pay();

    }
}

public class WithStrategyPattern {
    public static void main(String[] args) {
        PaymentMethod credit = new CreditCard();
        PaymentMethod debit = new DebitCard();
        PaymentServiceIn ps = new PaymentServiceIn();
        ps.setPaymentMethod(credit);
        ps.setPaymentMethod(debit);
//        ps.processPayment();
//        ps.processPayment();
    }
}
