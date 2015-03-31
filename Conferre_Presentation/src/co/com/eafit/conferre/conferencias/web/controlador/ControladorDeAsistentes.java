package co.com.eafit.conferre.conferencias.web.controlador;
import co.com.eafit.conferre.conferencias.business.asistentes.RestAsistentesFacade;
import co.com.eafit.conferre.conferencias.data.to.AsistentesTO;
import co.com.eafit.conferre.conferencias.web.model.Asistentes;
import co.com.eafit.conferre.conferencias.business.base.UnitOfWork;



@ManagedBean
public class ControladorDeAsistentes {
	
	private Asistentes asistentes;
	private RestAsistentesFacade restAsistentesFacade;
	
	  @PostConstruct
	  public void init() {
	    asistentes = new Asistentes();
	    restAsistentesFacade = new RestAsistentesFacade();
	  }

}
