package conta;

import java.util.Calendar;
import java.util.Date;

public class ContaCorrente extends Conta {

	private double taxaManutencao;
	private double limite;
	private String dataContaCorrente; // xx/xx/xxxx
	
	public ContaCorrente(double taxaManutencao, double limite, String dataContaCorrente, String agencia, String numeroConta, 
			double saldo, String nomeTitular, String cpf, String nomeMae, String dataNasc) {
		
		super(agencia, numeroConta, saldo, nomeTitular, cpf, nomeMae, dataNasc);
		
		this.taxaManutencao = taxaManutencao;
		this.dataContaCorrente = dataContaCorrente;
		this.setLimite(limite);	
		
	}
	
	public void setDataContaCorrente(String data) {
		this.dataContaCorrente = data;
	}
	
	public String getDataContaCorrente() {
		return this.dataContaCorrente;
	}
	
	public void setTaxaManutencao(double taxa) {
		this.taxaManutencao = (taxa > super.getSaldo() || taxa < 0) ? 10 : taxa;
	}
	
	public double getTaxaManutencao() {
		return this.taxaManutencao;
	}
	
	public void setLimite(double limite) {
		String array[] = this.quebraData();
		
		int anoConta = Integer.parseInt(array[2]);
		
		if (limite < 0 || limite > super.getSaldo()) {
			this.limite = 100;
		} // fim if
		else {
			int resultado = (this.getAno() - anoConta == 0)? 1 : (this.getAno() - anoConta);
			this.limite = resultado * limite;
		}//fim else
	}// fim setLimite
	
	public double getLimite() {
		return this.limite;
	}
	
	public String [] quebraData() {
		/* [0] = dia
		 * [1] = mes
		 * [2] = ano
		 */
		String vet[] = 	this.getDataContaCorrente().split("/");
		return vet;
	}
	
	public int getAno() {
		Date date = new Date();
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		return calendar.get(Calendar.YEAR);
	}
	
}
