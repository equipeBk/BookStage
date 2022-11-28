package Teste;

import Classes.*;
import java.util.*;

public class App {

	public static void main(String[] args) {

		String nome, editora, isbm, autor, referencia, ilustrador, pesq, categoria;
		Double valor;
		int qtdE, opMenu = 0, dd, mm, yyyy, i = 0;

		// INSTANCIANDO CLASSES

		Scanner scan = new Scanner(System.in);
		GregorianCalendar anoPublic = new GregorianCalendar();
		ColecaoObras CO = new ColecaoObras();
		ObraEducacional OEd = new ObraEducacional();
		ObraHq OHq = new ObraHq();

		do {

			CO.menu();
			int opMen = scan.nextInt();

			switch (opMen) {

			// METODO INSERIR

			case 1:

				System.out.println("Digite 1 para adicionar uma obra educacional ou 2 para adicionar uma obra HQ");
				opMenu = scan.nextInt();

				if (opMenu == 1) {

					scan.nextLine();

					System.out.printf("Digite o nome da obra educacional[%d]: ", i);
					nome = scan.nextLine();
					OEd.setNome(nome);

					System.out.println("Digite a editora: ");
					editora = scan.nextLine();
					OEd.setEditora(editora);

					System.out.println("Digite a ISBM: ");
					isbm = scan.nextLine();
					OEd.setISBM(isbm);

					System.out.println("Digite a autor: ");
					autor = scan.nextLine();
					OEd.setAutor(autor);

					System.out.println("Digite o idioma: ");
					String idioma = scan.nextLine();
					OEd.setIdioma(idioma);
					
					System.out.println("Digite a categoria do livro: ");
					categoria = scan.nextLine();
					OEd.setCategoria(categoria);

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

					System.out.println("Digite a referencia bibliográfica: ");
					referencia = scan.nextLine();
					OEd.setReferencias(referencia);
					
					CO.inserirObra(OEd);

					i++;

				}

				else if (opMenu == 2) {

					scan.nextLine();

					System.out.printf("Digite o nome da Historia em quadrinho[%d]: ", i);
					nome = scan.nextLine();
					OHq.setNome(nome);

					System.out.println("Digite a editora: ");
					editora = scan.nextLine();
					OHq.setEditora(editora);

					System.out.println("Digite a ISBM: ");
					isbm = scan.nextLine();
					OHq.setISBM(isbm);

					System.out.println("Digite a autor: ");
					autor = scan.nextLine();
					OHq.setAutor(autor);
					
					System.out.println("Digite o idioma: ");
					String idioma = scan.nextLine();
					OHq.setIdioma(idioma);

					System.out.println("Digite a categoria do livro: ");
					categoria = scan.nextLine();
					OHq.setCategoria(categoria);

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
				CO.PesquisarPorDados(pesq);
				break;

			// BUSCAR POR EDITORA
			case 3:

				scan.nextLine();
				System.out.print("digite o nome da editora que deseja pesquisar:");
				pesq = scan.nextLine();
				CO.PesquisarPorDados(pesq);

				break;

			// BUSCAR POR AUTOR
			case 4:

				scan.nextLine();
				System.out.print("digite o nome do autor que deseja pesquisar:");
				pesq = scan.nextLine();
				CO.PesquisarPorDados(pesq);

				break;

			// BUSCAR POR ISBNs
			case 5:

				scan.nextLine();
				System.out.print("digite a isbn que deseja pesquisar:");
				pesq = scan.nextLine();
				CO.PesquisarPorDados(pesq);

				break;

			// BUSCAR POR FAIXA DE PREÇO
			case 6:

				System.out.print("Digite o valor incial do exemplar:");
				double precoInicial = scan.nextDouble();
				System.out.print("Digite o valor final do exemplar:");
				double precoFinal = scan.nextDouble();
				CO.PesquisarPreco(precoInicial, precoFinal);
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

				CO.imprimeLivroMaisVendido();

				break;
			}
		} while (opMenu != 10);

	}
}
