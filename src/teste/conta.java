package teste;

public class conta {
	double saldo;
	 int agencia ;
	 int numero;
	 double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	private String titular;
	
	public void deposita(double valor) {
		this.saldo = this.saldo + valor;
	}
	public boolean saca(double valor)
	{
		if(this.saldo>=valor) 
		{
			this.saldo = this.saldo - valor;
			return true;
		}else 
		{
			return false;
		}
	}
	public boolean transfere(double valor, conta destino)
	{/* se o saldo da conta for maior que o valor a tranferir, pode ocorrer a transferencia*/
		if(this.saldo>=valor) 
		{
		//  agora o valor da conta é igual ao antigo valor menos o valor da tranferencia
			this.saldo-=valor;
			// na conta destino vai ser depositado o valor;
			destino.deposita(valor);
			return true;
		}else
		{
			return false;
		}
	}
}
