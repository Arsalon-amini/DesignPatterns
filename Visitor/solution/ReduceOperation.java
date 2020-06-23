package com.codeWithArsalon.Visitor.solution;

public class ReduceOperation implements Operation {
    @Override
    public void apply(FactSegment factSegment) {
        System.out.println("ReduceNoise - FactSegment");
    }

    @Override
    public void apply(FormatSegment formatSegment) {
        System.out.println("ReduceNoise - FormatSegment");
    }
}
