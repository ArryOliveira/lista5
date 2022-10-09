package q2;

public class Pessoa {
	public int idade;
	public int dia;
	public int mes;
	public int ano;
	public String nome;
	
	public int informaIdade(int idade) {
		this.idade=idade;
		return idade;
	}
	public String informaNome(String nome) {
		this.nome=nome;
		return nome;
	}
	public void ajustaDataDeNascimento(int dia,int mes,int ano) {
		this.ano=ano;
		this.dia=dia;
		this.mes=mes;
	}
	public int calculaIdade(int atualdia,int atualmes,int atualano) {
		int diferença;
		int totalatual;
		int totalantigo;
		int idade;
		totalatual=atualdia+(30*atualmes)+(365*atualano);
		totalantigo=dia+(30*mes)+(365*ano);
		diferença=totalatual-totalantigo;
		idade=(int)diferença/365;
		return idade;
		
	}
}
