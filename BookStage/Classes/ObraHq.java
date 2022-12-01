package Classes;

import java.util.Calendar;

public class ObraHq extends Obra {

	private String ilustrador;

	public String getIlustrador() {
		return ilustrador;
	}

	public void setIlustrador(String ilustrador) {
		this.ilustrador = ilustrador;
	}

	public String toString() {

		return "Nome: " + this.getNome() + "\nEditora: " + this.getEditora() + "\nISBN:" + this.getISBN() + "\nIdioma:"
				+ this.getIdioma() + "\nAutor:" + this.getAutor() + "\nAno de publicacao: "
				+ this.getAnoPublicacao().get(Calendar.YEAR) + "\nValor: " + this.getValor() + "\nEdicao: "
				+ this.getEdicao() + "\nQuantidade Estoque: " + this.getQtdEstoque() + "\nIlustrador: "
				+ this.ilustrador;
	}
}