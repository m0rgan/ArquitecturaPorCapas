package co.com.eafit.conferre.conferencias.web.controlador;

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
		    ObjetoTO conferencia1TO;
		    try {
		      conferencia1TO = restConferenciaFacade.crearConferencia(conferencia1TO);
		      conferenciaTO = (ConferenciaTO)conferencia1TO;
		      conferencia.actualizarConferencia(conferenciaTO);
		    }
		    catch (ExcepcionUnitOfWork ex) {
		      System.err.println("Error: " + ex.getMessage());
		      
		    }
		    
	  }

}
