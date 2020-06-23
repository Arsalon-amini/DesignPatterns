package com.codeWithArsalon.Composite.solution;

public class Demo {
    public static void show(){
        var subTeamOne = new Team();
        subTeamOne.addResource(new Truck());
        subTeamOne.addResource(new HumanResource());
        subTeamOne.addResource(new HumanResource());

        var subTeamTwo = new Team();
        subTeamTwo.addResource(new Truck());
        subTeamTwo.addResource(new HumanResource());
        subTeamTwo.addResource(new HumanResource());

        var teamOne = new Team();
        teamOne.addResource(subTeamOne);
        teamOne.addResource(new HumanResource());
        teamOne.deploy();

        var teamTwo = new Team();
        teamTwo.addResource(subTeamTwo);
        teamTwo.addResource(new Truck());
        teamTwo.deploy();
    }
}
