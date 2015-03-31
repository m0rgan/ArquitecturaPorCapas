package co.com.eafit.conferre.conferencias.web.controlador;

import co.com.eafit.conferre.conferencias.business.listaDeEspera.RestListaDeEsperaFacade;
import co.com.eafit.conferre.conferencias.data.base.ObjetoTO;
import co.com.eafit.conferre.conferencias.data.to.ListaDeEsperaTO;
import co.com.eafit.conferre.conferencias.web.model.ListaDeEspera;
import co.com.eafit.conferre.soporte.ExcepcionUnitOfWork;

@ManagedBean
public class ControladorDeListaDeEspera {
	private ListaDeEspera lista;
	private RestListaDeEsperaFacade restListaFacade;
	
	  @PostConstruct
	  public void init() {
	    lista= new ListaDeEspera();
	    restListaFacade = new RestListaDeEsperaFacade();
	  }
	  
	  public void crearUnNuevoAsistente() {
		    ListaDeEsperaTO ListaTO = null;
		    ObjetoTO Lista1TO;
		    try {
		      Lista1TO = restListaFacade.crearListaDeEspera(Lista1TO);
		      ListaTO = (ListaDeEsperaTO)Lista1TO;
		      lista.actualizarListaDeEsper(ListaTO);
		    }
		    catch (ExcepcionUnitOfWork ex) {
		      System.err.println("Error: " + ex.getMessage());
		      
		    }
		    
	  }
}
