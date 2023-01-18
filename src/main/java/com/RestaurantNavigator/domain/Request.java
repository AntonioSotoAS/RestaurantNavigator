package com.RestaurantNavigator.domain;

import java.sql.Date;

public class Request {

    private int idRequest;

    private User idUser;

    private String estado;

    private Date update_at;

    private Date create_at;

    public Request(int idRequest, User idUser, String estado, Date update_at, Date create_at) {
        this.idRequest = idRequest;
        this.idUser = idUser;
        this.estado = estado;
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

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
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
                ", estado='" + estado + '\'' +
                ", update_at=" + update_at +
                ", create_at=" + create_at +
                '}';
    }
}
