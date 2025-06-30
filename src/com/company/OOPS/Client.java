package com.company.OOPS;

public class Client {
    public static void main(String[] args) {
        PaymentService ps = new PaymentService();
        ps.addPaymentMethod("AyushDebitCard",new DebitCard("1233","Ayush Sharma"));

        ps.addPaymentMethod("AyushCreditCard",new CreditCard("1253","Ayush Jha"));

        ps.addPaymentMethod("AyushUpi",new UPI("ayush@upi"));
        ps.addPaymentMethod("AyushWallet",new Wallet());

        ps.makePayment("AyushUpi");
        ps.makePayment("AyushDebitCard");
        ps.makePayment("AyushCreditCard");
        ps.makePayment("AyushWallet");
    }
}
