package co.com.eafit.conferre.conferencias.business.cliente;

import co.com.eafit.conferre.conferencias.business.asistentes.CrearAsistentesUseCase;
import co.com.eafit.conferre.conferencias.data.to.AsistentesTO;
import co.com.eafit.conferre.conferencias.data.to.ClienteTO;
import co.com.eafit.conferre.soporte.ExcepcionUnitOfWork;

public class RestClienteFacade implements ClienteFacade {
	
	@Override
	   public ClienteTO crearCliente(ClienteTO cliente) throws ExcepcionUnitOfWork {
	    CrearClienteUseCase useCase = new CrearClienteUseCase();
	    ClienteTO clienteResult = null;
	    try {
	      clienteResult = (ClienteTO) useCase.ejecutar(cliente); 
	    }
	    catch (ExcepcionUnitOfWork e) {
	      throw e;
	    }
	    return clienteResult;
	  }

}
