package com.codeWithArsalon.State;

public class EraserTool implements Tool {
    //This class implements the Tool interface and inherits two abstract methods
    //polymorphic implementation
    //behavioral methods - mouseDown() and mouseUp()

    @Override
    public void mouseDown() {
        System.out.println("Eraser icon");
    }

    @Override
    public void mouseUp() {
        System.out.println("Erase something");
    }
}
