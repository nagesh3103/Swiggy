package com.neoteric.swiggyApplication.model;

import java.lang.reflect.Array;
import java.util.UUID;

public class Order {
    public String orderId;
    public Array[] orderItem;
    public int orderQuantity;
    public Address orderAddress;

}
