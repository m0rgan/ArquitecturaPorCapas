package co.com.eafit.conferre.conferencias.web.controlador;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

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
	  
	public void crearNuevaListaDeEspera() {
		ListaDeEsperaTO ListaTO = null;
		ListaDeEsperaTO ListaResult;
		try {
			ListaResult = restListaFacade.crearListaDeEspera(ListaTO);
			lista.actualizarListaDeEsper(ListaResult);
		} catch (ExcepcionUnitOfWork ex) {
			System.err.println("Error: " + ex.getMessage());  
		}    
	}
	
	public ListaDeEspera getListaDeEspera(){
		return lista;
	}
	
	public void setListaDeEsper(ListaDeEspera lista){
		this.lista = lista;
	}
}