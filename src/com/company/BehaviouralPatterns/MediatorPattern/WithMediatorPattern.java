package com.company.BehaviouralPatterns.MediatorPattern;

import java.util.ArrayList;
import java.util.List;

interface ChatMediator{
    void sendMessage(String msg,ChatUser user);
    void addUser(ChatUser user);
}
class ChatUser{
    private String name;

    ChatMediator chatMediator;

    public String getName() {
        return name;
    }

    public ChatUser(String name,ChatMediator chatMediator){
        this.name = name;
        this.chatMediator = chatMediator;
    }

    public void sendMessage(String msg){
        chatMediator.sendMessage(msg,this);
    }

    public void receiveMessage(String msg,ChatUser user){
        System.out.println(this.name + " received message "+msg+" from "+ user.getName());
    }
}

class ChatRoom implements ChatMediator{

    private List<ChatUser> users;

    public ChatRoom(){
        this.users = new ArrayList<>();
    }

    @Override
    public void sendMessage(String msg, ChatUser sender) {
        for(ChatUser user:users){
            if(user.getName().equals(sender.getName())) continue;
            user.receiveMessage(msg,sender);
        }
    }

    @Override
    public void addUser(ChatUser user) {
    users.add(user);
    }
}



public class WithMediatorPattern {
    public static void main(String[] args) {

        ChatMediator chatRoom = new ChatRoom();

        ChatUser rahul = new ChatUser("Rahul",chatRoom);
        ChatUser amit= new ChatUser("Amit",chatRoom);
        ChatUser ayush= new ChatUser("Ayush",chatRoom);
        ChatUser shivam = new ChatUser("Shivam",chatRoom);

        chatRoom.addUser(rahul);
        chatRoom.addUser(amit);
        chatRoom.addUser(ayush);
        chatRoom.addUser(shivam);

        amit.sendMessage("Hi Everyone");
    }
}
