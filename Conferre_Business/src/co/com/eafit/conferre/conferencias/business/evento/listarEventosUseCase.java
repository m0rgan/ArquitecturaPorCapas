package co.com.eafit.conferre.conferencias.business.evento;

public class listarEventosUseCase {

	
	
	public void mostrarEventos(){
		CrearEventoUseCase evento = new CrearEventoUseCase();
		for(int i=1; i<evento.EventosCreados.size(); i++){
			System.out.println(evento.EventosCreados.get(i).getId());
		}
	}
}
