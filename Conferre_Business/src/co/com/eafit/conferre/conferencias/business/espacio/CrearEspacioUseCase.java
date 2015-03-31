package co.com.eafit.conferre.conferencias.business.espacio;

import java.util.UUID;

import co.com.eafit.conferre.conferencias.business.base.UnitOfWork;
import co.com.eafit.conferre.conferencias.data.base.FabricaDAO;
import co.com.eafit.conferre.conferencias.data.base.ObjetoTO;
import co.com.eafit.conferre.conferencias.data.dac.EspacioDAO;
import co.com.eafit.conferre.conferencias.data.to.EspacioTO;
import co.com.eafit.conferre.soporte.ExcepcionUnitOfWork;

public class CrearEspacioUseCase implements UnitOfWork {
	
	@Override
	public ObjetoTO ejecutar(ObjetoTO parametros) throws ExcepcionUnitOfWork {
		EspacioTO espacioTO = (EspacioTO) parametros;
	    EspacioTO resultado = null;
	    try {
	    	EspacioDAO espacioDAO = FabricaDAO.crearEspacioDAO();
	    	UUID id = UUID.randomUUID();
	    	espacioTO.setId(id.toString());
	    	resultado = (EspacioTO) espacioDAO.crear(espacioTO);
	    } catch (Exception e) {
	    	throw new ExcepcionUnitOfWork(e);
	    }
	    return resultado;
	  }
}