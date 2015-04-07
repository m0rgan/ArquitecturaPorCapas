package co.com.eafit.conferre.conferencias.business.sillas;

import java.util.ArrayList;
import java.util.List;

import co.com.eafit.conferre.conferencias.data.to.SillasTO;

public class comprarSillasUseCase {
	List<SillasTO> SillasCompradas = new ArrayList<SillasTO>();
	public void ComprarSilla(SillasTO silla){
		SillasCompradas.add(silla);
		
	}

}
