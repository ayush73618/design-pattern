package com.company.BehaviouralPatterns.MomentoPattern;

//A text editor where the user can undo changes, such as text addition,delete or formatting.
//Teh editor stores snapshots of it's state (text content) after each change,
// enabling the user to revert to previous states
public class TextEditor {
    private String content;

    public void write(String text){
        this.content = text;
    }

    public String getContent(){
        return this.content;
    }

    //Save the current state of Editor
    public EditorMomento save(){
        return  new EditorMomento(content);
    }


    //Restore (Momento -> update the state of current content)
    public void restore(EditorMomento momento){
        content = momento.getContent();
    }

}
