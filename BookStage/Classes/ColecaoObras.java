package Classes;

import java.util.ArrayList;

public class ColecaoObras implements Colecao {

	int n = 100, i, ind;
	private int qtdCorrenteEstoque;

	ArrayList<Obra> dados = new ArrayList<>(100);
	private int posicaoCorrente;

	// GETS E SETS

	public ArrayList<Obra> getDados() {
		return dados;
	}

	public void setDados(ArrayList<Obra> dados) {
		this.dados = dados;
	}

	public int getPosicaoCorrente() {
		return posicaoCorrente;
	}

	public void setPosicaoCorrente(int posicaoCorrente) {
		this.posicaoCorrente = posicaoCorrente;
	}

	public int getQtdCorrenteEstoque() {
		return qtdCorrenteEstoque;
	}

	public void setQtdCorrenteEstoque(int qtdCorrenteEstoque) {
		this.qtdCorrenteEstoque = qtdCorrenteEstoque;
	}

	// METODOS

	// METODO MENU TEMPORARIO, ATÉ CRIARMOS A INTERFACE

	public void menu() {

		System.out.printf("\n\n--------------------------MENU----------------------------\n");
		System.out.printf("------------------------Inserir = 1---------------------------\n");
		System.out.printf("----------------Buscar por nome = 2---------------------------\n");
		System.out.printf("-------------Buscar por editora = 3---------------------------\n");
		System.out.printf("---------------Buscar por autor = 4---------------------------\n");
		System.out.printf("----------------Buscar por ISBN = 5---------------------------\n");
		System.out.printf("------Buscar por faixa de preço = 6---------------------------\n");
		System.out.printf("------Imprimir dados principais = 7---------------------------\n");
		System.out.printf("--------imprimir todos os dados = 8---------------------------\n");
		System.out.printf("--imprimir o livro mais vendido = 9---------------------------\n");
		System.out.printf("-------imprimir estoque total: = 10---------------------------\n");
		System.out.printf("--------------------------Sair = 11---------------------------\n");
	}

	public void PesquisarPorDados(String pesq) {

		for (i = 0; i < dados.size(); i++) {

			if (pesq.equals(dados.get(i).getNome()) || pesq.equals(dados.get(i).getEditora())
					|| pesq.equals(dados.get(i).getAutor()) || pesq.equals(dados.get(i).getISBN())) {

				ind = i;
				System.out.println(dados.get(ind));

			} else {

				System.out
						.println("O que voce pesquisou não foi encontrado em nossos dados, por favor tente novamente!");
			}
		}
	}

	public void PesquisarPreco(double precoInicial, double precoFinal) {
		System.out.println();
		for (i = 0; i < dados.size(); i++) {
			if (dados.get(i).getValor() <= precoFinal && dados.get(i).getValor() >= precoInicial) {

				System.out.println(dados.get(i));
			}
		}
	}

	public void ImprimeEstoque() {

		int somaEstoques = 0;

		for (i = 0; i < dados.size(); i++) {

			somaEstoques = +dados.get(i).getQtdEstoque();
			this.qtdCorrenteEstoque = somaEstoques;
		}

		System.out.println("A quantidade total de estoques e: " + somaEstoques);
		System.out.println("A Estoque corrente: " + this.qtdCorrenteEstoque);
	}

	public Boolean inserirObra(Obra o) {

		dados.add(o);

		return true;
	}

	public void imprimeDadosPrincipais() {
		for (i = 0; i < dados.size(); i++) {
			System.out.println("Nome:" + dados.get(i).getNome());
			System.out.println("Editora:" + dados.get(i).getEditora());
			System.out.println("Preço:" + dados.get(i).getValor());

			System.out.println();
		}
	}

	public void imprimeTodosDados() {

		for (i = 0; i < dados.size(); i++) {

			System.out.println(dados.get(i));

			System.out.println();

		}
	}

	public void imprimeLivroMaisVendido() {

		int menor = 0;

		for (i = 0; i < dados.size(); i++) {

			if (dados.get(i).getQtdEstoque() > menor) {

				menor = i;

			}
		}

		System.out.println("O livro mais vendido foi: " + dados.get(menor).getNome());
	}
}