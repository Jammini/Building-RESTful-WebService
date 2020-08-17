package com.example.restservice.payroll.hadler;

public class OrderNotFoundException extends RuntimeException {
    public OrderNotFoundException(Long id)  {
        super("Could not find Order " + id);
    }
}
