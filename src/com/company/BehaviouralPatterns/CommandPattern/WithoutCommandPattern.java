package com.company.BehaviouralPatterns.CommandPattern;

import org.w3c.dom.Text;

public class WithoutCommandPattern {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();

        BoldButton boldButton = new BoldButton(editor) ; //Tightly Coupled with TextEditor if action changes
        //All button class needs to be modified;
        boldButton.click();
        ItalicizeText italicizeText = new ItalicizeText(editor);

        italicizeText.click();

    }
}

class TextEditor{
    public void boldText(){
        System.out.println("Text has been bold");
    }

    public void italicText(){
        System.out.println("Text has been italic");
    }

    public void underLineText(){
        System.out.println("Text has been underLined");
    }
}

//UI Button Classes

class BoldButton{

    private TextEditor textEditor;

    public BoldButton(TextEditor textEditor){
        this.textEditor = textEditor;
    }
    public void click(){
        textEditor.boldText();

    }
}

class ItalicizeText{

    private TextEditor textEditor;

    public ItalicizeText(TextEditor textEditor){
        this.textEditor = textEditor;
    }
    public void click(){
        textEditor.italicText();

    }
}
