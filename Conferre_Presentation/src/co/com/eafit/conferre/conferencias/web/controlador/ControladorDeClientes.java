package co.com.eafit.conferre.conferencias.web.controlador;

import co.com.eafit.conferre.conferencias.business.cliente.RestClienteFacade;
import co.com.eafit.conferre.conferencias.data.base.ObjetoTO;
import co.com.eafit.conferre.conferencias.data.to.ClienteTO;
import co.com.eafit.conferre.conferencias.web.model.Cliente;
import co.com.eafit.conferre.soporte.ExcepcionUnitOfWork;

@ManagedBean

public class ControladorDeClientes {
	
		
		private Cliente cliente;
		private RestClienteFacade restClienteFacade;
		
		  @PostConstruct
		  public void init() {
		    cliente = new Cliente();
		    restClienteFacade = new RestClienteFacade();
		  }
		  
		  public void crearUnNuevoCliente() {
			    ClienteTO clienteTO = null;
			    ObjetoTO cliente1TO;
			    try {
			      cliente1TO= restClienteFacade.crearCliente(cliente1TO);
			      clienteTO = (ClienteTO)cliente1TO;
			      cliente.actualizarCliente(clienteTO);
			    }
			    catch (ExcepcionUnitOfWork ex) {
			      System.err.println("Error: " + ex.getMessage());
			      
			    }
			    
		  }

	}

