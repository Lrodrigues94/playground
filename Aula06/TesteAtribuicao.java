package Aula06;

public class TesteAtribuicao {
	public static void main(String []args) {
		Disciplina disc = new Disciplina("Orientação a objeto" , true);
		Professor prof = new Professor ("Rafael Pazini", 26);
		
		Atribuicao at = new Atribuicao(disc, prof);
		
		System.out.println(at.getDados());
		
		prof.setIdade(35);
		
		System.out.println(prof.getIdade());
	}
}
