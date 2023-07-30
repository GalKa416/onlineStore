package com.example.storewebadd1.controller;

import com.example.storewebadd1.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {
    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/add")
    public List<Integer> addItems(@RequestParam List<Integer> itemsIds) {
        return orderService.addItems(itemsIds);
    }

    @GetMapping("/get")
    public List<Integer> getItems() {
        return orderService.getItems();

    }
}
