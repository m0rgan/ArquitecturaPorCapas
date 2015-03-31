package co.com.eafit.conferre.conferencias.business.evento;

import java.util.UUID;

import co.com.eafit.conferre.conferencias.business.base.UnitOfWork;
import co.com.eafit.conferre.conferencias.data.base.FabricaDAO;
import co.com.eafit.conferre.conferencias.data.base.ObjetoTO;
import co.com.eafit.conferre.conferencias.data.dac.EventoDAO;
import co.com.eafit.conferre.conferencias.data.to.EventoTO;
import co.com.eafit.conferre.soporte.ExcepcionUnitOfWork;

public class CrearEventoUseCase implements UnitOfWork {
	
	@Override
	public ObjetoTO ejecutar(ObjetoTO parametros) throws ExcepcionUnitOfWork {
		EventoTO eventoTO = (EventoTO) parametros;
	    EventoTO resultado = null;
	    try {
	    	EventoDAO eventoDAO = FabricaDAO.crearEventoDAO();
	    	UUID id = UUID.randomUUID();
	    	eventoTO.setId(id.toString());
	    	resultado = (EventoTO) eventoDAO.crear(eventoTO);
	    } catch (Exception e) {
	    	throw new ExcepcionUnitOfWork(e);
	    }
	    return resultado;
	  }
}