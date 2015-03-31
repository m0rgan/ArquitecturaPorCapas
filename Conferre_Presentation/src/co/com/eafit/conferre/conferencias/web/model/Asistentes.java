package co.com.eafit.conferre.conferencias.web.model;
import co.com.eafit.conferre.conferencias.data.to.AsistentesTO;


public class Asistentes {

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
	
	public void actualizarAistentes(AsistentesTO asistentes){
		id = asistentes.getId();
		nombre = asistentes.getNombre();
		telefono = asistentes.getTelefono();
		correo = asistentes.getCorreo();
	}
	
}
