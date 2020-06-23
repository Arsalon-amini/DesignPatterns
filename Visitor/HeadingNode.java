package com.codeWithArsalon.Visitor;

public class HeadingNode implements HtmlNode {

    @Override
    public void execute(Operation operation) {
        operation.apply(this); //will call .apply method that takes HeadingNode to be called!
    }
}
