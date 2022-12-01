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

		return "Nome: " + this.getNome() + "\nEditora: " + this.getEditora() + "\nISBN:" + this.getISBN() + "\nIdioma:"
				+ this.getIdioma() + "\nAutor:" + this.getAutor() + "\nAno de publicacao: "
				+ this.getAnoPublicacao().get(Calendar.YEAR) + "\nValor: " + this.getValor() + "\nEdicao: "
				+ this.getEdicao() + "\nQuantidade Estoque: " + this.getQtdEstoque() + "\nReferencia bibliográfica: "
				+ this.referencias;
	}

}