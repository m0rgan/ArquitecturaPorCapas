package co.com.eafit.conferre.conferencias.business.listaDeEspera;

import java.util.UUID;

import co.com.eafit.conferre.conferencias.business.base.UnitOfWork;
import co.com.eafit.conferre.conferencias.data.base.FabricaDAO;
import co.com.eafit.conferre.conferencias.data.base.ObjetoTO;
import co.com.eafit.conferre.conferencias.data.dac.AsistentesDAO;
import co.com.eafit.conferre.conferencias.data.dac.ListaDeEsperaDAO;
import co.com.eafit.conferre.conferencias.data.to.AsistentesTO;
import co.com.eafit.conferre.conferencias.data.to.ListaDeEsperaTO;
import co.com.eafit.conferre.soporte.ExcepcionUnitOfWork;

public class CrearListaDeEsperaUseCase implements UnitOfWork {
@Override
	public ObjetoTO ejecutar(ObjetoTO parametros)  {
		
	ListaDeEsperaTO lista = (ListaDeEsperaTO) parametros;
	    
	ListaDeEsperaDAO listaDAO = FabricaDAO.crearListaDeEsperaDAO();
	ListaDeEsperaTO resultado;
	    try {
	      resultado = (ListaDeEsperaTO) listaDAO.crear(lista);
	    }
	    catch (Exception e) {
	     resultado=null;
	    }
	    return resultado;

	}
}
