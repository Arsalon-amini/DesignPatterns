package com.codeWithArsalon.Command.editor;

public class BoldCommand implements UndoableCommand {
    private String prevContent;
    private HtmlDocument document; //composition relationship UML
    private History history; //composition relationship UML

    public BoldCommand(HtmlDocument document, History history) {
        this.document = document;
        this.history = history;
    }

    @Override
    public void execute() {
        prevContent = document.getContent();
        document.makeBold();
        history.push(this); //the current obj
    }

    @Override
    public void unexecute() {
        document.setContent(prevContent);
    }

}
