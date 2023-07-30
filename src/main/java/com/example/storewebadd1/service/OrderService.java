package com.example.storewebadd1.service;


import java.util.List;

public interface OrderService {
    List<Integer>addItems(List<Integer>itemsIds);
    List<Integer>getItems();
}
