package sessao13;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class sessao12_3 {

	public static void main(String[] args) {
		// Exercicio 1
		
		Scanner leia = new Scanner(System.in);

		Queue<String> fila = new LinkedList<String>();
		String cliente;
		int opcao;

		System.out.println("**********************************");
		System.out.println("1: Adicionar um novo Cliente na fila\r\n" + "2: Listar todos os Clientes na fila\r\n"
				+ "3: Retirar cliente da fila \r\n" + "0: Sair");
		System.out.println("**********************************");

		do {
			System.out.println("\nEntre com a opção desejada: ");
			opcao = leia.nextInt();
			leia.nextLine();

			switch (opcao) {
			case 1:
				System.out.println("Digite o seu nome: ");
				cliente = leia.nextLine();
				fila.add(cliente);
				System.out.println("\nCliente adicionado\n\nFila:");
				for (String clt : fila) {
					System.out.println(clt);
				}
				break;
			case 2:
				if (fila.isEmpty()) {
					System.out.println("\nFila vazia!");
				} else {
					System.out.println("Lista de Clientes na Fila: \n");
					for (String clt : fila) {
						System.out.println(clt);
					}
				}
				break;
			case 3:
				if (!fila.isEmpty()) {
					fila.remove();
					System.out.println("\nO cliente foi chamado!\n\nFila:");
					for (String clt : fila) {
						System.out.println(clt);
					}
				} else {
					System.out.println("Fila vazia!");
				}
				break;
			case 0:
				System.out.println("Programa finalizado!");
				break;
			default:
				System.out.println("Insira um valor válido!");
			}
		} while (opcao != 0);

	}

}
