package com.codeWithArsalon.Visitor.solution;

import com.codeWithArsalon.Visitor.solution.Segment;

public class FactSegment implements Segment {
    @Override
    public void execute(Operation operation) {
        operation.apply(this);
    }
}
