package com.neoteric.swiggyApplication.service;

import com.neoteric.swiggyApplication.model.Address;
import com.neoteric.swiggyApplication.model.Menu;
import com.neoteric.swiggyApplication.model.Restaurant;
import com.neoteric.swiggyApplication.model.UserLogin;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



class SwiggyApplicationServiceTest {

    +
    @Test
    void userLogin(){
        UserLogin userLogin = new UserLogin();
        userLogin.userName = "Chandra";
        userLogin.password = "Chandra@123";
        SwiggyApplicationService service = new SwiggyApplicationService();
        String details = service.userLogin(userLogin);
        Assertions.assertEquals("Login Successful",details);
    }

    @Test
    void restaurantService() {

        Restaurant restaurant = new Restaurant();
        restaurant.restaurantName = "Bawarchi";
        Menu[] menu = new Menu[5];
        menu[0]=new Menu("Chicken Biryani",4.0);
        menu[1]=new Menu("Paneer Biryani",4.1);
        menu[2]=new Menu("Mutton Biryani",4.2);
        menu[3]=new Menu("Fish Biryani",4.3);
        menu[4]=new Menu("Mushroom Biryani",4.4);
        Address restaurantAddress = new Address();
        restaurantAddress.area = "RTC X Road";
        restaurantAddress.landMark= "RTC X Road";
        restaurantAddress.pinCode = 50050;
        restaurant.menuList = menu;
        restaurant.address = restaurantAddress;
        SwiggyApplicationService service = new SwiggyApplicationService();
        Assertions.assertNotEquals("Bawarchi",service.restaurantService(restaurant));

      //  SwiggyApplicationService service = mock(SwiggyApplicationService.class);
        // Act
        service.restaurantService(restaurant);
        // Assert
     //   verify(service, times(1)).restaurantService(restaurant);
        Assertions.assertEquals("restaurant has been in the list",service.restaurantService(restaurant));

    }

}