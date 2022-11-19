package Classes;


public class ObraEducacional extends Obra {

	private String referencias;	
	
	
	public String getReferencias() {
		return referencias;
	}


	public void setReferencias(String referencias) {
		this.referencias = referencias;
	}


	public String toString() {
		return "Obra \nNome: " + this.getNome() + "\nEditora: " + this.getEditora() + "\nISBM: " + this.getISBM()
				+ "\nidioma: " + this.getIdioma() + "\nAutor: " + this.getAutor() + "\nAnoPublicacao: "
				+ this.getAnoPublicacao() + "\nvalor: " + this.getValor() + "\nqtdCorrenteEstoque: "
				+ this.getQtdCorrenteEstoque() + "\nqtdEstoque: " + this.getQtdEstoque() + "\nReferência: "
				+ this.referencias;

	}
	

}
