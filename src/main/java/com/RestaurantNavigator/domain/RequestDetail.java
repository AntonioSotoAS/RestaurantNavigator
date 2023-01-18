package com.RestaurantNavigator.domain;

public class RequestDetail {

    private int idRequestDetail;

    private Product idProduct;

    private Request idRequest;

    private int cantidad;

    public RequestDetail(int idRequestDetail, Product idProduct, Request idRequest, int cantidad) {
        this.idRequestDetail = idRequestDetail;
        this.idProduct = idProduct;
        this.idRequest = idRequest;
        this.cantidad = cantidad;
    }

    public int getIdRequestDetail() {
        return idRequestDetail;
    }

    public void setIdRequestDetail(int idRequestDetail) {
        this.idRequestDetail = idRequestDetail;
    }

    public Product getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(Product idProduct) {
        this.idProduct = idProduct;
    }

    public Request getIdRequest() {
        return idRequest;
    }

    public void setIdRequest(Request idRequest) {
        this.idRequest = idRequest;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "RequestDetail{" +
                "idRequestDetail=" + idRequestDetail +
                ", idProduct=" + idProduct +
                ", idRequest=" + idRequest +
                ", cantidad=" + cantidad +
                '}';
    }
}
