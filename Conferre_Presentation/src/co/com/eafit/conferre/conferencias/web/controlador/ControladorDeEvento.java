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
		ObjetoTO Evento1TO;
		try {
			Evento1TO = restEventoFacade.crearEvento(Evento1TO);
			EventoTO = (EventoTO)Evento1TO;
			evento.actualizarEvento(EventoTO);
		} catch (ExcepcionUnitOfWork ex) {
			System.err.println("Error: " + ex.getMessage());  
		}    
	}
}