package com.example.informationbook;

public class ModelClass {

    public String image_name;
    public String category_name;

    public ModelClass(String image_name, String category_name) {
        this.image_name = image_name;
        this.category_name = category_name;
    }

    public String getImage_name() {
        return image_name;
    }

    public String getCategory_name() {
        return category_name;
    }
}
