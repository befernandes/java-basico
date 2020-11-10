package Principal;

import java.util.Scanner;

import Model.Cliente;
import Model.Gerente;
import Model.Robo;

public class Principal {

	private Cliente cliente;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		Cliente cliente = new Cliente("Benildo Fernandes Domingos");
		Gerente gerente = new Gerente(" Confidence Cambio ");
		Robo robo = new Robo(null);

		// Verifica se o nome é vazio ou null
		if (cliente.getNome() == null || cliente.getNome().isEmpty()) {
			System.out.println("O nome não pode ser vazio/Nullo!");
		} else {

			cliente.apresentacao();
			System.out.println("Cliente");
			System.out.println("Nome: " + cliente.getNome());

			String[] abre = cliente.getNome().split(" ");

			// Imprimindo em letra Maiuscula
			System.out.println("Nome: " + cliente.getNome().toUpperCase());

			// Primeiro nome
			System.out.println("Primeiro nome: " + abre[0]);
			// Ultimo nome
			System.out.println("Ultimo nome: " + abre[1] + " " + abre[2]);
			// Nome Abreviado
			System.out.println("Nome Abreviado: " + abre[0] + " " + abre[1].charAt(0) + ". " + abre[2]);

			System.out.println("\n");

		}

		if (gerente.getNome() == null || gerente.getNome().isEmpty()) {
			System.out.println("O nome não pode ser vazio/Nullo!");
		} else {

			gerente.apresentacao();
			System.out.println("Gerente");

			// Removendo Espaço do inicio e do Fim
			System.out.println("Nome: " + gerente.getNome().trim());

			// Abreviação do nome
			System.out.println();
			System.out.println("\n");
		}

		if (robo.getNome() == null || robo.getNome().isEmpty()) {
			System.out.println("O nome não pode ser vazio/Nullo!");
		} else {
			robo.apresentacao();
			System.out.println("Robo");
			System.out.println("Nome: " + robo.getNome());
			System.out.println("\n");
		}

	}

}
