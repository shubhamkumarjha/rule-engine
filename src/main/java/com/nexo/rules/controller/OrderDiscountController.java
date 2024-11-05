package com.nexo.rules.controller;

import com.nexo.rules.model.OrderDiscount;
import com.nexo.rules.model.OrderRequest;
import com.nexo.rules.service.OrderDiscountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value = "/customer/1.0.0")
@RestController
public class OrderDiscountController {
    @Autowired
    private OrderDiscountService orderDiscountService;

    @PostMapping("/discount")
    public ResponseEntity<OrderDiscount> getDiscount(@RequestBody OrderRequest orderRequest) {
        OrderDiscount discount = orderDiscountService.getDiscount(orderRequest);
        return new ResponseEntity<>(discount, HttpStatus.OK);
    }
}
