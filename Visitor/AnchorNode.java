package com.codeWithArsalon.Visitor;

public class AnchorNode implements HtmlNode {
    //open to new types of operations
    //don't have to modify class, has extensibility point

    @Override
    public void execute(Operation operation) {
        operation.apply(this);
    }
}
