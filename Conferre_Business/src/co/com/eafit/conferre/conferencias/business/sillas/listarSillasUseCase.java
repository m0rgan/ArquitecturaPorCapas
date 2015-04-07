package co.com.eafit.conferre.conferencias.business.sillas;

import co.com.eafit.conferre.conferencias.business.evento.CrearEventoUseCase;

public class listarSillasUseCase {
	comprarSillasUseCase cus = new comprarSillasUseCase();
	CrearSillasUseCase silla = new CrearSillasUseCase();
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
				System.out.println(silla.SillasCreadas.get(i));
			}
		}
		
	}

}
