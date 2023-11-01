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
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
@Entity
@Table(name = "tb_Turma")
public class Turma {
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 @Column private Integer turma;
	  private Date horario;
	  private Integer duracao;
	  private Date dataInicio;
	  private Date dataFim;
	  
	  @ManyToOne
	  @JoinColumn(name= "Idinstrutor_turma", referencedColumnName = "id_intrutor")
	  private List <Instrutor> instrutor = new ArrayList<>();
	  
	  public Turma () {
		  
	  }

	public Turma(Integer turma, Date horario, Integer duracao, Date dataInicio, Date dataFim) {
		super();
		this.turma = turma;
		this.horario = horario;
		this.duracao = duracao;
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
	}

	public Integer getTurma() {
		return turma;
	}

	public void setTurma(Integer turma) {
		this.turma = turma;
	}

	public Date getHorario() {
		return horario;
	}

	public void setHorario(Date horario) {
		this.horario = horario;
	}

	public Integer getDuracao() {
		return duracao;
	}

	public void setDuracao(Integer duracao) {
		this.duracao = duracao;
	}

	public Date getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}

	public Date getDataFim() {
		return dataFim;
	}

	public void setDataFim(Date dataFim) {
		this.dataFim = dataFim;
	}

	@Override
	public int hashCode() {
		return Objects.hash(turma);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Turma other = (Turma) obj;
		return Objects.equals(turma, other.turma);
	}
	  	
}
