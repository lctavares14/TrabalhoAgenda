package modelo;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Pessoa {
	
	private String nome;
	private LocalDate datanascimento;
	private Double altura;
	
		public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public LocalDate getDatanascimento() {
		return datanascimento;
	}

	public void setDatanascimento(LocalDate datanascimento) {
		this.datanascimento = datanascimento;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	public Pessoa(String nome, LocalDate nascimento, Double altura) {
		this.nome = nome;
		this.datanascimento = nascimento;
		this.altura = altura;
	}
	public Long idade() {
		return ChronoUnit.YEARS.between(datanascimento, LocalDate.now());
	}
	@Override
	public String toString() {
		return "Nome: "+nome+" idade: " +idade()+ " altura: "+altura;
	}
}
