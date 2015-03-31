package co.com.eafit.conferre.conferencias.web.controlador;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

import co.com.eafit.conferre.conferencias.business.espacio.RestEspacioFacade;
import co.com.eafit.conferre.conferencias.data.base.ObjetoTO;
import co.com.eafit.conferre.conferencias.data.to.EspacioTO;
import co.com.eafit.conferre.conferencias.web.model.Espacio;
import co.com.eafit.conferre.soporte.ExcepcionUnitOfWork;

@ManagedBean
public class ControladorDeEspacio {
	
	private Espacio espacio;
	private RestEspacioFacade restEspacioFacade;
	
	@PostConstruct
	public void init() {
		espacio = new Espacio();
	    restEspacioFacade = new RestEspacioFacade();
	}
	
	public void crearNuevoEspacio() {
		EspacioTO EspacioTO = null;
		ObjetoTO Espacio1TO;
		try {
			Espacio1TO = restEspacioFacade.crearEspacio(Espacio1TO);
			EspacioTO = (EspacioTO)Espacio1TO;
			espacio.actualizarEspacio(EspacioTO);
		} catch (ExcepcionUnitOfWork ex) {
			System.err.println("Error: " + ex.getMessage());
		}    
	}
}