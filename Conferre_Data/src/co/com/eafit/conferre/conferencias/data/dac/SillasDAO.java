/**
 * 
 */
package co.com.eafit.conferre.conferencias.data.dac;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Collection;

import co.com.eafit.conferre.conferencias.data.base.DAOGenerico;
import co.com.eafit.conferre.conferencias.data.base.ObjetoTO;
import co.com.eafit.conferre.conferencias.data.to.ConferenciaTO;
import co.com.eafit.conferre.conferencias.data.to.SillasTO;
import co.com.eafit.conferre.conferencias.data.to.SillasTO;

/**
 * @author Moreno
 *
 */
public class SillasDAO implements DAOGenerico {

	java.sql.Connection  conn;
	
	public SillasDAO(Connection conn2) {
		this.conn = conn2;
	}
	
	
	@Override
	public ObjetoTO crear(ObjetoTO parametro) {
		SillasTO sillas = null;
		
		try {
			sillas = (SillasTO) parametro;
			PreparedStatement prep = conn.prepareStatement("INSERT INTO Sillas values(?,?)");
			prep.setString(1, sillas.getNumero());
			prep.setString(2, sillas.getTipo());
			
			int resultado = prep.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return sillas;
	}

	
	@Override
	public Collection<ObjetoTO> recuperar(ObjetoTO parametros) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see co.com.eafit.conferre.conferencias.data.base.DAOGenerico#update(co.com.eafit.conferre.conferencias.data.base.ObjetoTO)
	 */
	@Override
	public ObjetoTO update(ObjetoTO nuevoObjeto) {
		SillasTO list = null;
		
		try {
			list = (SillasTO) nuevoObjeto;
			PreparedStatement prep = conn.prepareStatement("UPDATE Sillas SET Numero = ?, Tipo = ? WHERE Sillaid = ?");
			prep.setString(1, list.getAsistentes())
			prep.setString(2, list.getId_conferencia());
			prep.setString(3, list.getId_evento());
			prep.setString(4, list.getId());
			int resultado = prep.executeUpdate();
			prep.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	/* (non-Javadoc)
	 * @see co.com.eafit.conferre.conferencias.data.base.DAOGenerico#borrar(co.com.eafit.conferre.conferencias.data.base.ObjetoTO)
	 */
	@Override
	public int borrar(ObjetoTO objetoaBorrar) {
		// TODO Auto-generated method stub
		return 0;
	}

}
