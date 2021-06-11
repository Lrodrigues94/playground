package Aula05;

import javax.swing.JOptionPane;

public class TesteTurma {
	/*2) Crie a classe TesteTurma com o 
	m�todo main. De modo an�logo ao exemplo, 
	pe�a para o usu�rio entrar com os valores 
	necess�rios para criar uma turma, instancie um 
	objeto Turma e depois exiba os dados da turma criada. 
	Depois, pe�a para o usu�rio uma nova quantidade de alunos,
	altere o valor do atributo e exiba os dados novamente.*/
		
	public static void main(String[] args) {

		String nome = JOptionPane.showInputDialog("Nome");
		String curso = JOptionPane.showInputDialog("Digite o curso");
		int quantidadeDeAlunos = Integer.parseInt(JOptionPane.showInputDialog("Digite quantidade de Alunos"));
		int serie = Integer.parseInt(JOptionPane.showInputDialog("Digite a s�rie"));

		Turma tr = new Turma(nome, curso, quantidadeDeAlunos, serie);

		String msg = "Nome: " + tr.getNome() + "\nCurso: " + tr.getCurso() + "\nQuantidade de Alunos : "
				+ tr.getQuantidadeDeAlunos();
		if (tr.getSerie() <= 9) {
			msg += "\nSerie: " + tr.getSerie() + " ano";
		} else {
			msg += "\nSerie: " + tr.getSerie() + "serie";
		}

		System.out.println(msg);

		quantidadeDeAlunos = Integer.parseInt(JOptionPane.showInputDialog("Digite quantidade de Alunos"));
		tr.setQuantidadeDeAlunos(quantidadeDeAlunos);
		System.out.println(tr.getQuantidadeDeAlunos());
	}

}
