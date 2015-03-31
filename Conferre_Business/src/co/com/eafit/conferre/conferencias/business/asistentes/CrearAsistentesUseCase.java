package co.com.eafit.conferre.conferencias.business.asistentes;

import java.util.UUID;

import co.com.eafit.conferre.conferencias.business.base.UnitOfWork;
import co.com.eafit.conferre.conferencias.data.base.FabricaDAO;
import co.com.eafit.conferre.conferencias.data.base.ObjetoTO;
import co.com.eafit.conferre.conferencias.data.dac.AsistentesDAO;
import co.com.eafit.conferre.conferencias.data.to.CLientesTO;
import co.com.eafit.conferre.soporte.ExcepcionUnitOfWork;
import co.com.eafit.conferre.conferencias.data.*;
import co.com.eafit.conferre.soporte.*;
public class CrearAsistentesUseCase implements UnitOfWork {

	@Override
	public ObjetoTO ejecutar(ObjetoTO parametros) throws ExcepcionUnitOfWork {
		// TODO Auto-generated method stub
		CLientesTO asistente = (CLientesTO) parametros;
	    
	    AsistentesDAO asistenteDAO = FabricaDAO.crearAsistentesDAO();
	    CLientesTO resultado;
	    try {
	      resultado = (CLientesTO) asistenteDAO.crear(asistente);
	    }
	    catch (Exception e) {
	      throw new ExcepcionUnitOfWork(e);
	    }
	    return resultado;

	}

}

