package com.spring.mongo.embeded.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.mongo.embeded.api.model.User;
import com.spring.mongo.embeded.api.repository.OnlineOrderRepository;

@RestController
@RequestMapping("/order-service")
public class OnlineOrderManagementController {

    @Autowired
    private OnlineOrderRepository onlineOrderRepository;

    @PostMapping("/placeOrder")
    public String placeOrder(@RequestBody User user) {

        onlineOrderRepository.save(user);
        return "Order Place Successfully";
    }

    @GetMapping("/getUserByName/{name}")
    public List<User> getUserByName(@PathVariable String name) {
        return onlineOrderRepository.findByName(name);
    }

    @GetMapping("/getUserByAddress/{city}")
    public List<User> getUserByAddress(@PathVariable String city) {
        return onlineOrderRepository.findByCity(city);
    }

}
