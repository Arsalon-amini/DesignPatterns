package com.codeWithArsalon.Visitor;

public interface HtmlNode {
    void execute(Operation operation); //extensibility point
}
