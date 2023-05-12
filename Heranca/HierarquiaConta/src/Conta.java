/*
 * SI - POO - Fausto Ayres
 */
public class Conta {
	protected int numero;
	protected String cpf;
	protected double saldo=0;
	
	public Conta(int numero, String cpf) {
		this.numero = numero;
		this.cpf = cpf;
	}
	public void creditar(double valor) {
		saldo = saldo + valor;
	}
	public void debitar(double valor) throws Exception {
		if(valor > saldo)
			throw new Exception("debito incorreto de "+ valor);	//lan�amento de alerta
		
		saldo = saldo - valor;
	}
	public void transferir(double valor, Conta destino) throws Exception  {
		this.debitar(valor);
		destino.creditar(valor);
	}

	@Override
	public String toString() {
		return "numero=" + numero + ", cpf=" + cpf + ", saldo=" + saldo;
	}

	
	public int getNumero() {
		return numero;
	}
	public String getCpf() {
		return cpf;
	}
	public double getSaldo() {
		return saldo;
	}
	
	
	
}
