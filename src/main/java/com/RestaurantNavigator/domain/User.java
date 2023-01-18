package com.RestaurantNavigator.domain;



public class User {


    private int idUser;
    private Role idRole;

    private String user;

    private String password;

    private String name;

    private  String lastName;

    private String photo;

    public User(int idUser, Role idRole, String user, String password, String name, String lastName, String photo) {
        this.idUser = idUser;
        this.idRole = idRole;
        this.user = user;
        this.password = password;
        this.name = name;
        this.lastName = lastName;
        this.photo = photo;
    }


    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public Role getIdRole() {
        return idRole;
    }

    public void setIdRole(Role idRole) {
        this.idRole = idRole;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    @Override
    public String toString() {
        return "User{" +
                "idUser=" + idUser +
                ", idRole=" + idRole +
                ", user='" + user + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", photo='" + photo + '\'' +
                '}';
    }
}
