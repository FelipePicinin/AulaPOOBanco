package test;

import br.Cliente;
import br.ContaCorrente;
import br.Genero;

public class TesteContaCorrente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Cliente cliente1 = new Cliente("Felipe", Genero.MASCULINO, "101010", "101010");
		Cliente cliente2 = new Cliente("Bruno", Genero.MASCULINO, "101011", "101020");
		
		ContaCorrente c1 = new ContaCorrente(cliente1);
		c1.deposito(100.0);
		
		ContaCorrente c2 = new ContaCorrente(cliente2);
	
		System.out.println(c1.getSaldo() + " ; " + c2.getSaldo());
		
		if(c1.tranferePara(c2, 150.0)) {
			System.out.println("Transferencia realizada com sucesso");
		}else {
			System.out.println("Insucesso");
		}
		System.out.println(c1.getSaldo() + " ; " + c2.getSaldo());
	}

}
