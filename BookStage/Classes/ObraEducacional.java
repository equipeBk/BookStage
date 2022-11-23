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
		
		return "Obra [nome=" + this.getNome() + ", editora=" + this.getEditora() + ", ISBM=" + this.getISBM()
		+ ", idioma=" + this.getIdioma() + ", Autor=" + this.getAutor() + ", AnoPublicacao="
		+ this.getAnoPublicacao() + ", valor=" + this.getValor() + ", qtdCorrenteEstoque="
		+ this.getQtdCorrenteEstoque() + ", qtdEstoque=" + this.getQtdEstoque() + "Referencia: "
		+ this.referencias;
	}
	
	boolean ValidarISBM(String isbm) {
		
		if(isbm.length() == 10) {

		return true;
		
		}else {
			
		return false;
			
		}
		

	}
	

}
