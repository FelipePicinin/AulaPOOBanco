package test;

import br.Conta;

public class TesteConta {

	public static void main(String[] args) {
		
		
		Conta c = new Conta(null);
		c.deposito(100.0);
		
		System.out.println(c.getSaldo());
		
		if(c.saca(150)) {
			System.out.println("Sacou blz");
		}else {
			System.out.println("Não sacou blz");
		}
		
		System.out.println(c.getSaldo());
		
	}
	
}
