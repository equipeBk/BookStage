package Classes;


public class ObraHq extends Obra {

	private String ilustrador;

	public String getIlustrador() {
		return ilustrador;
	}

	public void setIlustrador(String ilustrador) {
		this.ilustrador = ilustrador;
	}

	public String toString() {
		return "Obra \nNome: " + this.getNome() + "\nEditora: " + this.getEditora() + "\nISBM: " + this.getISBM()
				+ "\nidioma: " + this.getIdioma() + "\nAutor: " + this.getAutor() + "\nAnoPublicacao: "
				+ this.getAnoPublicacao() + "\nvalor: " + this.getValor() + "\nQuantidade corrente em estoque: "
				+ this.getQtdCorrenteEstoque() + "\nQuantidade em Estoque: " + this.getQtdEstoque() + "\nIustrador: "
				+ this.ilustrador;

	}
}
