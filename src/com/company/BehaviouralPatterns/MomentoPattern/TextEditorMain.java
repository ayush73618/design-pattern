package com.company.BehaviouralPatterns.MomentoPattern;

import java.time.Instant;

public class TextEditorMain {
    public static void main(String[] args) {

        TextEditor editor = new TextEditor();
        HistoryEditor historyEditor = new HistoryEditor(); // History Management
        editor.write("Hello World brother");
        historyEditor.saveState(editor);
        editor.write("New World brother");
        historyEditor.saveState(editor);
        editor.write("Hi how are you my World");
        historyEditor.saveState(editor);
        System.out.println(editor.getContent());
        historyEditor.undo(editor);
        System.out.println(editor.getContent());
        historyEditor.undo(editor);
        System.out.println(editor.getContent());
    }
}
