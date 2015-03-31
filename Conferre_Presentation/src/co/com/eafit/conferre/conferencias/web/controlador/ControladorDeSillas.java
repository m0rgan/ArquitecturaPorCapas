package co.com.eafit.conferre.conferencias.web.controlador;

import co.com.eafit.conferre.conferencias.business.sillas.RestSillasFacade;
import co.com.eafit.conferre.conferencias.data.base.ObjetoTO;
import co.com.eafit.conferre.conferencias.data.to.SillasTO;
import co.com.eafit.conferre.conferencias.web.model.Sillas;
import co.com.eafit.conferre.soporte.ExcepcionUnitOfWork;

@ManagedBean
public class ControladorDeSillas {
	private Sillas sillas;
	private RestSillasFacade restSillasFacade;
	
	  @PostConstruct
	  public void init() {
	    sillas = new Sillas();
	    restSillasFacade = new RestSillasFacade();
	  }
	  
	  public void crearNuevasSillas() {
		    SillasTO sillasTO = null;
		    ObjetoTO sillas1TO;
		    try {
		      sillas1TO = restSillasFacade.crearSillas(sillas1TO);
		      sillasTO = (SillasTO)sillas1TO;
		      sillas.actualizarSillas(sillasTO);
		    }
		    catch (ExcepcionUnitOfWork ex) {
		      System.err.println("Error: " + ex.getMessage());
		      
		    }
		    
	  }

}
