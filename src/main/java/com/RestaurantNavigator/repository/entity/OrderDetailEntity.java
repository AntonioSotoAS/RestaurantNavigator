package com.RestaurantNavigator.repository.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "order_detail")
public class OrderDetailEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_order_detail")
    private int idOrderDetail;


    @OneToOne
    @JoinColumn(name = "id_product")
    private ProductEntity idProduct;

    private int amount;

    @OneToOne
    @JoinColumn(name = "id_order")
    private OrderEntity idOrder;

    public int getIdOrderDetail() {
        return idOrderDetail;
    }

    public void setIdOrderDetail(int idOrderDetail) {
        this.idOrderDetail = idOrderDetail;
    }

    public ProductEntity getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(ProductEntity idProduct) {
        this.idProduct = idProduct;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public OrderEntity getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(OrderEntity idOrder) {
        this.idOrder = idOrder;
    }
}
