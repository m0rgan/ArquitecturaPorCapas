package co.com.eafit.conferre.conferencias.business.cliente;

import co.com.eafit.conferre.conferencias.data.to.ClienteTO;

@Path("/cliente")
public class RestClienteFacade implements ClienteFacade {
	
	@Override
	@Path("/")
	@POST
	@Consumes("application/json")
	@Produces("application/json")
	public ClienteTO crearCliente(ClienteTO cliente) {
	    CrearClienteUseCase useCase = new CrearClienteUseCase();
	    ClienteTO clienteResult = null;
	    try {
	      clienteResult = (ClienteTO) useCase.ejecutar(cliente); 
	    } catch (Exception e) {
	      throw e;
	    }
	    return clienteResult;
	}
	
	 public ClienteTO ingresarAlSistema(ClienteTO cliente) {
		    CrearClienteUseCase useCase = new CrearClienteUseCase();
		    ClienteTO clienteResult;
		    try {
		      clienteResult = (ClienteTO) useCase.ejecutar(cliente);
		    }
		    catch (Exception e) {
		      throw e;
		    }
		    return clienteResult;
		  }
}