package com.codeWithArsalon.Visitor.solution;

public class ReverbOperation implements Operation {
    @Override
    public void apply(FactSegment factSegment) {
        System.out.println("Reduce Reverb - FactSegment");
    }

    @Override
    public void apply(FormatSegment formatSegment) {
        System.out.println("Reduce Reverb - FormatSegment");
    }
}
