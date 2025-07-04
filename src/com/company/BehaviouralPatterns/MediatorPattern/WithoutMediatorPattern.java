package com.company.BehaviouralPatterns.MediatorPattern;


//Chat System

class User{
    private String name;

    public String getName() {
        return name;
    }

    public User(String name){
        this.name = name;
    }

    public void sendMessage(String msg,User recipient){
        System.out.println(this.name + " is sending "+msg +" to "+ recipient.getName());

    }
}


public class WithoutMediatorPattern {
    public static void main(String[] args) {

        User rahul = new User("Rahul");
        User amit= new User("Amit");
        User ayush= new User("Ayush");
        User shivam = new User("Shivam");

        rahul.sendMessage("Hello",amit);
        rahul.sendMessage("Hello",ayush);
        rahul.sendMessage("Hello",shivam);

    }
}
