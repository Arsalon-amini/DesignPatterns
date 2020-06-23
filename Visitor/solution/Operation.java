package com.codeWithArsalon.Visitor.solution;

public interface Operation {
    void apply(FactSegment factSegment);
    void apply(FormatSegment formatSegment);
}
