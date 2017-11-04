package br;

import javax.xml.bind.annotation.XmlEnumValue;

public class ContaPoupanca extends Conta implements TaxaBancaria{

	public ContaPoupanca(Cliente cliente) {
		super(cliente);
	}
	
	@Override
	public double tarifa() {
		double valor = super.getSaldo() * 0.5;
		return valor;
	}

}
