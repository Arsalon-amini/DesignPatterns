package com.codeWithArsalon.Strategy;

public interface Compressor {
    //This is a functional interface
    //It offers one abstract method - compress()
    void compress(String fileName);
}
