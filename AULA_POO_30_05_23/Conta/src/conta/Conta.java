package conta;

import java.util.ArrayList;
import java.util.List;

public class Conta {

	protected String agencia;
	protected String numeroConta;
	protected double saldo;
	protected String nomeTitular;
	protected String cpf;
	protected String nomeMae;
	protected String dataNasc;
	protected List<String> extrato;
	
	public Conta(String agencia, String numeroConta, double saldo, String nomeTitular,
			String cpf, String nomeMae, String dataNasc) {
		this.agencia = agencia;
		this.numeroConta = numeroConta;
		this.saldo = saldo;
		this.nomeTitular = nomeTitular;
		this.cpf = cpf;
		this.nomeMae = nomeMae;
		this.dataNasc = dataNasc;
		extrato = new ArrayList<String>();
	}
	
	//get / set AGENCIA
	public String getAgencia() {
		return agencia;
	}
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	//get / set NumeroConta
	public String getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}
	//get / set SALDO
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = this.getSaldo() + saldo;
	}
	//get / set NumeroTitular
	public String getNomeTitular() {
		return nomeTitular;
	}
	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}
	//get / set CPF
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	//get / set NumeroMae
	public String getNomeMae() {
		return nomeMae;
	}
	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}
	//get / set DATA NASCIMENTO
	public String getDataNasc() {
		return dataNasc;
	}
	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}
	
	// DEPOSITAR
	public void depositar(double valor) {
		String retorno = "";
		
		if(valor > 0) {
			this.setSaldo(valor);
			retorno = "Depósito no valor de " + valor + " feito com sucesso!";
			this.extrato.add(retorno);
		} else {
			retorno = "Não é possível depositar valores menor ou igual a 0!";
		}
		
		System.out.println(retorno);
	}// fim
	
	// SAQUE
	public String sacar(double valor) {
		//double valorRetirado = 0;
		
		if(valor <= this.getSaldo()) {
			this.saldo = this.getSaldo() - valor;
			this.extrato.add("Saque no valor de " + valor + " realizado com sucesso!");
			return "Saque no valor de " + valor + " realizado com sucesso!";
		} else {    
			return "Saque insuficiente, não foi possível realizar o saque!";
		}
	}// fim SAQUE
	
	public void mostraExtrato() {
		System.out.println("******************* EXTRATO *******************");
		
		for (String elemento : extrato) {
			System.out.println(elemento);
		}
		
		System.out.println("****************************************");
	}// fim mostraExtrato
	
}





















