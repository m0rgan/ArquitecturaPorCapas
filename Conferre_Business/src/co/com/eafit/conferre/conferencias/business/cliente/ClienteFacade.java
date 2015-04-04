package co.com.eafit.conferre.conferencias.business.cliente;

import co.com.eafit.conferre.conferencias.data.to.ClienteTO;

public interface ClienteFacade {
	public ClienteTO crearCliente(ClienteTO cliente) ;
	public ClienteTO ingresarAlSistema(ClienteTO cliente) ;
}
