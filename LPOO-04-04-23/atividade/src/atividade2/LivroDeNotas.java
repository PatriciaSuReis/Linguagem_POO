package atividade2;

import java.util.Scanner;

public class LivroDeNotas {

	private String nomeCurso;

	//CONSTRUDOR DA CLASSE
	public LivroDeNotas(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}

	//GET
	public String getNomeCurso() {
		return nomeCurso;
	}
	//SET - metodo para definir o nome do curso
	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}
	
	//METODOS
	//exibir mensagem de boas vindas
	public void mostrarMensagem() {
		System.out.printf("Bem-vindo ao Livro de Notas %s.\n", getNomeCurso());
	}
	
	// determinar a media da classe com base em 10 notas
	public void determinarMediaClasse() {
		Scanner leia = new Scanner(System.in);
		
		int total = 0;			//soma notas inseridas pelo usuario
		int contadorNotas = 0;	//numero da nota a ser inserida a seguir
		int nota;				//valor da nota inserida pelo usuario
		double media;			//media da nota
		
		//solitar entrada de dados
		System.out.print("Entre com a nota: ");
		nota = leia.nextInt();
		
		while (nota != -1) {//laco de repeticao 10x
			total += nota;	//adiciona a nota ao total
			contadorNotas++;//incrementar 1 na variavel cpntadorNotas
			
			System.out.println("Entre coma nota ou -1 para sair do loop:");
			nota = leia.nextInt();

		}
		
		//teste se o usuario inseriu pelo menos uma nota
		if(contadorNotas > 0) {
			media = total /contadorNotas; // calculando a media
			System.out.println("Media da turma "+ getNomeCurso () +" e: "+ media ) ;
		}
		else {
			System.out.println("Nenhuma nota foi inserida.");
		}
		
	}

}





