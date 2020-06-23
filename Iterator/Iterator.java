package com.codeWithArsalon.Iterator;

public interface Iterator<T> {
    //This interface has three abstract methods  - boolean hasNext(), T current(), void next()

    boolean hasNext();

    T current(); //generic interface

    void next();
}
