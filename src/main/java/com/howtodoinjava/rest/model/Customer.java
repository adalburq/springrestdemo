package com.howtodoinjava.rest.model;

public class Customer {
	//atributos da classe
	private Integer id;
	private String name;
	private String CNPJ;
	private String CPF;
	private String email;
	private Telefone telefone;
 
	//método construtor default - implícito
	public Customer() {

	}
	
	//método construtor personalizado - explícito
	public Customer(Integer id, String name, String CNPJ, String CPF, String email, Telefone telefone) {
		super();
		this.id = id;
		this.name = name;
		this.CNPJ = CNPJ;
		this.CPF = CPF;
		this.email = email;
		this.telefone = telefone;

	}
	// Gerar GET e SET
	// alt + shift + s
	// shift + r
	
	//métodos acessores Get Set
	public Integer getId() {
		return id;
	}

	public void Setid(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCNPJ() {
		return CNPJ;
	}

	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Telefone getTelefone() {
		return telefone;
	}

	public void setTelefone(Telefone telefone) {
		this.telefone = telefone;
	}

	public void setId(Integer id) {
		this.id = id;
	}

}