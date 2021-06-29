package com.howtodoinjava.rest.dao;

import org.springframework.stereotype.Repository;

import com.howtodoinjava.rest.model.Customer;
import com.howtodoinjava.rest.model.Customers;
import com.howtodoinjava.rest.model.Telefone;

@Repository
public class CustomerDAO {
    private static Customers list = new Customers();

    public static Telefone t1 = new Telefone(1, "21", "976665879");
    public static Telefone t2 = new Telefone(2, "21", "978658897");
    public static Telefone t3 = new Telefone(3, "23", "987451614");
    public static Customer c = new Customer(1, "Ricardo", "null", "65487941217", "r.zontah@gmail.com", t1);
    static

    {
        list.getCustomerList().add(c);
        list.getCustomerList().add(new Customer(2, "Igor", "null", "71257688714", "iof7@sony.com", t2));
        list.getCustomerList().add(new Customer(3, "Michael", "null", "53691236823", "michael@andrettiracing.com", t3));
    }

    public Customers getAllCustomers() {
        return list;
    }

    public void addCustomer(Customer customer) {
        list.getCustomerList().add(customer);
    }
}
