package com.company.BehaviouralPatterns.MomentoPattern;

//Momento Class which Stores Internal states of the Text Editor;

public class EditorMomento {

    private final String content;

    public EditorMomento(String content){
        this.content  = content;
    }

    public String getContent() {
        return content;
    }
}
