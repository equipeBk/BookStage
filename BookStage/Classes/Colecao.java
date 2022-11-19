package Classes;


public interface Colecao {
	void PesquisarPorDados(String pesq);

	void PesquisarPreco(double precoInicial, double precoFinal);

	void ImprimeEstoque();

	Boolean inserirObra(Obra o);

	void imprimeDadosPrincipais();

	void imprimeTodosDados();

	void imprimeLivroMaisVendido();

}
