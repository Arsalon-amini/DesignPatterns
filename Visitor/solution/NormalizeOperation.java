package com.codeWithArsalon.Visitor.solution;

public class NormalizeOperation implements Operation {
    @Override
    public void apply(FactSegment factSegment) {
        System.out.println("Normalize - FactSegment");
    }

    @Override
    public void apply(FormatSegment formatSegment) {
        System.out.println("Normalize - FormatSegment");

    }
}
