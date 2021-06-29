package com.howtodoinjava.rest.model;

public class Customer {
		
	// atributos da classe	
	
	private Integer id;	
	// name		
	private String name;
	// cnpj
	private String cnpj;
	// cpf
	private String cpf;
	// email
	private String email;
	//telefone
	private Telefone telefone;
	
	// métodos
	
	// método construtor default - implícito
	public Customer() {

    }
    // método construtor personalizado - explícito
    public Customer(Integer id, String name, String cnpj, String cpf, String email, Telefone telefone) {
        super();
        this.id = id;
        this.name = name;
        this.cnpj = cnpj;
        this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
    }
    
    public Customer(Integer id, String name, String cnpj, String cpf, String email) {//, Telefone telefone
        super();
        this.id = id;
        this.name = name;
        this.cnpj = cnpj;
        this.cpf = cpf;
        this.email = email;
        //this.telefone = telefone;
    }

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
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
	
	// Métodos assessores GET E SET
	// Customer c1 = new Customer();

    
	
}