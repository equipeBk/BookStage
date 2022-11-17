package Classes;


public class ColecaoObras implements Colecao {

	private Obra dados[];
	private int posicaoCorrente;
	

	// GETS E SETS

	public Obra[] getDados() {
		return dados;
	}

	public void setDados(Obra[] dados) {
		this.dados = dados;
	}

	public int getPosicaoCorrente() {
		return posicaoCorrente;
	}

	public void setPosicaoCorrente(int posicaoCorrente) {
		this.posicaoCorrente = posicaoCorrente;
	}

	// METODOS
	
	//METODO MENU TEMPORARIO, ATÉ CRIARMOS A INTERFACE
	
	public void menu() {

		System.out.printf("\n\n--------------------------MENU----------------------------\n");
		System.out.printf("------------------------Inserir = 1---------------------------\n");
		System.out.printf("----------------Buscar por nome = 2---------------------------\n");
		System.out.printf("-------------Buscar por editora = 3---------------------------\n");
		System.out.printf("---------------Buscar por autor = 4---------------------------\n");
		System.out.printf("----------------Buscar por ISBN = 5---------------------------\n");
		System.out.printf("------Imprimir dados principais = 6---------------------------\n");
		System.out.printf("-------imprimir todods os dados = 7---------------------------\n");
		System.out.printf("--imprimir o livro mais vendido = 8---------------------------\n");
		System.out.printf("---------------------------Sair = 9---------------------------\n");
	}


	@Override
	public void PesquisarPorDados(String pesq) {
		// TODO Auto-generated method stub

	}

	@Override
	public void PesquisarPreco(int precoInicial, int precoFinal) {
		// TODO Auto-generated method stub

	}

	@Override
	public void ImprimeEstoque() {
		// TODO Auto-generated method stub

	}

	@Override
	public void inserirObra() {
		// TODO Auto-generated method stub

	}

	@Override
	public void imprimeDadosPrincipais() {
		// TODO Auto-generated method stub

	}

	@Override
	public void imprimeTodosDados() {
		// TODO Auto-generated method stub

	}

	@Override
	public void imprimeLivroMaisVendido() {
		// TODO Auto-generated method stub

	}

}
