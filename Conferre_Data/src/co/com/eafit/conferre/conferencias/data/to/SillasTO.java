package co.com.eafit.conferre.conferencias.data.to;

import co.com.eafit.conferre.conferencias.data.base.ObjetoTO;

public class SillasTO implements ObjetoTO {
	
	private String numero;
	private String tipo;
	
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

}
