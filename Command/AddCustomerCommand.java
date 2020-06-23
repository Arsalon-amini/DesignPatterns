package com.codeWithArsalon.Command;

import com.codeWithArsalon.Command.fx.Command;

public class AddCustomerCommand implements Command {
    //This class inherits a single method .execute() from the Command Interface
    //This class has a dependency on a receiver object (CustomerService service)

    private CustomerService service;

    public AddCustomerCommand(CustomerService service) {
        this.service = service;
    }

    @Override
    public void execute() {
        service.addCustomer(); //running code on another object (dependency object)
        //dependent object (CustomerService) class implementation method details
        //polymorphism
    }
}
