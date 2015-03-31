package co.com.eafit.conferre.conferencia.web.model;
import co.com.eafit.conferre.conferencias.data.to.EspacioTO;

public class Espacio {
	private String id;
	private String nombre;
	private Boolean disponible;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Boolean getDisponible() {
		return disponible;
	}
	public void setDisponible(Boolean disponible) {
		this.disponible = disponible;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public void actualizarEvento(EspacioTO espacio) {
	    id = espacio.getId();
	    nombre = espacio.getNombre();
	    disponible = espacio.getDisponible()();
	   
	  }
}
