package com.codeWithArsalon.Decorator;

public class CompressedCloudStream implements Stream{
    private Stream stream; //Decoupled object - talking to the stream interface

    public CompressedCloudStream(Stream stream) {
        this.stream = stream; //Can pass any stream - CloudStream, EncryptedStream
    }

    @Override
    public void write(String data) {
        var compressed = compress(data);
        stream.write(compressed);
    }

    private String compress(String data){
        return data.substring(0, 5); //returns first 5 characters in string
    }
}
