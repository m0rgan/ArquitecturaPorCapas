package co.com.eafit.conferre.conferencia.web.model;

import co.com.eafit.conferre.conferencias.data.to.EventoTO;


import java.sql.Date;

public class Evento {
	private String id;
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
	public void setHora(int i) {
		this.hora = i;
	}
	public String getNumero_de_personas() {
		return numero_de_personas;
	}
	public void setNumero_de_personas(String numero_de_personas) {
		this.numero_de_personas = numero_de_personas;
	}
	
	public void actualizarEvento(EventoTO evento){
		id = evento.getId();
		ubicacion = evento.getUbicacion();
		tipo_evento = evento.getTipo_evento();
		id_conferencia = evento.getId_conferencia();
		fecha = evento.getFecha();
		hora = evento.getHora();
		numero_de_personas = evento.getNumero_de_personas();
	}


}
