package com.RestaurantNavigator.domain;



public class Role {


    private int idRole;
    private String typeRole;

    public Role(int idRole, String typeRole) {
        this.idRole = idRole;
        this.typeRole = typeRole;
    }

    public int getIdRole() {
        return idRole;
    }

    public void setIdRole(int idRole) {
        this.idRole = idRole;
    }

    public String getTypeRole() {
        return typeRole;
    }

    public void setTypeRole(String typeRole) {
        this.typeRole = typeRole;
    }
}
