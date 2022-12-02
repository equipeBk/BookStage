package Classes;

public interface Colecao {
	Boolean PesquisarPorDados(String pesq);

	Boolean PesquisarPreco(double precoInicial, double precoFinal);

	void ImprimeEstoque();

	Boolean inserirObra(Obra o);

	void imprimeDadosPrincipais();

	void imprimeTodosDados();

	void imprimeLivroMaisVendido();

}