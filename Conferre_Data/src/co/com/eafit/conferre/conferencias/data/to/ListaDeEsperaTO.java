package co.com.eafit.conferre.conferencias.data.to;

import java.awt.List;
import java.util.ArrayList;

import co.com.eafit.conferre.conferencias.data.base.ObjetoTO;

public class ListaDeEsperaTO implements ObjetoTO {
	private String id;
	private ArrayList<CLientesTO> asistentes = new ArrayList<CLientesTO>();
	private String id_conferencia;
	private String id_evento;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public ArrayList<CLientesTO> getAsistentes() {
		return asistentes;
	}
	public void setAsistentes(ArrayList<CLientesTO> asistentes) {
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

}
