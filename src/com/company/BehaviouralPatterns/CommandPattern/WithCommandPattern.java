package com.company.BehaviouralPatterns.CommandPattern;


interface Command{
    void execute();
}

class BoldCommand implements Command{

    private TextEditorII textEditorII;

    public BoldCommand(TextEditorII textEditorII){
        this.textEditorII = textEditorII;
    }

    @Override
    public void execute() {
        textEditorII.boldText();
    }
}

class ItalicCommand implements Command{

    private TextEditorII textEditorII;

    public ItalicCommand(TextEditorII textEditorII){
        this.textEditorII = textEditorII;
    }

    @Override
    public void execute() {
        textEditorII.italicText();
    }
}

class Button{
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void click(){
        command.execute();
    }
}

class TextEditorII{
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

public class WithCommandPattern {
    public static void main(String[] args) {
        TextEditorII textEditorII = new TextEditorII();

        Button button = new Button();
        button.setCommand(new BoldCommand(textEditorII));
        button.click();
        button.setCommand(new ItalicCommand(textEditorII));
        button.click();
    }
}
