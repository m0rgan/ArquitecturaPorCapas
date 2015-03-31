package co.com.eafit.conferre.conferencias.web.controlador;
import co.com.eafit.conferre.conferencias.business.asistentes.RestAsistentesFacade;
import co.com.eafit.conferre.conferencias.data.to.AsistentesTO;
import co.com.eafit.conferre.conferencias.data.base.ObjetoTO;

import co.com.eafit.conferre.conferencias.web.model.Asistentes;
import co.com.eafit.conferre.conferencias.business.base.UnitOfWork;
import co.com.eafit.conferre.soporte.ExcepcionUnitOfWork;
import co.com.eafit.conferre.soporte.ExcepcionValidacion;

@ManagedBean
public class ControladorDeAsistentes {
	
	private Asistentes asistentes;
	private RestAsistentesFacade restAsistentesFacade;
	
	  @PostConstruct
	  public void init() {
	    asistentes = new Asistentes();
	    restAsistentesFacade = new RestAsistentesFacade();
	  }
	  
	  public void crearUnNuevoAsistente() {
		    AsistentesTO asistentesTO = null;
		    ObjetoTO asistentes1TO;
		    try {
		      asistentes1TO = restAsistentesFacade.crearAsistentes(asistentes1TO);
		      asistentesTO = (AsistentesTO)asistentes1TO;
		      asistentes.actualizarAistentes(asistentesTO);
		    }
		    catch (ExcepcionUnitOfWork ex) {
		      System.err.println("Error: " + ex.getMessage());
		      
		    }
		    
	  }

}
