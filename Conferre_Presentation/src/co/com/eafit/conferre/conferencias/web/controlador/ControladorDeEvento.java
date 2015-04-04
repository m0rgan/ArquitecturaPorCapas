package co.com.eafit.conferre.conferencias.web.controlador;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

import co.com.eafit.conferre.conferencias.business.evento.RestEventoFacade;
import co.com.eafit.conferre.conferencias.data.base.ObjetoTO;
import co.com.eafit.conferre.conferencias.data.to.EventoTO;
import co.com.eafit.conferre.conferencias.web.model.Evento;
import co.com.eafit.conferre.soporte.ExcepcionUnitOfWork;

@ManagedBean
public class ControladorDeEvento {
	
	private Evento evento;
	private RestEventoFacade restEventoFacade;
	
	@PostConstruct
	public void init() {
		evento = new Evento();
	    restEventoFacade = new RestEventoFacade();
	}
  
	public void crearNuevoEvento() {
		EventoTO EventoTO = null;
		EventoTO EventoResult;
		try {
			EventoResult = restEventoFacade.crearEvento(EventoTO);
			evento.actualizarEvento(EventoResult);
		} catch (ExcepcionUnitOfWork ex) {
			System.err.println("Error: " + ex.getMessage());  
		}    
	}
	
	public Evento getEvento(){
		return evento;
	}
	
	public void setEvento(Evento evento){
		tihs.evento = evento;
	}
}