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

		return "Nome: " + this.getNome() + "\nEditora: " + this.getEditora() + "\nISBM:" + this.getISBM() + "\nIdioma:"
				+ this.getIdioma() + "\nAutor:" + this.getAutor() + "\nAno de publicacao: "
				+ this.getAnoPublicacao().get(Calendar.YEAR) + "\nValor: " + this.getValor()
				+ "\nQuantidade Corrente de Estoque: " + this.getQtdCorrenteEstoque() + "\nQuantidade Estoque: "
				+ this.getQtdEstoque() + "\nIlustrador: " + this.ilustrador;
	}

	boolean ValidarISBM(String isbm) {

		if (isbm.length() == 10) {

			return true;

		} else {

			return false;

		}
	}

}