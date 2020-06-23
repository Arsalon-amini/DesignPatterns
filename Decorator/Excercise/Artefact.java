package com.codeWithArsalon.Decorator.Excercise;

public class Artefact {
    private String name;
    private boolean hasError;
    private boolean isMain;

    public Artefact(String name) {
        this.name = name;
    }

    public String render() {
        // The current implementation is not easily extensible. If tomorrow we need
        // to support other special markers, we have to come back and modify this class.

        // Every time we need to support a new marker, we have to come back and modify
        // this class. Over time, the code in this class gets more and more convoluted
        // with several if statements and additional fields.

        String errorIcon = hasError ? "[Error]" : "";
        String mainIcon = isMain ? "[Main]" : "";

        return String.format("%s %s %s", name, errorIcon, mainIcon);
    }

    public void setHasError(boolean hasError) {
        this.hasError = hasError;
    }

    public void setMain(boolean main) {
        isMain = main;
    }
}
