package Classes;

import java.util.Calendar;

public class ObraEducacional extends Obra {

	private String referencias;

	public String getReferencias() {
		return referencias;
	}

	public void setReferencias(String referencias) {
		this.referencias = referencias;
	}

	public String toString() {

		return "Nome: " + this.getNome() + "\nEditora: " + this.getEditora() + "\nISBM:" + this.getISBM() + "\nIdioma:"
				+ this.getIdioma() + "\nAutor:" + this.getAutor() + "\nAnoPublicacao: "
				+ this.getAnoPublicacao().get(Calendar.YEAR) + "\nValor: " + this.getValor()
				+ "\nQuantidade Corrente de Estoque: " + this.getQtdCorrenteEstoque() + "\nQuantidade Estoque: "
				+ this.getQtdEstoque() + "\nReferencia: " + this.referencias;
	}

	boolean ValidarISBM(String isbm) {

		if (isbm.length() == 10) {

			return true;

		} else {

			return false;

		}

	}

}