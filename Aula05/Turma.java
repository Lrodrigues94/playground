package Aula05;

public class Turma {
	/*Crie a classe Turma com seu construtor, 
	métodos de acesso e modificadores e os atributos 
	privados nome, do tipo String, curso, do tipo String, quantidadeDeAlunos,
	do tipo int, serie, do tipo int.*/
	
	private String nome;
	private String curso;
	private  int quantidadeDeAlunos;
	private int serie;
	
	
	public  Turma(String nome, String curso, int quantidadeDeAlunos, int serie) {
		this.nome = nome;
		this.curso = curso;
		this.quantidadeDeAlunos = quantidadeDeAlunos;
		this.serie = serie;
	}
	
	public String getNome() {
		return nome;
	}
	public String getCurso() {
		return curso;
	}
	
	public int getQuantidadeDeAlunos() {
		return quantidadeDeAlunos;
	}
	
	public int getSerie() {
		return serie;
	}
	
	public void setString(String nome) {
		this.nome = nome;
	}
	
	public void setQuantidadeDeAlunos(int quantidadeDeAlunos) {
		this.quantidadeDeAlunos = quantidadeDeAlunos;
	}
	
	public void setSerie(int serie) {
		this.serie = serie;
	}
}
