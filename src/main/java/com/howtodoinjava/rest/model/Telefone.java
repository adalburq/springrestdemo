package com.howtodoinjava.rest.model;

public class Telefone {
	
	// chave primária da tabela do banco de dados
	private Integer id;
	//	  ddd 
	private String ddd;

	//	  numero
	private String numero;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDdd() {
		return ddd;
	}

	public void setDdd(String ddd) {
		this.ddd = ddd;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	// exemplo : private Telefone telefone;
}

