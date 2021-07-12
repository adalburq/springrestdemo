package com.howtodoinjava.rest.test;

import com.howtodoinjava.rest.model.Customer;
import com.howtodoinjava.rest.model.Telefone;

public class InstanceCostumer {

	public static void main(String[] args) {
		Customer customer = new Customer();
		System.out.println(customer.getId());
		customer.setId(1);
		customer.setName("Maria");
		
		System.out.println(customer.getId());
		System.out.println(customer.getName());
		System.out.println(customer.getEmail());
		
		Telefone telefone = new Telefone();
		telefone.setId(10);
		telefone.setDdd("21");
		telefone.setNumero("21968337632");
		
		System.out.println(customer.getTelefone());
		customer.setTelefone(telefone);
		System.out.println(customer.getTelefone());
	    System.out.println(customer.getTelefone().getDdd());

	}

}
