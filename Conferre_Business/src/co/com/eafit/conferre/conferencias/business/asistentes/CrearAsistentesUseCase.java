package co.com.eafit.conferre.conferencias.business.asistentes;

import java.util.UUID;

import co.com.eafit.conferre.conferencias.business.base.UnitOfWork;
import co.com.eafit.conferre.conferencias.data.base.FabricaDAO;
import co.com.eafit.conferre.conferencias.data.base.ObjetoTO;
import co.com.eafit.conferre.conferencias.data.dac.AsistentesDAO;
import co.com.eafit.conferre.conferencias.data.to.AsistentesTO;
import co.com.eafit.conferre.soporte.ExcepcionUnitOfWork;

public class CrearAsistentesUseCase implements UnitOfWork {

	@Override
	public ObjetoTO ejecutar(ObjetoTO parametros) throws ExcepcionUnitOfWork {
		AsistentesTO asistentesTO = (AsistentesTO) parametros;
	    AsistentesTO resultado = null;
	    try {
	    	AsistentesDAO asistenteDAO = FabricaDAO.crearAsistentesDAO();
	    	UUID id = UUID.randomUUID();
	    	asistentesTO.setId(id.toString());
	    	resultado = (AsistentesTO) asistenteDAO.crear(asistentesTO);
	    } catch (Exception e) {
	    	throw new ExcepcionUnitOfWork(e);
	    }
	    return resultado;
	}
}