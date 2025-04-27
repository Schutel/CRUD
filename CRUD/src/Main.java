import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int cont = 0;
		int rp = 0;
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
			System.out.println("[6] opões de preço");
			System.out.println("[7] Sair");
			System.out.println("=+=+=+=+=+=+=+=+=+=+=+");
			int resp = sc.nextInt();

			switch (resp) {

			case 1:
				int re = 1;
				if (re == 1) {
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
						System.out.println("você quer editar [1]nome [2] quantidade [3] validade [4] preco");
						int rep = sc.nextInt();

						switch (rep) {
						case 1:
							System.out.print("Qual o novo nome: ");
							String nome = sc.next();
							p.setNome(nome);
							System.out.println("Mudança feita com sucesso");
							break;

						case 2:
							System.out.print("Qual a nova Quantidade: ");
							nome = sc.next();
							p.setQuantidade(nome);
							System.out.println("Mudança feita com sucesso");

							break;

						case 3:
							System.out.print("Qual a Data certa: ");
							nome = sc.next();
							p.setDescricção(nome);
							System.out.println("Mudança feita com sucesso");

							break;

						case 4:
							System.out.print("Qual o novo preço: ");
							double valor = sc.nextInt();
							p.setPreco(valor);
							System.out.println("Mudança feita com sucesso");

							break;

						default:
							System.out.println("opção invalida.");
							break;
						}

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
						System.out.println("Produto Removido.");
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
				System.out.println();
				System.out.println("=+=+=+=+ Opções =+=+=+=+");
				System.out.println("[1] Criar desconto %");
				System.out.println("[2] Criar aumento %");
				System.out.println("[3] Diminuir preço");
				System.out.println("[4] Aumentar preço");
				System.out.println("=+=+=+=+=+=+=+=+=+=+=+=+=+=+");
				int pr = sc.nextInt();

				switch (pr) {
				case 1:
					while (rp == 0) {
						System.out.println("Selecione o Id do produto que deseja editar");
						ides = sc.nextInt();
						System.out.println("Qual a porcentagem do Desconto");
						double des = sc.nextDouble();
						for (Produto produto : produtos) {
							if (ides == produto.getId()) {
								produto.getPreco();
								produto.setPreco(produto.getPreco() - (produto.getPreco() * des / 100));
								if (produto.getPreco() < 0) {
									System.out.println("O valor do produto não pode ser menor que 0, Tente Novamente");
									rp = 0;
									System.out.println();
								} else {
									System.out.println("O novo valor foi atribuido basta visualizar");
									rp += 1;
								}
							}
						}
					}

					break;

				case 2:
					System.out.println("Selecione o Id do produto que deseja editar");
					ides = sc.nextInt();
					System.out.println("Qual a porcentagem do Aumento");
					double des = sc.nextDouble();
					for (Produto produto : produtos) {
						if (ides == produto.getId()) {
							produto.getPreco();
							produto.setPreco(produto.getPreco() + (produto.getPreco() * des / 100));
							System.out.println("O novo valor foi atribuido basta visualizar");
						}
						cont = 0;
					}
					break;

				case 3:
					while (rp == 0) {
						System.out.println("Qual o Id do produto que deseja editar");
						ides = sc.nextInt();
						for (Produto produto : produtos) {
							if (ides == produto.getId()) {
								System.out.println("Quanto você deseja Diminuir ");
								des = sc.nextDouble();
								produto.setPreco(produto.getPreco() - des);
								if (produto.getPreco() < 0) {
									System.out.println("O valor do produto não pode ser menor que 0, Tente Novamente");
									rp = 0;
									System.out.println();
								} else {
									System.out.println("O novo valor foi atribuido basta visualizar");
									rp += 1;
								}
							}
						}
					}
					break;

				case 4:
					System.out.println("Qual o Id do produto que deseja editar");
					ides = sc.nextInt();
					for (Produto produto : produtos) {
						if (ides == produto.getId()) {
							System.out.println("Quanto você deseja Diminuir ");
							des = sc.nextDouble();
							produto.setPreco(des + produto.getPreco());
							System.out.println("O novo valor foi atribuido basta visualizar");

						}
					}

				}

				break;
			case 7:
				cont += 1;
				break;

			default:
				System.out.println("numero Invalido");
				cont = 0;
				break;
			}

		}

		System.out.println("obrigado por usar o nosso sistema.");
		sc.close();
	}

}
