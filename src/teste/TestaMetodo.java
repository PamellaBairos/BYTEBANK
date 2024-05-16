package teste;

public class TestaMetodo {
	public static void main(String args[]) {
		conta ContaDoPaulo = new conta();
		ContaDoPaulo.saldo = 100;
		ContaDoPaulo.deposita(50);
		System.out.println(ContaDoPaulo.saldo);
		
		boolean ConseguiuRetirar = ContaDoPaulo.saca(20);
		System.out.println(ContaDoPaulo.saldo);
		System.out.println(ConseguiuRetirar);
		
		/* é normal que variaveis sejam declaradas com o mesmo nome de suas
		classes, porem as classes devem ser iniciadas com letra maiusculas, e as variaveis com minusculas. 
		( no codigo está ao contrario por uma falta de atenção na hora da criação da classe */
		
		conta ContaDaMarcela = new conta();
		ContaDaMarcela.deposita(1000);
		/* abri uma nova conta para a usuaria marcela, onde depositei 1000 reais */
		
		/*tranferi da conta da marcela 300 reais para aconta do paulo
		 * ( primeiro colocamos o valor e depois referenciamos para qual conta o dinheiro vai */
		if(ContaDaMarcela.transfere(300,ContaDoPaulo)) {
			System.out.println("Transferencia executada com sucesso");
		}else {
			System.out.println("faltou dinheiro");
		}
		// como o metodo é boleano, ele retorna um true ou um false, por isso ele pode ser colocado dentro de um if.
		
		
		System.out.println(ContaDoPaulo.saldo);
		System.out.println(ContaDaMarcela. saldo);
	}

}
