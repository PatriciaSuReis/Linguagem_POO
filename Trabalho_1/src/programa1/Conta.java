package programa1;

public class Conta {

	//variavel
	private Double saldo;

	//construtor
	public Conta(double saldoIncial) {
		if (saldoIncial > 0.0) {
			saldo = saldoIncial;
		}
	}

	//metodos GET e SET
	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	
	//metodo de deposito
	public void deposito (Double acrescimo) {
		saldo = saldo + acrescimo;
	}
	
	//metodo de saque
	public void saque (double decrescimo) {
		saldo = saldo - decrescimo;
	}
	
	
}
