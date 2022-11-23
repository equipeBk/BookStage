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
		
		return "Obra [nome=" + this.getNome() + ", editora=" + this.getEditora() + ", ISBM=" + this.getISBM()
		+ ", idioma=" + this.getIdioma() + ", Autor=" + this.getAutor() + ", AnoPublicacao="
		+ this.getAnoPublicacao() + ", valor=" + this.getValor() + ", qtdCorrenteEstoque="
		+ this.getQtdCorrenteEstoque() + ", qtdEstoque=" + this.getQtdEstoque() + "Ilustrador: "
		+ this.ilustrador;
	}


	boolean ValidarISBM(String isbm) {

		if (isbm.length() == 10) {

			return true;

		} else {

			return false;

		}
	}

}
