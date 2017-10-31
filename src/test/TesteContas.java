package test;

import br.Cliente;
import br.ContaCorrente;
import br.ContaPoupanca;
import br.Genero;

public class TesteContas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cliente cliente1 = new Cliente("Joao", Genero.MASCULINO, "10101010","20202020");
		Cliente cliente2 = new Cliente("Bruno", Genero.MASCULINO, "10103340","20202343");
		
		ContaCorrente contaCorrente = new ContaCorrente(cliente1);
		contaCorrente.deposito(1000.0);
		
		ContaPoupanca contaPoupanca = new ContaPoupanca(cliente2);
		contaCorrente.tranferePara(contaPoupanca, 700.0);
		
		System.out.println(contaCorrente.getSaldo() + " ; " + contaPoupanca.getSaldo());
		
	}

}
