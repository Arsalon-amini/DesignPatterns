package com.codeWithArsalon.Strategy;

public class JpegCompressor implements Compressor {
    //This class inherits one abstract method by implementing the Compressor functional Interface - compress()
    @Override
    public void compress(String fileName) {
        System.out.println("Compressing using Jpeg");

    }
}
