package com.company.OOPS;

abstract  class Card implements  PaymentMethod{

    private String cardNumber;
    private String userName;

    public Card(String cardNumber,String userName){
        this.cardNumber = cardNumber;
        this.userName = userName;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getUserName() {
        return userName;
    }

}
