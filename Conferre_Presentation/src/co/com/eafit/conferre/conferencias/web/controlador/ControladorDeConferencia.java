package co.com.eafit.conferre.conferencias.web.controlador;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

import co.com.eafit.conferre.conferencias.business.conferencias.RestConferenciaFacade;
import co.com.eafit.conferre.conferencias.data.base.ObjetoTO;
import co.com.eafit.conferre.conferencias.data.to.ConferenciaTO;
import co.com.eafit.conferre.conferencias.web.model.Conferencia;
import co.com.eafit.conferre.soporte.ExcepcionUnitOfWork;

@ManagedBean
public class ControladorDeConferencia {
	
	private Conferencia conferencia;
	private RestConferenciaFacade restConferenciaFacade;
	
	@PostConstruct
	public void init() {
		conferencia = new Conferencia();
	    restConferenciaFacade = new RestConferenciaFacade();
	  }
	  
	public void crearNuevaConferencia() {	
		ConferenciaTO conferenciaTO = null;
	   	ConferenciaTO conferenciaResult;
	    try {
	    	conferenciaResult	 = restConferenciaFacade.crearConferencia(conferenciaTO);
	    	conferencia.actualizarConferencia(conferenciaResult);
	    } catch (ExcepcionUnitOfWork ex) {
	    	System.err.println("Error: " + ex.getMessage());
	    }    
	}
	
	
}