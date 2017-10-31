package br;

import java.util.ArrayList;
import java.util.List;

public class Banco {

	private List<Conta> contas = new ArrayList<>();
	private double saldo = 0;
	
	public void adicionatConta(Conta conta) {
		this.saldo += conta.getSaldo();
		contas.add(conta);
	}
	
	public double mostraSaldo() {
		return this.saldo;
	}
	
	public List<Conta> listaContas(){
		return contas;
	}

}
