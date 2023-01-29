package com.RestaurantNavigator.repository.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "order_detail")
public class OrderDetail {

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
}
