package co.com.eafit.conferre.conferencias.web.model;

import co.com.eafit.conferre.conferencias.data.to.ClienteTO;

public class Cliente {
	private String id;
	private String nombre;
	private String telefono;
	private String correo;
	private String usuario;
	private String contrase�a;
	
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
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getContrase�a() {
		return contrase�a;
	}
	public void setContrase�a(String contrase�a) {
		this.contrase�a = contrase�a;
	}
	
	public void actualizarCliente(ClienteTO cliente){
		id = cliente.getId();
		nombre = cliente.getNombre();
		telefono = cliente.getTelefono();
		correo = cliente.getCorreo();
		usuario = cliente.getContrase�a();
		contrase�a = cliente.getContrase�a();
	}

}

