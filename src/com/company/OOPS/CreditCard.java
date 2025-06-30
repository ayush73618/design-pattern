package com.company.OOPS;

public class CreditCard extends Card {

    public CreditCard(String cardNumber,String userName){
        super(cardNumber,userName);

    }

    @Override
    public void pay() {
        System.out.println(getUserName()+" is Making Payment via Credit Card");
    }
}
