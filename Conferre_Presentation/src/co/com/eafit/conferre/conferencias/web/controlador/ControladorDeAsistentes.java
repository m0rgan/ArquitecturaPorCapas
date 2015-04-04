package co.com.eafit.conferre.conferencias.web.controlador;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

import co.com.eafit.conferre.conferencias.business.asistentes.RestAsistentesFacade;
import co.com.eafit.conferre.conferencias.data.base.ObjetoTO;
import co.com.eafit.conferre.conferencias.data.to.AsistentesTO;
import co.com.eafit.conferre.conferencias.web.model.Asistentes;
import co.com.eafit.conferre.soporte.ExcepcionUnitOfWork;

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
		  AsistentesTO asistentesResult;
		
		  try {
			  asistentesResult = restAsistentesFacade.crearAsistentes(asistentesTO);
			  asistentes.actualizarAistentes(asistentesResult);
		  } catch (ExcepcionUnitOfWork ex) {
			  System.err.println("Error: " + ex.getMessage());
		  }
	  }
	  
	  public void setAsistente(Asistentes asistentes) {
		    this.asistentes = asistentes;
	  }
	  
	  public Asistentes getAsistente() {
		    return asistentes;
	  }
}