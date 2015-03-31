package co.com.eafit.conferre.conferencia.web.model;

import java.util.Date;

import co.com.eafit.conferre.conferencias.data.to.ConferenciaTO;
import co.com.eafit.conferre.conferencias.data.to.EspacioTO;

public class Conferencia {
	private String nombre;
	private String nombreConferencista;
	private String tipo;
	private Date fecha;
	private int sillasDisponibles;
	private String id;
	private EspacioTO espacio;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNombreConferencista() {
		return nombreConferencista;
	}
	public void setNombreConferencista(String nombreConferencista) {
		this.nombreConferencista = nombreConferencista;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public int getSillasDisponibles() {
		return sillasDisponibles;
	}
	public void setSillasDisponibles(int sillasDisponibles) {
		this.sillasDisponibles = sillasDisponibles;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public EspacioTO getEspacio() {
		return espacio;
	}
	public void setEspacio(EspacioTO espacio) {
		this.espacio = espacio;
	}
	
	public void actualizarConferencia(ConferenciaTO conferencia){
		nombre = conferencia.getNombre();
		nombreConferencista = conferencia.getNombreConferencista();
		tipo = conferencia.getTipo();
		fecha = conferencia.getFecha();
		sillasDisponibles = conferencia.getSillasDisponibles();
		id = conferencia.getId();
		espacio = conferencia.getEspacio();
	}

}
