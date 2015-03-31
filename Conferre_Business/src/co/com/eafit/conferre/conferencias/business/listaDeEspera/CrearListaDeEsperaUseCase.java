package co.com.eafit.conferre.conferencias.business.listaDeEspera;

import java.util.UUID;

import co.com.eafit.conferre.conferencias.business.base.UnitOfWork;
import co.com.eafit.conferre.conferencias.data.base.FabricaDAO;
import co.com.eafit.conferre.conferencias.data.base.ObjetoTO;
import co.com.eafit.conferre.conferencias.data.dac.ListaDeEsperaDAO;
import co.com.eafit.conferre.conferencias.data.to.ListaDeEsperaTO;
import co.com.eafit.conferre.soporte.ExcepcionUnitOfWork;

public class CrearListaDeEsperaUseCase implements UnitOfWork {
	
	@Override
	public ObjetoTO ejecutar(ObjetoTO parametros) throws ExcepcionUnitOfWork {
		ListaDeEsperaTO listaDeEsperaTO = (ListaDeEsperaTO) parametros;
		ListaDeEsperaTO resultado = null;
	    try {
	    	ListaDeEsperaDAO listaDeEsperaDAO = FabricaDAO.crearListaDeEsperaDAO();
	    	UUID id = UUID.randomUUID();
	    	listaDeEsperaTO.setId(id.toString());
	    	resultado = (ListaDeEsperaTO) listaDeEsperaDAO.crear(listaDeEsperaTO);
	    }catch (Exception e) {
	    	throw new ExcepcionUnitOfWork(e);
	    }
	    return resultado;
	}
}