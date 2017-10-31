package br;

public class Conta {
	
	private double saldo;
	private Cliente cliente;
	
	public Conta(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	
	//deposito
	public void deposito(double valor) {
		this.saldo += valor;
	}
	
	//saque
	public boolean saca(double valor) {
		boolean sacou = false;
		if(valor <= this.saldo){
			this.saldo -= valor;
			sacou = true;
		}
		return sacou;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public boolean tranferePara(Conta destino, double valor) {
		boolean tranferiu = false;
		if(saca(valor)) {
			destino.deposito(valor);
			tranferiu = true;
		}
		return tranferiu;
	}
	

}
