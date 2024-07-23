package com.neoteric.swiggyApplication.service;

import com.neoteric.swiggyApplication.model.Menu;
import com.neoteric.swiggyApplication.model.Order;
import com.neoteric.swiggyApplication.model.Restaurant;
import com.neoteric.swiggyApplication.model.UserLogin;

import java.util.UUID;

public class SwiggyApplicationService {
    String savedUserName = "Chandra";
    String savedPassword = "Chandra@123";

    public String userLogin(UserLogin userLogin) {

        if (savedUserName.equals(userLogin.userName) && savedPassword.equals(userLogin.password)) {
            return "Login Successful";
        } else {
            return "Login Unsuccessful";
        }
    }

    public String restaurantService(Restaurant restaurant) {
        String selectedRestaurant = "Bawarchi";
        if (restaurant.restaurantName.equals(selectedRestaurant)) {
            Restaurant restaurant1 = new Restaurant();
            restaurant1.restaurantName = "Bawarchi";
            restaurant1.menuList = restaurant.menuList;
            restaurant1.restuarantRating = 4.5;
            restaurant1.address = restaurant.address;
            System.out.println(restaurant1);
            return "restaurant has been in the list";
        } else {
            System.out.println(selectedRestaurant + " is not found");
        }
        return "not in list";
    }

//    public Order createOrder(Restaurant restaurant) {
//        Order order = new Order();
//        order.orderId = "orderID= " + UUID.randomUUID().toString();
//        order.orderItem = restaurant.menuList;
//        return order;
//    }
}



















