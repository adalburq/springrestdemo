package com.howtodoinjava.rest.test;

import com.howtodoinjava.rest.model.Aluno;
import com.howtodoinjava.rest.model.Turma;

public class InstanceTurma {

	public static void main(String[] args) {
		
		Aluno a = new Aluno();
		a.setNome("Joao");
		a.setMatricula("1a");
		a.setId(1);
		
		Turma t1 = new Turma();
		t1.setId(1);
		t1.setCodigo("101A");
		t1.setTotal(1);
		
		t1.setAluno(a);
		
		System.out.println(t1.getCodigo());
		System.out.println(t1.getTotal());
		System.out.println(a.getNome());

	}

}
