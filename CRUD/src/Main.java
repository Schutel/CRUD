import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import org.w3c.dom.ls.LSOutput;

public class Main {

	public static void main(String[] args) {
		int cont = 0;
		Produto p = new Produto();

		int id = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("    Seja Bem vindo a nosso Sistema");
		System.out.println("Insira quantos produtos você quer adicionar");
		Integer tamanho = sc.nextInt();
		ArrayList<Produto> produtos = new ArrayList<Produto>();

		for (int i = 0; i < tamanho; i++) {
			p = new Produto();
			p.Info();
			p.setId(id++);
			produtos.add(p);
			System.out.println("-----------------------");
		}

		for (Produto produto : produtos) {
			System.out.println(produto.toString());
		}

		while (cont == 0) {
			System.out.println();
			System.out.println("=+=+=+=+ Opções =+=+=+=+");
			System.out.println("[1] Adicionar");
			System.out.println("[2] visualizar");
			System.out.println("[3] Editar");
			System.out.println("[4] Remover um produto");
			System.out.println("[5] limpar todos os Produtos");
			System.out.println("[6] Sair");
			System.out.println("=+=+=+=+=+=+=+=+=+=+=+");
			int resp = sc.nextInt();

			switch (resp) {

			case 1:
				System.out.println("quer adicionar um ou mais de um produto");
				System.out.println("[1] Um");
				System.out.println("[2] Mais de um");
				int re = sc.nextInt();
				if (re == 1) {
					p = new Produto();
					p.setId(id++);
					p.Info();
					produtos.add(p);

				} else {
					System.out.println("quantos quer adicionar");
					int add = sc.nextInt();
					for (int i = 0; i < add; i++) {
						p = new Produto();
						p.setId(id++);
						p.Info();
						produtos.add(p);
						System.out.println("-----------------------");
					}
				}
				break;

			case 2:

				for (Produto produto : produtos) {
					System.out.println(produto.toString());

				}
				break;

			case 3:
				System.out.println("Selecione o Id do produto que deseja editar");
				int ides = sc.nextInt();
				System.out.println();

				for (Produto produto : produtos) {
					if (ides == produto.getId()) {
						produto.Info();
					}

				}

				break;

			case 4:
				System.out.println("Tem certeza (sim/não)");
				String rep = sc.next().toLowerCase();
				if (rep.equals("sim")) {
					System.out.println("Selecione o Id do produto que deseja remover");
					int ide = sc.nextInt();
					if (ide == p.getId()) {
						produtos.remove(p.getId());
					}
				}

				break;

			case 5:
				System.out.println("Tem certeza que deseja excluir (sim/não)");
				String r = sc.next().toLowerCase();
				if (r.equals("sim")) {
					produtos.clear();
					System.out.println("-----------------------");
					for (Produto produto : produtos) {
						System.out.println(produto);
						System.out.println("todos os produtos foram Excluidos");
					}
				} else {
					System.out.println("-----------------------");
				}
				break;

			case 6:
				cont += 1;
				break;

			default:
				System.out.println("numero Invalido");
				cont = 0;
				break;
			}

		}

		System.out.println("obrigado por usar o nosso sistema.");
	}

}
