package br;

public enum Genero {

	MASCULINO("M"), FEMININO("F"), FLEX("0");

	private String genero;

	private Genero(String genero) {
		this.genero = genero;
	}

	public String getGenero() {
		return genero;
	}

}
