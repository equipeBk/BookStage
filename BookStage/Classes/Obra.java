package Classes;

import java.util.Calendar;

public abstract class Obra {

	private String nome;
	private String editora;
	private String ISBM;
	private String idioma;
	private String Autor;
	private Calendar AnoPublicacao;
	private Double valor;
	private int qtdCorrenteEstoque;
	private int qtdEstoque;

	// GETS E SETS

	
	public String toString() {
		return "Obra [nome=" + nome + ", editora=" + editora + ", ISBM=" + ISBM + ", idioma=" + idioma + ", Autor="
				+ Autor + ", AnoPublicacao=" + AnoPublicacao + ", valor=" + valor + ", qtdCorrenteEstoque="
				+ qtdCorrenteEstoque + ", qtdEstoque=" + qtdEstoque + "]";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public String getISBM() {
		return ISBM;
	}

	public void setISBM(String iSBM) {
		ISBM = iSBM;
	}

	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

	public String getAutor() {
		return Autor;
	}

	public void setAutor(String autor) {
		Autor = autor;
	}

	public Calendar getAnoPublicacao() {
		return AnoPublicacao;
	}

	public void setAnoPublicacao(Calendar anoPublicacao) {
		AnoPublicacao = anoPublicacao;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public int getQtdCorrenteEstoque() {
		return qtdCorrenteEstoque;
	}

	public void setQtdCorrenteEstoque(int qtdCorrenteEstoque) {
		this.qtdCorrenteEstoque = qtdCorrenteEstoque;
	}

	public int getQtdEstoque() {
		return qtdEstoque;
	}

	public void setQtdEstoque(int qtdEstoque) {
		this.qtdEstoque = qtdEstoque;
	}

	boolean ValidarISBM() {

		return true;

	}

}
