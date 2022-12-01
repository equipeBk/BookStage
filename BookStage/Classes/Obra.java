package Classes;

import java.util.Calendar;

public abstract class Obra {

	private String nome;
	private String editora;
	private String ISBN;
	private String idioma;
	private String categoria;
	private String Autor;
	private String edicao;
	private Calendar AnoPublicacao;
	private Double valor;
	private int qtdEstoque;

	// GETS E SETS

	public String toString() {

		return "Obra \nNome: " + nome + "\nEditora: " + editora + "\nISBN: " + ISBN + "\nIdioma: " + idioma
				+ "\nAutor: " + Autor + "\nAno de publicacao: " + AnoPublicacao.get(Calendar.YEAR) + "\nValor: " + valor
				+ "\nEdicao: " + edicao + "\nQuantidade em estoque: " + qtdEstoque;

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

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String ISBN) {
		this.ISBN = ISBN;
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

	public int getQtdEstoque() {
		return qtdEstoque;
	}

	public void setQtdEstoque(int qtdEstoque) {
		this.qtdEstoque = qtdEstoque;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getEdicao() {
		return edicao;
	}

	public void setEdicao(String edicao) {
		this.edicao = edicao;
	}
}