
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
import co.com.eafit.conferre.conferencias.data.to.EspacioTO;

public class ConferenciaDAO implements DAOGenerico {

	java.sql.Connection  conn;
	
	public ConferenciaDAO(Connection conn2) {
		this.conn = conn2;
	}

	@Override
	public ObjetoTO crear(ObjetoTO parametro) {
		ConferenciaTO conf = null;
		try {
			conf = (ConferenciaTO) parametro;
			PreparedStatement prep = conn.prepareStatement("INSERT INTO conferencias values(?,?,?,?,?)");
			prep.setString(1, conf.getNombre());
			prep.setString(2, conf.getNombreConferencista());
			prep.setString(3, conf.getTipo());
			Date fecha = new Date(conf.getFecha().getTime());
			prep.setDate(4, fecha);
			prep.setInt(5, conf.getSillasDisponibles());
			int resultado = prep.executeUpdate();			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conf;
	}

	@Override
	public Collection<ObjetoTO> recuperar(ObjetoTO parametros) {
		ConferenciaTO confparametros = (ConferenciaTO) parametros;
		Collection<ObjetoTO> conf = null;
		PreparedStatement preparedStatement = null;

		String selectSQL = "SELECT * FROM Conferencias WHERE Conferenciaid = ?";

			try {
			preparedStatement = conn.prepareStatement(selectSQL);
			preparedStatement.setString(1, confparametros.getId());
			// execute select SQL statement
			ResultSet rs = preparedStatement.executeQuery();
				while (rs.next()) {
					ConferenciaTO c = new ConferenciaTO();
					EspacioTO e = new EspacioTO();
					c.setId(rs.getString("Conferenciaid"));
					c.setNombre(rs.getString("Nombre"));
					c.setNombreConferencista(rs.getString("Conferencista"));
					c.setFecha(Date.valueOf(rs.getString("Fecha")));
					c.setTipo(rs.getString("Tipo"));
					c.setSillasDisponibles(Integer.parseInt(rs.getString("Sillas")));
					e.setNombre(rs.getString("NombreEspacio"));
					e.setDisponible(rs.getBoolean("DisponibleEspacio"));
					c.setEspacio(e);
					conf.add(c);
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
			return conf;
	}

	@Override
	public ObjetoTO update(ObjetoTO nuevoObjeto) {
		ConferenciaTO conf = null;
		
		try {
			conf = (ConferenciaTO) nuevoObjeto;
			PreparedStatement prep = conn.prepareStatement("UPDATE Conferencias SET Nombre = ?, NombreConferencista = ?, Tipo = ?,  Fecha = ?, SillasDisponibles = ? WHERE  Conferenciaid = ?");
			prep.setString(1, conf.getNombre());
			prep.setString(2, conf.getNombreConferencista());
			prep.setString(3, conf.getTipo());
			
			Date fecha = new Date(conf.getFecha().getTime());
			prep.setDate(4, fecha);
			prep.setInt(5, conf.getSillasDisponibles());
			prep.setString(6, conf.getId());
			
			int resultado = prep.executeUpdate();
			prep.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conf;
	}
	

	@Override
	public int borrar(ObjetoTO objetoaBorrar) {
		// TODO Auto-generated method stub
		return 0;
	}

}
