package com.company.OOPS;

public class DebitCard extends Card{

    public DebitCard(String cardNumber,String userName){
        super(cardNumber,userName);

    }

    @Override
    public void pay() {
        System.out.println("Making Payment via Debit Card");
    }
}
