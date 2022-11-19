package Classes;


public class ColecaoObras implements Colecao {
	
	int n = 100;
	
	private Obra dados[] = new Obra[n];
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
		System.out.printf("------Buscar por faixa de preço = 6---------------------------\n");
		System.out.printf("------Imprimir dados principais = 7---------------------------\n");
		System.out.printf("--------imprimir todos os dados = 8---------------------------\n");
		System.out.printf("--imprimir o livro mais vendido = 9---------------------------\n");
		System.out.printf("--------------------------Sair = 10---------------------------\n");
	}


	@Override
	public void PesquisarPorDados(String pesq) {
			if(this.dados[this.posicaoCorrente].getNome().equals(pesq)) {
			System.out.println(dados[this.posicaoCorrente]);
		}else{
			System.out.println("Não há obras com esse nome em nosso estoque.");
		}
		//PODEMOS CRIAR UM METODO PRA CADA PESQUISA OU INSERIR TODOS AQUI

	}

	@Override
	public void PesquisarPreco(double precoInicial, double precoFinal) {
		if(this.dados[this.posicaoCorrente].getValor() <= precoFinal && this.dados[this.posicaoCorrente].getValor() >= precoInicial) {
			System.out.println(dados[this.posicaoCorrente]);
		}

	}

	@Override
	public void ImprimeEstoque() {
		// TODO Auto-generated method stub

	}

	@Override
	public Boolean inserirObra(Obra o) {
		
		this.dados[posicaoCorrente] = o;
		
		return true;

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
