package com.howtodoinjava.rest.model;

public class TesteModel {

	public static void main(String[] args) {
		
		// Levantar um objeto da classe Customer
		// Todo objeto é uma instância de uma classe
		Customer c = new Customer();
		
		Telefone t = new Telefone();
		t.setDdd("21");
		t.setNumero("969696969");
		c.setTelefone(t);
		
		c.setName("João");
	}

}
