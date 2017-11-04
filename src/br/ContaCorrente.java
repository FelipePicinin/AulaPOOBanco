package br;

public class ContaCorrente extends Conta implements TaxaBancaria{

	public ContaCorrente(Cliente cliente) {
		super(cliente);
	}

	@Override
	public double tarifa() {
		double valor = super.getSaldo() * 0.1;
		return valor;
	}
	
}
