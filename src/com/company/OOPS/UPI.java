package com.company.OOPS;

public class UPI implements  PaymentMethod{

    String upiId;

    UPI(String upiId){
        this.upiId = upiId;
    }

    public String getUpiId() {
        return upiId;
    }

    @Override
    public void pay() {
        System.out.println("Making Payment via UPI "+upiId);
    }
}
