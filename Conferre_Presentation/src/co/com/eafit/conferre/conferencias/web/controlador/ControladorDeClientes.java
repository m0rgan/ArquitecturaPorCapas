package co.com.eafit.conferre.conferencias.web.controlador;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

import co.com.eafit.conferre.conferencias.business.cliente.RestClienteFacade;
import co.com.eafit.conferre.conferencias.data.base.ObjetoTO;
import co.com.eafit.conferre.conferencias.data.to.ClienteTO;
import co.com.eafit.conferre.conferencias.web.model.Asistentes;
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
		ClienteTO clienteResult;
	    try {
	    	clienteResult= restClienteFacade.crearCliente(clienteTO);
	    	cliente.actualizarCliente(clienteResult);
	    } catch (ExcepcionUnitOfWork ex) {
	    	System.err.println("Error: " + ex.getMessage());      
	    }	    
	}
	
	 public void ingresarAlSistema() {
		    ClienteTO clienteTO = new ClienteTO();
		    try {
		      System.out.println("Usuario: " + clienteTO.getUsuario());
		      System.out.println("Contraseña: " + clienteTO.getContraseña());
		      ClienteTO resultado = restClienteFacade.ingresarAlSistema(clienteTO);
		      if (resultado == null) {
		        System.out.println("El usuario o contraseña no son válidos");
		        return;
		      }
		      cliente.actualizarCliente(resultado);
		    }
		    catch (ExcepcionUnitOfWork ex) {
		      System.err.println("Error: " + ex.getMessage());
		      
		    }
		    
	}
	 
	public void setCliente(Cliente cliente) {
		    this.cliente = cliente;
	}
	  
	public Cliente getCliente() {
		    return cliente;
	}
}