package com.example.demo.pojo;

import org.springframework.stereotype.Component;
import lombok.Getter;
import lombok.Setter;
import java.util.Date;
@Component
public class Order {

    @Getter @Setter private String orderId;
    @Getter @Setter private String clientId;
    @Getter @Setter private Date orderDate;
    @Getter @Setter private String quantity;
    @Getter @Setter private String commont;

    /*
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getCommont() {
        return commont;
    }

    public void setCommont(String commont) {
        this.commont = commont;
    }
**/
}
