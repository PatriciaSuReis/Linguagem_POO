package Heranca;

public class EmpregadoComissionado {

	private String primeiroNome;
	private String ultimoNome;
	private String CPF;
	private double vendasBruta;
	private double porcentagemComissao;
	
	// nos parametos pode colocar qualquer nome, mas o mesmo tipo tem que ser iguais as atributos da classe
	public EmpregadoComissionado(String primeiroNome, String ultimoNome, String CPF, double vendasBruta,
			double taxa) {

		this.primeiroNome = primeiroNome;
		this.ultimoNome = ultimoNome;
		this.CPF = CPF;
		setVendasBruta(vendasBruta);
		setTaxaComissao(taxa);
	}// fim construtor
	
	//primeiro nome
	public void setPrimeiroNome(String first) {
		this.primeiroNome = first;
	}
	
	public String getPrimeiroNome() {
		return primeiroNome;
	}
	//Ultimo Nome
	public void setUltimoNome(String last) {
		this.ultimoNome = last;
	}
	
	public String getUltimoNome() {
		return ultimoNome;
	}
	//CPF
	public void setCPF(String cpf) {
		CPF = cpf;
	}
	
	public String getCPF() {
		return CPF;
	}
	//Vendas Bruta
	public void setVendasBruta(double vendas) {
		vendasBruta = (vendas < 0.0) ? 0.0 : vendas;
	}
	
	public double getVendasBruta() {
		return vendasBruta;
	}
	//Taxa Comissao
	public void setTaxaComissao(double taxa) {
		porcentagemComissao = (taxa > 0.01 && taxa < 1.0) ? taxa : 0.0; 
		// a taxa varia de 1% ate 100%
	}
	
	public double getTaxaComissao() {
		return porcentagemComissao;
	}

	public double Salario() {
		return vendasBruta * porcentagemComissao;
	}
	
	
	
	
	
}
