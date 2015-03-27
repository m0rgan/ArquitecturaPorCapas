package co.com.eafit.conferre.conferencias.data.to;

import java.sql.Date;

import co.com.eafit.conferre.conferencias.data.base.ObjetoTO;

public class EventoTO implements ObjetoTO {
	private String id;
<<<<<<< HEAD
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
=======
>>>>>>> origin/master
	private String ubicacion;
	private String tipo_evento;
	private String id_conferencia;
	private Date fecha;
	private int hora;
	private String numero_de_personas;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	public String getTipo_evento() {
		return tipo_evento;
	}
	public void setTipo_evento(String tipo_evento) {
		this.tipo_evento = tipo_evento;
	}
	public String getId_conferencia() {
		return id_conferencia;
	}
	public void setId_conferencia(String id_conferencia) {
		this.id_conferencia = id_conferencia;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public int getHora() {
		return hora;
	}
	public void setHora(int hora) {
		this.hora = hora;
	}
	public String getNumero_de_personas() {
		return numero_de_personas;
	}
	public void setNumero_de_personas(String numero_de_personas) {
		this.numero_de_personas = numero_de_personas;
	}

}
