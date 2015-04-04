package co.com.eafit.conferre.conferencias.business.cliente;

import java.util.UUID;

import co.com.eafit.conferre.conferencias.business.base.UnitOfWork;
import co.com.eafit.conferre.conferencias.data.base.DAOGenerico;
import co.com.eafit.conferre.conferencias.data.base.FabricaDAO;
import co.com.eafit.conferre.conferencias.data.base.ObjetoTO;
import co.com.eafit.conferre.conferencias.data.dac.ClienteDAO;
import co.com.eafit.conferre.conferencias.data.to.ClienteTO;
import co.com.eafit.conferre.soporte.ExcepcionUnitOfWork;
import co.com.eafit.conferre.soporte.ExcepcionValidacion;

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
	
	  public ClienteTO IngresoAlSistema(ClienteTO cliente) throws ExcepcionValidacion{
		    if (cliente.getUsuario() == null || cliente.getUsuario().equals("")) {
		      throw new ExcepcionValidacion("El nombre no puede estar vac�o");
		    }
		    if (cliente.getContrase�a()== null || cliente.getContrase�a().equals("")) {
		      throw new ExcepcionValidacion("La contrse�a no puede estar vac�a");
		    }
		    cliente.setId("1");
		    cliente.setNombre("1");
		    cliente.setCorreo("1");
		    cliente.setTelefono("1");
		   
		    return cliente;
		  }
}