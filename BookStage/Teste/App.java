package Teste;

import Classes.*;
import java.util.*;

public class App {

	public static void main(String[] args) {

		String nome, editora, ISBN, autor, referencia, ilustrador, pesq, categoria, edicao;
		Double valor;
		int qtdE, opMenu = 0, dd, mm, yyyy, i = 0;

		// INSTANCIANDO CLASSES

		try (Scanner scan = new Scanner(System.in)) {
			GregorianCalendar anoPublic = new GregorianCalendar();
			ColecaoObras CO = new ColecaoObras();

			do {

				CO.menu();

				opMenu = scan.nextInt();

				switch (opMenu) {

				// METODO INSERIR

				case 1:

					System.out.println("Digite 1 para adicionar uma obra educacional ou 2 para adicionar uma obra HQ");
					opMenu = scan.nextInt();

					if (opMenu == 1) {
						ObraEducacional OEd = new ObraEducacional();
						scan.nextLine();

						System.out.printf("Digite o nome da obra educacional[%d]: ", i);
						nome = scan.nextLine();
						OEd.setNome(nome);

						System.out.println("Digite a editora: ");
						editora = scan.nextLine();
						OEd.setEditora(editora);

						System.out.println("Digite a ISBN: ");
						ISBN = scan.nextLine();
						OEd.setISBN(ISBN);

						System.out.println("Digite a autor: ");
						autor = scan.nextLine();
						OEd.setAutor(autor);

						System.out.println("Digite o idioma: ");
						String idioma = scan.nextLine();
						OEd.setIdioma(idioma);

						System.out.println("Digite a categoria do livro: ");
						categoria = scan.nextLine();
						OEd.setCategoria(categoria);

						System.out.println("Digite a edicao do livro: ");
						edicao = scan.nextLine();
						OEd.setEdicao(edicao);

						System.out.println("Agora a data de lançamento separada por espacos (ex: dd mm yyyy): ");
						dd = scan.nextInt();
						mm = scan.nextInt();
						mm--;
						yyyy = scan.nextInt();

						anoPublic.set(yyyy, mm, dd);
						OEd.setAnoPublicacao(anoPublic);

						System.out.println("Digite o valor do livro: ");
						valor = scan.nextDouble();
						OEd.setValor(valor);

						System.out.println("Digite a quantidade do estoque: ");
						qtdE = scan.nextInt();
						OEd.setQtdEstoque(qtdE);

						scan.nextLine();

						System.out.println("Digite palavras chaves da obra.");
						referencia = scan.nextLine();
						OEd.setReferencias(referencia);

						CO.inserirObra(OEd);

						i++;
					}

					else if (opMenu == 2) {

						scan.nextLine();
						ObraHq OHq = new ObraHq();
						System.out.printf("Digite o nome da Historia em quadrinho[%d]: ", i);
						nome = scan.nextLine();
						OHq.setNome(nome);

						System.out.println("Digite a editora: ");
						editora = scan.nextLine();
						OHq.setEditora(editora);

						System.out.println("Digite a ISBN: ");
						ISBN = scan.nextLine();
						OHq.setISBN(ISBN);

						System.out.println("Digite a autor: ");
						autor = scan.nextLine();
						OHq.setAutor(autor);

						System.out.println("Digite o idioma: ");
						String idioma = scan.nextLine();
						OHq.setIdioma(idioma);

						System.out.println("Digite a categoria do livro: ");
						categoria = scan.nextLine();
						OHq.setCategoria(categoria);

						System.out.println("Digite a edicao do livro: ");
						edicao = scan.nextLine();
						OHq.setEdicao(edicao);

						System.out.println("Agora a data de lançamento separada por espacos (ex: dd mm yyyy): ");
						dd = scan.nextInt();
						mm = scan.nextInt();
						mm--;
						yyyy = scan.nextInt();

						anoPublic.set(yyyy, mm, dd);
						OHq.setAnoPublicacao(anoPublic);

						System.out.println("Digite o valor do livro: ");
						valor = scan.nextDouble();
						OHq.setValor(valor);

						System.out.println("Digite a quantidade do estoque: ");
						qtdE = scan.nextInt();
						OHq.setQtdEstoque(qtdE);

						scan.nextLine();

						System.out.println("Digite o ilustrador: ");
						ilustrador = scan.nextLine();
						OHq.setIlustrador(ilustrador);

						CO.inserirObra(OHq);
						i++;
					}
					break;

				/// METODO PESQUISAR POR NOME
				case 2:

					scan.nextLine();
					System.out.print("digite o nome da obra que deseja pesquisar:");
					pesq = scan.nextLine();
					if (CO.PesquisarPorDados(pesq) == false) {
						System.out.println("Não há obra com esse nome");
					}
					break;

				// BUSCAR POR EDITORA
				case 3:

					scan.nextLine();
					System.out.print("digite o nome da editora que deseja pesquisar:");
					pesq = scan.nextLine();
					if (CO.PesquisarPorDados(pesq) == false) {
						System.out.println("Não há obra com esse nome de editora");
					}
					break;

				// BUSCAR POR AUTOR
				case 4:

					scan.nextLine();
					System.out.print("digite o nome do autor que deseja pesquisar:");
					pesq = scan.nextLine();
					if (CO.PesquisarPorDados(pesq) == false) {
						System.out.println("Não há obra com esse autor");
					}

					break;

				// BUSCAR POR ISBNs
				case 5:

					scan.nextLine();
					System.out.print("digite a ISBN que deseja pesquisar:");
					pesq = scan.nextLine();
					if (CO.PesquisarPorDados(pesq) == false) {
						System.out.println("Não há obra com esse ISBN");
					}

					break;

				// BUSCAR POR FAIXA DE PREÇO
				case 6:

					System.out.print("Digite o valor incial do exemplar:");
					double precoInicial = scan.nextDouble();
					System.out.print("Digite o valor final do exemplar:");
					double precoFinal = scan.nextDouble();
					if (CO.PesquisarPreco(precoInicial, precoFinal) == false) {
						System.out.println("Não há obra nesta faixa de preço.");
					}
					break;

				// IMPRIMIR DADOS PRINCIPAIS
				case 7:
					CO.imprimeDadosPrincipais();

					break;

				// IMPRIMIR TODOS OS DADOS
				case 8:

					CO.imprimeTodosDados();

					break;

				// IMPRIMIR LIVRO MAIS VENDIDO
				case 9:
					try {
						CO.imprimeLivroMaisVendido();
					} catch (java.lang.IndexOutOfBoundsException e) {
						System.out.println("Não há nada no estoque.");
						scan.nextLine();
					}

					break;
				// IMPRIMIR ESTOQUE
				case 10:

					CO.ImprimeEstoque();

					break;
				}

			} while (opMenu != 11);
		}

	}
}
