package com.howtodoinjava.rest.test;

import com.howtodoinjava.rest.model.Customer;
import com.howtodoinjava.rest.model.Telefone;

public class InstanceCostumer {

	public static void main(String[] args) {
		Customer customer = new Customer();
		customer.setId(1);
		customer.setName("Maria");
		
		System.out.println(customer.getId());
		System.out.println(customer.getName());
		System.out.println(customer.getEmail());
		
		Telefone telefone = new Telefone();
		telefone.setId(10);
		telefone.setDdd("21");
		telefone.setNumero("21968337632");
		
		customer.setTelefone(telefone);
	}

}
