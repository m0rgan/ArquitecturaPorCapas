package co.com.eafit.conferre.conferencias.web.controlador;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

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
		SillasTO sillasResult;
		try {
			sillasResult = restSillasFacade.crearSillas(sillasTO);
			sillas.actualizarSillas(sillasResult);
		} catch (ExcepcionUnitOfWork ex) {
			System.err.println("Error: " + ex.getMessage());  
		}    
	}
	
	public Sillas getSillas(){
		return sillas;
	}
	
	public void setSillas(Sillas sillas){
		this.sillas = sillas;
	}
}