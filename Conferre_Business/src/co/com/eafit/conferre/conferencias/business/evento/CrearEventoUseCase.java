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
	  public ObjetoTO ejecutar(ObjetoTO params) throws ExcepcionUnitOfWork {
	    EventoTO evento = (EventoTO) params;
	 
	    EventoDAO eventoDAO = FabricaDAO.crearEventoDAO();
	    EventoTO result;
	    try {
	      result = (EventoTO) eventoDAO.crear(evento);
	    }
	    catch (Exception e) {
	     result=null;
	    }
	    return result;
	  }

	
}
