package co.com.eafit.conferre.conferencias.business.conferencias;

import java.util.UUID;

import co.com.eafit.conferre.conferencias.business.base.UnitOfWork;
import co.com.eafit.conferre.conferencias.data.base.FabricaDAO;
import co.com.eafit.conferre.conferencias.data.base.ObjetoTO;
import co.com.eafit.conferre.conferencias.data.dac.ConferenciaDAO;
import co.com.eafit.conferre.conferencias.data.to.ConferenciaTO;
import co.com.eafit.conferre.soporte.ExcepcionUnitOfWork;

public class CrearConferenciaUseCase implements UnitOfWork {
	
	@Override
	public ObjetoTO ejecutar(ObjetoTO parametros) throws ExcepcionUnitOfWork {
		ConferenciaTO conferenciaTO  = (ConferenciaTO) parametros;
		ConferenciaTO resultado = null;
		try {
			ConferenciaDAO conferenciaDAO = FabricaDAO.crearConferenciaDAO();
			UUID id = UUID.randomUUID();
			conferenciaTO.setId(id.toString());
			resultado = (ConferenciaTO) conferenciaDAO.crear(conferenciaTO);
		} catch (Exception e) {
			throw new ExcepcionUnitOfWork(e);
		}	
		return resultado;
	}
}