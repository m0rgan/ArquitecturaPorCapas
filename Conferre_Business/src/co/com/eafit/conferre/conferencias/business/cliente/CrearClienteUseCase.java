package co.com.eafit.conferre.conferencias.business.cliente;

import java.util.UUID;

import co.com.eafit.conferre.conferencias.business.base.UnitOfWork;
import co.com.eafit.conferre.conferencias.data.base.ObjetoTO;
import co.com.eafit.conferre.soporte.ExcepcionUnitOfWork;
import co.com.eafit.conferre.conferencias.business.base.UnitOfWork;
import co.com.eafit.conferre.conferencias.data.base.FabricaDAO;
import co.com.eafit.conferre.conferencias.data.base.ObjetoTO;
import co.com.eafit.conferre.conferencias.data.dac.ClienteDAO;
import co.com.eafit.conferre.conferencias.data.to.ClienteTO;
import co.com.eafit.conferre.soporte.ExcepcionUnitOfWork;
import co.com.eafit.conferre.conferencias.data.*;
import co.com.eafit.conferre.soporte.*;
public class CrearClienteUseCase implements UnitOfWork {

	@Override
	public ObjetoTO ejecutar(ObjetoTO parametros) throws ExcepcionUnitOfWork {
ClienteTO cliente = (ClienteTO) parametros;
	    
	    ClienteDAO clienteDAO = FabricaDAO.crearClienteDAO();
	    ClienteTO resultado;
	    try {
	      resultado = (ClienteTO) clienteDAO.crear(cliente);
	    }
	    catch (Exception e) {
	      throw new ExcepcionUnitOfWork(e);
	    }
	    return resultado;
	
	}

}
