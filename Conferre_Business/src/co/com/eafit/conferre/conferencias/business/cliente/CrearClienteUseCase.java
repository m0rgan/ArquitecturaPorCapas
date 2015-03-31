package co.com.eafit.conferre.conferencias.business.cliente;

import java.util.UUID;

import co.com.eafit.conferre.conferencias.business.base.UnitOfWork;
import co.com.eafit.conferre.conferencias.data.base.FabricaDAO;
import co.com.eafit.conferre.conferencias.data.base.ObjetoTO;
import co.com.eafit.conferre.conferencias.data.dac.ClienteDAO;
import co.com.eafit.conferre.conferencias.data.to.ClienteTO;
import co.com.eafit.conferre.soporte.ExcepcionUnitOfWork;

public class CrearClienteUseCase implements UnitOfWork {

	@Override
	public ObjetoTO ejecutar(ObjetoTO parametros) throws ExcepcionUnitOfWork {
		ClienteTO clienteTO = (ClienteTO) parametros;
	    ClienteTO resultado;
	    try {
	    	ClienteDAO clienteDAO = FabricaDAO.crearClienteDAO();
	    	UUID id = UUID.randomUUID();
	    	clienteTO.setId(id.toString());
	    	resultado = (ClienteTO) clienteDAO.crear(clienteTO);
	    } catch (Exception e) {
	    	throw new ExcepcionUnitOfWork(e);
	    }
	    return resultado;
	}
}