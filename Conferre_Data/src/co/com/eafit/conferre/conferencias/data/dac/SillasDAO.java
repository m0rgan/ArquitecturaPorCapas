/**
 * 
 */
package co.com.eafit.conferre.conferencias.data.dac;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
		SillasTO sillaparametros = (SillasTO) parametros;
		Collection<ObjetoTO> silla = null;
		PreparedStatement preparedStatement = null;

		String selectSQL = "SELECT * FROM Sillas WHERE Sillasid = ?";

			try {
			preparedStatement = conn.prepareStatement(selectSQL);
			preparedStatement.setString(1, sillaparametros.getId());
			// execute select SQL statement
			ResultSet rs = preparedStatement.executeQuery();
				while (rs.next()) {
					SillasTO s = new SillasTO();
					s.setId(rs.getString("Sillasid"));
					s.setNumero(rs.getString("Numero"));
					s.setTipo(rs.getString("Tipo"));
					silla.add(s);
				}
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			} finally {
				if (preparedStatement != null) {
					try {
						preparedStatement.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
				if (conn != null) {
					try {
						conn.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
			}	
		return silla;
	}

	/* (non-Javadoc)
	 * @see co.com.eafit.conferre.conferencias.data.base.DAOGenerico#update(co.com.eafit.conferre.conferencias.data.base.ObjetoTO)
	 */
	@Override
	public ObjetoTO update(ObjetoTO nuevoObjeto) {
		SillasTO sillas = null;
		
		try {
			sillas = (SillasTO) nuevoObjeto;
			PreparedStatement prep = conn.prepareStatement("UPDATE Sillas SET Numero = ?, Tipo = ? WHERE Sillaid = ?");
			prep.setString(1, sillas.getNumero());
			prep.setString(2, sillas.getTipo());
			prep.setString(3, sillas.getId());
			int resultado = prep.executeUpdate();
			prep.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return sillas;
	}

	/* (non-Javadoc)
	 * @see co.com.eafit.conferre.conferencias.data.base.DAOGenerico#borrar(co.com.eafit.conferre.conferencias.data.base.ObjetoTO)
	 */
	@Override
	public int borrar(ObjetoTO objetoaBorrar) {
		SillasTO sillas = null;
		int resultado = 0;
		
		try {
			sillas = (SillasTO) objetoaBorrar;
			PreparedStatement prep = conn.prepareStatement("DELETE FROM Sillas WHERE Sillasid = ?");
			prep.setString(1, sillas.getId());

			resultado = prep.executeUpdate();
			prep.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return resultado;
	}

}
