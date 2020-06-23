package com.codeWithArsalon.Command;

import com.codeWithArsalon.Command.fx.Command;

public class ResizeCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Resize");
    }
}
