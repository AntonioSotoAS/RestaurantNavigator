package com.RestaurantNavigator.domain;



public class Category{

    private int idCategory;

    private String name;

    private String photo;

    public Category(int idCategory, String name, String photo) {
        this.idCategory = idCategory;
        this.name = name;
        this.photo = photo;
    }

    public int getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(int idCategory) {
        this.idCategory = idCategory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    @Override
    public String toString() {
        return "Category{" +
                "idCategory=" + idCategory +
                ", name='" + name + '\'' +
                ", photo='" + photo + '\'' +
                '}';
    }
}
