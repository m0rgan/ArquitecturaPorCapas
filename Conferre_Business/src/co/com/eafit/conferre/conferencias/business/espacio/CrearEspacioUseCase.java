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
	  public ObjetoTO ejecutar(ObjetoTO params)  {
	    EspacioTO espacio = (EspacioTO) params;
	    EspacioDAO espacioDAO = FabricaDAO.crearEspacioDAO();
	    EspacioTO result;
	    try {
	      result = (EspacioTO) espacioDAO.crear(espacio);
	    }
	    catch (Exception e) {
	    	result= null;
	 
	    }
	    return result;
	  }
	  

}
