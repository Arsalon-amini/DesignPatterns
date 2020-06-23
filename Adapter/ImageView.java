package com.codeWithArsalon.Adapter;

public class ImageView {
    private Image image;

    public ImageView(Image image) {
        this.image = image;
    }

    public void apply(Filter filter){
        filter.apply(image); //Requires a class in Filter Interface Form
    }
}
