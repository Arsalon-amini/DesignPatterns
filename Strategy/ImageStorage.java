package com.codeWithArsalon.Strategy;

public class ImageStorage {
    //This class is coupled (dependent) on two classes - Compressor Interface & Filter Interface
    //internal class objects dependency - String fileName, Compressor compressor, Filter filter

    public void store(String fileName, Compressor compressor, Filter filter){
       compressor.compress(fileName);
       filter.apply(fileName);
    }
}
