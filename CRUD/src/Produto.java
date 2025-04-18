import java.util.Scanner;

public class Produto {
	Scanner sc = new Scanner(System.in);

	public int id;
	public String nome;
	public String quantidade;
	public String validade;
	public Double preco;

	public Produto() {
		
		this.id = id;
		this.nome = nome;
		this.quantidade = quantidade;
		this.validade = validade;
		this.preco = preco;
	}

	public void Info() {
		System.out.println("qual o nome do seu porduto");
		this.nome = sc.next();
		System.out.println("qual a quantidade do seu estoque");
		this.quantidade = sc.next();
		System.out.println("Validade desse produto");
		this.validade = sc.next();
		System.out.println("Valor desse produto");
		this.preco = sc.nextDouble();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(String quantidade) {
		this.quantidade = quantidade;
	}

	public String getDescricção() {
		return validade;
	}

	public void setDescricção(String descricção) {
		this.validade = descricção;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Id : " + id + ", " + nome + ", Quantidade:" + quantidade + ", " + validade + ", R$" + preco;
	}

}
