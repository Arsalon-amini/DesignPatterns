package com.codeWithArsalon.Template;

public class GenerateReportClass extends Task{
    //This child class inherits one method from its abstract parent class - doExecute();

    @Override
    protected void doExecute() {
        System.out.println("Generating a report");
    }
}
