package com.company.OOPS;

public class Wallet implements PaymentMethod{
    @Override
    public void pay() {
        System.out.println("Making Payment via wallet");
    }
}
