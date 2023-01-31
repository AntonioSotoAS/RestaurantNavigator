package com.RestaurantNavigator.domain;

import java.sql.Date;

public class Request {

    private int idRequest;

    private User idUser;

    private String state;

    private Date update_at;

    private Date create_at;

    public Request(int idRequest, User idUser, String state, Date update_at, Date create_at) {
        this.idRequest = idRequest;
        this.idUser = idUser;
        this.state = state;
        this.update_at = update_at;
        this.create_at = create_at;
    }

    public int getIdRequest() {
        return idRequest;
    }

    public void setIdRequest(int idRequest) {
        this.idRequest = idRequest;
    }

    public User getIdUser() {
        return idUser;
    }

    public void setIdUser(User idUser) {
        this.idUser = idUser;
    }

    public String getState() {
        return state;
    }

    public void setState(String estado) {
        this.state = state;
    }

    public Date getUpdate_at() {
        return update_at;
    }

    public void setUpdate_at(Date update_at) {
        this.update_at = update_at;
    }

    public Date getCreate_at() {
        return create_at;
    }

    public void setCreate_at(Date create_at) {
        this.create_at = create_at;
    }

    @Override
    public String toString() {
        return "Request{" +
                "idRequest=" + idRequest +
                ", idUser=" + idUser +
                ", state='" + state + '\'' +
                ", update_at=" + update_at +
                ", create_at=" + create_at +
                '}';
    }
}
