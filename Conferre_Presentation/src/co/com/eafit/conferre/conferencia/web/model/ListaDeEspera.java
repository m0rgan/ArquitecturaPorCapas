package co.com.eafit.conferre.conferencia.web.model;

import java.util.ArrayList;

import co.com.eafit.conferre.conferencias.data.to.ClienteTO;
import co.com.eafit.conferre.conferencias.data.to.ListaDeEsperaTO;

public class ListaDeEspera {
	private String id;
	private ArrayList<ClienteTO> asistentes = new ArrayList<ClienteTO>();
	private String id_conferencia;
	private String id_evento;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public ArrayList<ClienteTO> getAsistentes() {
		return asistentes;
	}
	public void setAsistentes(ArrayList<ClienteTO> asistentes) {
		this.asistentes = asistentes;
	}
	public String getId_conferencia() {
		return id_conferencia;
	}
	public void setId_conferencia(String id_conferencia) {
		this.id_conferencia = id_conferencia;
	}
	public String getId_evento() {
		return id_evento;
	}
	public void setId_evento(String id_evento) {
		this.id_evento = id_evento;
	}
	
	public void actualizarListaDeEsper(ListaDeEsperaTO listaDeEspera){
		id = listaDeEspera.getId();
		asistentes = listaDeEspera.getAsistentes();
		id_conferencia = listaDeEspera.getId_conferencia();
		id_evento = listaDeEspera.getId_evento();
	}

}
