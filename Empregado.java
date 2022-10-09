package q5;

import java.util.Scanner;

public class Empregado {
	public int id;
	public String nome;
	public String sobrenome;
	public double salario;
	public boolean[] dia;
	public Empregado(String nome, String sobrenome) {
		this.nome = nome;
		this.sobrenome = sobrenome;
	}
	public Empregado(int id, String nome, String sobrenome) {
		super();
		this.id = id;
		this.nome = nome;
		this.sobrenome = sobrenome;
	}
	public double verificaTrabalho(Scanner ler) {
		boolean dia[]=new boolean[30];
		double salario=0;
		String resposta;
		this.dia=dia;
		int trabalhado=0;
		int naotrabalhado=0;
		int i=0;
		System.out.println("digite sim ou nao para se o empregado trabalhou nos dias abaixo:");
		for( i=0;i<30;i++) {
			System.out.println(i+1);
			resposta=ler.next();
			if(resposta=="sim") {
				dia[i]=true;
				trabalhado++;
			}
			else {
				dia[i]=false;
				naotrabalhado++;
			}
		}
		if(trabalhado==30) {
			this.salario=(float)(1.01)*this.salario;
		}
		if(trabalhado>=25 && trabalhado<=27) {
			for(i=0;i<naotrabalhado;i++) {
				this.salario=(float)(99.8)*this.salario;
			}
			
		}
		if(trabalhado>=20 && trabalhado<=24) {
			for(i=0;i<naotrabalhado;i++) {
				this.salario=(float)(99.7)*this.salario;
			}
			
		}
		if(trabalhado<20) {
			this.salario=(float)(0.2)*this.salario;
		}
	}
	return this.salario;
	
}
