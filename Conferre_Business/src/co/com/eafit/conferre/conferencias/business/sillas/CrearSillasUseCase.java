package co.com.eafit.conferre.conferencias.business.sillas;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import co.com.eafit.conferre.conferencias.business.base.UnitOfWork;
import co.com.eafit.conferre.conferencias.data.base.FabricaDAO;
import co.com.eafit.conferre.conferencias.data.base.ObjetoTO;
import co.com.eafit.conferre.conferencias.data.dac.SillasDAO;
import co.com.eafit.conferre.conferencias.data.to.EventoTO;
import co.com.eafit.conferre.conferencias.data.to.SillasTO;
import co.com.eafit.conferre.soporte.ExcepcionUnitOfWork;

public class CrearSillasUseCase implements UnitOfWork {
	List<SillasTO> SillasCreadas = new ArrayList<SillasTO>();
	@Override
	public ObjetoTO ejecutar(ObjetoTO parametros) throws ExcepcionUnitOfWork {
		SillasTO sillasTO = (SillasTO) parametros;
		
		SillasTO resultado = null;
	    try {
	    	SillasDAO sillasDAO = FabricaDAO.crearSillasDAO();
	    	UUID id = UUID.randomUUID();
	    	sillasTO.setId(id.toString());
	    	resultado = (SillasTO) sillasDAO.crear(sillasTO);
	    	SillasCreadas.add(sillasTO);
	    } catch (Exception e) {
	    	throw new ExcepcionUnitOfWork(e);
	    }
	    return resultado;
	}
}