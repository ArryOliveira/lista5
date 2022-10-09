package q4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner ler=new Scanner(System.in);
		Produto p=new Produto();
		System.out.println("digite o nome do produto ");
		String nome=ler.next();
		p.nome=nome;
		System.out.println("digite o preço de custo");
		int c=ler.nextInt();
		p.PC=c;
		System.out.println("digite o preço de venda");
		int v=ler.nextInt();
		p.PV=v;
		System.out.println("digite as despesas");
		int d=ler.nextInt();
		p.D=d;
		System.out.println("margem de lucro:"+p.CalculaMargemLucro());

	}

}
