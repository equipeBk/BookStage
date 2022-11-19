package Classes;


public interface Colecao {

	void PesquisarPorDados(String pesq);

	void PesquisarPreco(int precoInicial, int precoFinal);

	void ImprimeEstoque();

	Boolean inserirObra(Obra o);

	void imprimeDadosPrincipais();

	void imprimeTodosDados();

	void imprimeLivroMaisVendido();

}
