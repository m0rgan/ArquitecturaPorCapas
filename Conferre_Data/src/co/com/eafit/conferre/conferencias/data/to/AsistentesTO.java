package co.com.eafit.conferre.conferencias.data.to;

import co.com.eafit.conferre.conferencias.data.base.ObjetoTO;

public class AsistentesTO implements ObjetoTO {
	private String id;
	private String nombre;
	private String telefono;
	private String correo;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
}
