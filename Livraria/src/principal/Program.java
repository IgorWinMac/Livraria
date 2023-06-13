package principal;

import java.util.Scanner;

import entities.Livro;

public class Program {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o nome do livro: ");
		String nome = entrada.nextLine();
		
		System.out.println("Informe o nome do autor: ");
		String autor = entrada.nextLine();
				
		System.out.println("Informe o preco: ");
		double preco = entrada.nextDouble();
		
		Livro livro = new Livro(nome,autor,preco);
		
		livro.setPreco(preco);
		
		System.out.println(livro);

		
		entrada.close();
	}

}
