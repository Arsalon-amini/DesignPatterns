package com.codeWithArsalon.Composite.solution;

import java.util.ArrayList;
import java.util.List;

public class Team implements Component {
    private List<Component> resources = new ArrayList<>();

    public void addResource(Component resource){
        resources.add(resource);
    }

    @Override
    public void deploy() {
        for (var resource : resources)
            resource.deploy();
    }
}
