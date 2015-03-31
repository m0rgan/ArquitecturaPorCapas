package co.com.eafit.conferre.conferencias.web.model;

import co.com.eafit.conferre.conferencias.data.to.SillasTO;

public class Sillas {
	
	private String numero;
	private String tipo;
	private String id;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public void actualizarSillas(SillasTO sillas){
		numero = sillas.getNumero();
		tipo = sillas.getTipo();
		id = sillas.getId();
	}

}
