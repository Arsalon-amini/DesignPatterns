package com.codeWithArsalon.State;

public class SelectionTool implements Tool {
    //This class implements the Tool interface and inherits two abstract methods
    //polymorphic implementation
    //behavioral methods - mouseDown() and mouseUp()

    @Override
    public void mouseDown() {
        System.out.println("Selection Icon");
    }

    @Override
    public void mouseUp() {
        System.out.println("Draw a dashed rectangle");
    }
}
