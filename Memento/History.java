package com.codeWithArsalon.Memento;

import java.util.ArrayList;
import java.util.List;

public class History {
    private List<EditorState> states = new ArrayList<>();

    public void push(EditorState state){
        states.add(state);
    }

    public EditorState pop(){
        var lastIndex = states.size() - 1; //index of last item
        var lastState = states.get(lastIndex); //get item at given index
        states.remove(lastIndex); //remove state from list

        return lastState; //return last state
    }
}








