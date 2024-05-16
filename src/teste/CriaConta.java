package teste;

public class CriaConta {
	public static void main(String[] args) {
		conta primeiraConta = new conta();
		primeiraConta.saldo = 200;
		System.out.println(primeiraConta.saldo);
		
		primeiraConta.saldo+=100;
		System.out.println("primeira conta tem: " + primeiraConta.saldo);
		
		conta segundaConta = new conta();
		
		segundaConta.saldo=50;
		System.out.println("segundaConta tem:" + segundaConta.saldo);
		/*quando criamos uma variavel, precisamos identificar de onde ela vem. 
		 * Neste escopo as variais não são comuns pq elas são orientadas aos objetos (heranças)
		 * então ao criar a variavel identificamos ela como conta pq falamos que ela pode ser um saldo,
		 *  um numero ou um titular, que estão respectivamente 
		 * declarados em outra pasta. 
		 * Para fazer a ligação da variavel e colocar um valor nela, fazemos a ligação utilizando um ponto.
		 * EX: na agencia existem inumeras contas, porem todas com o mesmo escopo, saldo, numero da conta
		 *  e titular. Na conta 1, eu quero declarar que no saldo tem R$500,00, para isso eu utlizo Conta1.saldo=500;
		 *  e isso ficaria somente na conta 1, se eu tivesse outras contas, faria a
		 *   mesma coisa declarando variaveis diferentes do tipo conta.
		 *   */
	}
}
