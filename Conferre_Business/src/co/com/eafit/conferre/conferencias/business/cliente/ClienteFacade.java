package co.com.eafit.conferre.conferencias.business.cliente;

import co.com.eafit.conferre.conferencias.data.*;
import co.com.eafit.conferre.conferencias.data.to.ClienteTO;
import co.com.eafit.conferre.soporte.ExcepcionUnitOfWork;

public interface ClienteFacade {
	public ClienteTO crearCliente(ClienteTO cliente) throws ExcepcionUnitOfWork;
}
