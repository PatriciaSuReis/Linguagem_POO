package Lista_1;

import java.util.Scanner;

public class Exercicio2 {

	private String nome;
	private String sexo;
	private String estadoCivil;
	int anos;
	
	public Exercicio2(String nome, String sexo, String estadoCivil) {
		this.nome = nome;
		this.sexo = sexo;
		this.estadoCivil = estadoCivil;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	
	public void casadaInfo(){
		if (sexo.equalsIgnoreCase("F") && estadoCivil.equalsIgnoreCase("Casada")) {
			
			Scanner leia = new Scanner(System.in);
			
			System.out.println("Roi, casada a quantos anos?");		
			anos = leia.nextInt();
		}
		System.out.println("Nome: " + nome);
		System.out.println("Sexo: " + sexo);
		System.out.println("Estados civil: " + estadoCivil);
		System.out.println("Anos de casada: " + anos);
	}	
}
