package Heranca;

public class EmpregadoComissionadoPlus extends EmpregadoComissionado{
	
	private double salarioBase;
	
	public EmpregadoComissionadoPlus(double salario, String primeiroNome, String ultimoNome,
									 String CPF, double vendasBruta, double taxa) {
		
		super (primeiroNome, ultimoNome, CPF, vendasBruta, taxa);
		setSalarioBase(salario);
	}
	
	public void setSalarioBase(double salario) {
		salarioBase = (salario < 0.0) ? 0.0 : salario;
	}
	
	public double getSalarioBase() {
		return salarioBase;
	}
	
	@Override
	//sobrescrevendo o metodo da superclass
	public double Salario() {
		return salarioBase + (super.getTaxaComissao() * super.getVendasBruta());
	}

}
