package application;
import entities.Produto;
import java.util.Scanner;

public class mainClass {

	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		System.out.print("Insira o nome do produto: ");
		String nome = leitura.nextLine();
		System.out.println(" ");
		System.out.print("Insira o preço do produto: ");
		Double preco = leitura.nextDouble();
		System.out.println(" ");
		System.out.print("Insira a quantidade de unidades do produto: ");
		Integer quantidade = leitura.nextInt();
		System.out.println(" ");
		
		Produto produto1 = new Produto(nome,preco,quantidade);
		
		System.out.println(" ");
		System.out.println(produto1);
		System.out.println(" ");
		
		System.out.print("Você deseja adicionar ou remover quantidade ou sair do sistema?(a/r/s): ");
		char escolha = leitura.next().charAt(0);
		
		if(escolha == 'a') {
			System.out.println(" ");
			System.out.print("Escolha a quantidade de unidades que deseja adicionar: ");
			Integer numero = leitura.nextInt();
			produto1.adicionarQuantidade(numero);
			System.out.println(" ");
			System.out.println(produto1);
		}
		if (escolha == 'r') {
			
			System.out.println(" ");
			System.out.print("Escolha a quantidade de unidades que deseja remover: ");
			Integer numero = leitura.nextInt();
			produto1.removerQuantidade(numero);
			System.out.println(" ");
			System.out.println(produto1);
			System.out.println(" ");
		}
		
		while(escolha != 's') {
			
			System.out.print("Você deseja adicionar ou remover quantidade ou sair do sistema?(a/r/s): ");
			escolha = leitura.next().charAt(0);
			
			
			
			
			if(escolha == 'a') {
				System.out.println(" ");
				System.out.print("Escolha a quantidade de unidades que deseja adicionar: ");
				Integer numero = leitura.nextInt();
				produto1.adicionarQuantidade(numero);
				System.out.println(" ");
				System.out.println(produto1);
			}
			if (escolha == 'r') {
				
				System.out.println(" ");
				System.out.print("Escolha a quantidade de unidades que deseja remover: ");
				Integer numero = leitura.nextInt();
				produto1.removerQuantidade(numero);
				System.out.println(" ");
				System.out.println(produto1);
				System.out.println(" ");
			}
			
		}
		
		
			System.out.println(produto1);
			System.out.println(" ");
			System.out.println("SESSÃO DE SISTEMA FINALIZADA.");
			System.out.println(" ");
		

	}

}
