package com.example.storewebadd1.service;

import com.example.storewebadd1.model.Cart;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OrderServiceImpl implements OrderService {
    private final Cart cart;

    public OrderServiceImpl(Cart cart) {
        this.cart = cart;
    }

    @Override
    public List<Integer> addItems(List<Integer> itemsIds) {
        return cart.addItems(itemsIds);
    }

    @Override
    public List<Integer> getItems() {
        return cart.getItems();
    }
}
