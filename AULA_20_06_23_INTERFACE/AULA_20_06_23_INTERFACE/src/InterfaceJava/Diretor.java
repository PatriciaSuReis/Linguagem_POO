package InterfaceJava;

public class Diretor extends Funcionario implements Autenticavel {

	private String SenhaDiretor;

	public Diretor(String senhaDiretor, String PrimeiroNome, String UltimoNome, String cpf) {
		super(PrimeiroNome, UltimoNome, cpf);
		this.SenhaDiretor = senhaDiretor;
	}

	public String getSenhaDiretor() {
		return SenhaDiretor;
	}

	public void setSenhaDiretor(String senhaDiretor) {
		SenhaDiretor = senhaDiretor;
	}

	@Override
	public boolean autentica(String senha) {
		if(senha.length() > 6 && senha.charAt(2) == super.getPrimeiroNome().charAt(0)
			&& senha == this.SenhaDiretor) {
			return true;
		}
		else return false;
	}
	
	@Override
	public String toString() {
		return String.format(super.toString() + " Autenticou?%b\n", this.autentica(this.getSenhaDiretor()));
	}
	
}
