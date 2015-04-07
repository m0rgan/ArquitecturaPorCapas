package co.com.eafit.conferre.conferencias.business.sillas;
import java.util.List;

import co.com.eafit.conferre.conferencias.data.to.SillasTO;
import co.com.eafit.conferre.conferencias.business.evento.CrearEventoUseCase;

public class listarSillasUseCase {
	comprarSillasUseCase cus = new comprarSillasUseCase();
	CrearSillasUseCase silla = new CrearSillasUseCase();
	List<SillasTO> sillasdisponible = null;
	public void mostrarSillas(){
		
		for(int i=1; i< silla.SillasCreadas.size(); i++){
			System.out.println(silla.SillasCreadas.get(i).getId());
		}
	}
	
	public void SillasDisponibles(){
		
		for(int i=1; i< silla.SillasCreadas.size();i++)
		{
			if(cus.SillasCompradas.contains(silla.SillasCreadas.get(i))){
								
			}else
			{
				sillasdisponible.add(silla.SillasCreadas.get(i));
				System.out.println(silla.SillasCreadas.get(i));
			}
		}
		
	}

}
