package com.educandoweb.course.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_Aluno")
public class Instrutor {
     
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 @Column private Integer id_intrutor;
	 private Integer rg;
	 private String name;
	 private Date nascimento;
	 private Integer titulacao;
	 
	 @OneToMany (mappedBy =   "instrutor")
	 private List <Turma> turmas = new ArrayList<>();
	 public Instrutor () {
		 
	 }

	public Instrutor (Integer id, Integer rg, String name, Date nascimento, Integer titulacao) {
		super();
		this.id_intrutor = id;
		this.rg = rg;
		this.name = name;
		this.nascimento = nascimento;
		this.titulacao = titulacao;
	}

	public Integer getId() {
		return id_intrutor;
	}

	public void setId(Integer id) {
		this.id_intrutor = id;
	}

	public Integer getRg() {
		return rg;
	}

	public void setRg(Integer rg) {
		this.rg = rg;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getNascimento() {
		return nascimento;
	}

	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}

	public Integer getTitulacao() {
		return titulacao;
	}

	public void setTitulacao(Integer titulacao) {
		this.titulacao = titulacao;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id_intrutor);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return Objects.equals(id_intrutor, other.id_intrutor);
	}
	 
}
