package com.howtodoinjava.rest.model;

import java.util.ArrayList;
import java.util.List;

public class Telefones 

{
	//atributo
    private List<Telefone> telefoneList;
    
    //método
    public List<Telefone> getTelefoneList() {
        if(telefoneList == null) {
            telefoneList = new ArrayList<>();
        }
        return telefoneList;
    }
 
    //método
    public void setTelefoneList(List<Telefone> telefoneList) {
        this.telefoneList = telefoneList;
    }
}
