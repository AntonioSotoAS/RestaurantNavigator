package com.RestaurantNavigator.domain;



public class Role {


    private int role;
    private String typeRole;

    public Role(int role, String typeRole) {
        this.role = role;
        this.typeRole = typeRole;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    public String getTypeRole() {
        return typeRole;
    }

    public void setTypeRole(String typeRole) {
        this.typeRole = typeRole;
    }

    @Override
    public String toString() {
        return "Role{" +
                "role=" + role +
                ", typeRole='" + typeRole + '\'' +
                '}';
    }
}
