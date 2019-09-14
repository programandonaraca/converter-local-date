package br.com.programandonaraca.converterlocaldate.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Pessoa {
	
	private String nome;
	private String idade;
	private LocalDate nascimento;
	private LocalDateTime dataHoraNascimento;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getIdade() {
		return idade;
	}
	public void setIdade(String idade) {
		this.idade = idade;
	}
	public LocalDate getNascimento() {
		return nascimento;
	}
	public void setNascimento(LocalDate nascimento) {
		this.nascimento = nascimento;
	}
	public LocalDateTime getDataHoraNascimento() {
		return dataHoraNascimento;
	}
	public void setDataHoraNascimento(LocalDateTime dataHoraNascimento) {
		this.dataHoraNascimento = dataHoraNascimento;
	}

	
}
