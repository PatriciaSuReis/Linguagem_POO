package Heranca;

public class EmpregadoComisionadoTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EmpregadoComissionado obj = new EmpregadoComissionado("Manoel", "Chaves", "030.990.091-66",
				23890.4, 0.05);
		
		System.out.printf("Empregado: %s %s\n", obj.getPrimeiroNome(), obj.getUltimoNome());
		System.out.println("CPF: " + obj.getCPF());
		System.out.println("Total de Vendas: " + obj.getVendasBruta());
		System.out.println("Taxa da comissao: " + obj.getTaxaComissao());
		System.out.printf("Salario: %.2f\n", obj.Salario());
		
	}

}
