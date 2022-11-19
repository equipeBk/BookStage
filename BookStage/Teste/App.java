package Teste;

import Classes.*;
import java.util.*;

public class App {

	public static void main(String[] args) {

		String nome, editora, isbm, idioma, autor, referencia, ilustrador;
		Double valor;
		int qtdE, qtdCorE, opMenu = 0, dd, mm, yyyy, i = 0;

		// INSTANCIANDO CLASSES

		Scanner scan = new Scanner(System.in);
		GregorianCalendar anoPublic = new GregorianCalendar();
		ColecaoObras CO = new ColecaoObras();
		ObraEducacional OEd = new ObraEducacional();
		ObraHq OHq = new ObraHq();

		do {

			CO.menu();
			opMenu = scan.nextInt();

			switch (opMenu) {

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

					System.out.println("Agora a data de nascimento separada por espacos (ex: dd mm yyyy): ");
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

					System.out.println("Digite a referencia: ");
					referencia = scan.nextLine();

					CO.inserirObra(OEd);
					
					i++;

				}

				else if (opMenu == 2) {
					
					scan.nextLine();
					
					System.out.printf("Digite o nome da obra educacional[%d]: ", i);
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

					System.out.println("Agora a data de nascimento separada por espacos (ex: dd mm yyyy): ");
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

					CO.inserirObra(OHq);
					i++;

				}

			}

		} while (opMenu != 9);

	}
}
