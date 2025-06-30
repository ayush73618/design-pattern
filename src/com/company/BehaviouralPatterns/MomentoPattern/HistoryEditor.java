package com.company.BehaviouralPatterns.MomentoPattern;


import java.util.Stack;

//Managing the momento
public class HistoryEditor {

    private final Stack<EditorMomento> historyStack = new Stack<>();
    public void saveState(TextEditor editor){
        historyStack.push(editor.save());
    }

    public  void undo(TextEditor editor){
        if(!historyStack.isEmpty()){
            historyStack.pop();
            editor.restore(historyStack.peek());
        }
    }

}
