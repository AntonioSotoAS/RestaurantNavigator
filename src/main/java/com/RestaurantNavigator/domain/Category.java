package com.RestaurantNavigator.domain;



public class Category{

    private int idCategory;

    private String nameCategory;

    private String photoCategory;

    public Category(int idCategory, String nameCategory, String photoCategory) {
        this.idCategory = idCategory;
        this.nameCategory = nameCategory;
        this.photoCategory = photoCategory;
    }

    public int getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(int idCategory) {
        this.idCategory = idCategory;
    }

    public String getNameCategory() {
        return nameCategory;
    }

    public void setNameCategory(String nameCategory) {
        this.nameCategory = nameCategory;
    }

    public String getPhotoCategory() {
        return photoCategory;
    }

    public void setPhotoCategory(String photoCategory) {
        this.photoCategory = photoCategory;
    }

    @Override
    public String toString() {
        return "Category{" +
                "idCategory=" + idCategory +
                ", nameCategory='" + nameCategory + '\'' +
                ", photoCategory='" + photoCategory + '\'' +
                '}';
    }
}
