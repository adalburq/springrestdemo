package com.howtodoinjava.rest.model;

import java.util.ArrayList;
import java.util.List;

public class Customers 
{
    private List<Customer> customerList;
    
    public List<Customer> getCustomerList() {
        if(customerList == null) {
        	customerList = new ArrayList<>();
        }
        return customerList;
    }
 
    public void setCustomersList(List<Customer> costumerList) {
        this.customerList = costumerList;
    }
}
