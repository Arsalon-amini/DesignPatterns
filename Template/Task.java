package com.codeWithArsalon.Template;

public abstract class Task {
    //This abstract class functions as a functional interface
    // if defines one abstract method it's children inherit from parent - doExecute();
    //it is also dependent on an auditTrail object

    private AuditTrail auditTrail;

    public Task(){
        auditTrail = new AuditTrail(); //default constructor, creates an auditTrail object
    }

    public Task(AuditTrail auditTrail) { //method overloaded constructor
        this.auditTrail = auditTrail; //can pass auditTrail to other tasks
    }

    public void execute(){
        auditTrail.record(); //internal method called under the hood when children .execute()

        doExecute(); //abstract method polymorphic implemented by Children sub-classes
    }

    protected abstract void doExecute(); //polymorphic abstract method
}


