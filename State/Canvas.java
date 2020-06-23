package com.codeWithArsalon.State;

public class Canvas {
    //This Parent Class is composed of the Tool interface

    private Tool currentTool;

    public void setCurrentTool(Tool currentTool) {
        this.currentTool = currentTool;
    }

    public void mouseDown(){
        currentTool.mouseDown();
    }

    public void mouseUp(){
        currentTool.mouseUp();
    }

    public Tool getCurrentTool() {
        return currentTool;
    }


}
