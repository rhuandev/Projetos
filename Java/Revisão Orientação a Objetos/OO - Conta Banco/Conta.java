public class Conta {

	//atributos - inicio
	private int numero;
	private float saldo;
	//atributos - fim
	
	//construtor - inicio
	public Conta (int numeroDaConta, float saldoInicial) {
		numero = numeroDaConta;
		saldo = saldoInicial;
	}
	//construtor - fim
	
	//metodos - inicio
	public void debitar(float valor) {
		saldo = saldo - valor;
	}
	
	public void creditar(float valor) {
		saldo = saldo + valor;
	}
	//metodos - fim
	
	// getters / setters - inicio
	public float getNumero() {
		return numero;
	}
	
	public float getSaldo() {
		return saldo;
	}
	
	public void setSaldo(float novoSaldo) {
		saldo = novoSaldo;
	}
	// getters / setters - fim


//metodo main - inicio
public static void main(String args[]) {
	Conta conta1 = new Conta(123, 4000);
	System.out.println("Numero da conta: " + conta1.getNumero());
	System.out.println("Saldo atual: R$" + conta1.getSaldo());
	
	conta1.debitar(100);
	System.out.println("\nValor debitado: R$ 100.0\n");
	
	System.out.println("Numero da conta: " + conta1.getNumero());
	System.out.println("Saldo atual: R$" + conta1.getSaldo());
}
//metodo main - fim

}