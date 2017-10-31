package br;

public class Pessoa {

	private String nome;
	private Genero sexo;

	public Pessoa(String nome, Genero sexo) {
		super();
		this.nome = nome;
		this.sexo = sexo;
	}

	public String getNome() {
		return nome;
	}

	public Genero getSexo() {
		return sexo;
	}

}
