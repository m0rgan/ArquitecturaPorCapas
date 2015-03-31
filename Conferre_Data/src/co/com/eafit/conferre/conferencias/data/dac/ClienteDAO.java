package co.com.eafit.conferre.conferencias.data.dac;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;

import co.com.eafit.conferre.conferencias.data.base.DAOGenerico;
import co.com.eafit.conferre.conferencias.data.base.ObjetoTO;
import co.com.eafit.conferre.conferencias.data.to.ClienteTO;

public class ClienteDAO implements DAOGenerico {

	java.sql.Connection  conn;
	
	public ClienteDAO(Connection conn2) {
		this.conn = conn2;
	}
	
	@Override
	public ObjetoTO crear(ObjetoTO parametro) {
		ClienteTO clien = null;
		
		try {
			clien = (ClienteTO) parametro;
			PreparedStatement prep = conn.prepareStatement("INSERT INTO clientes values(?,?,?)");
			prep.setString(1, clien.getNombre());
			prep.setString(2, clien.getTelefono());
			prep.setString(3, clien.getCorreo());
			
			
			int resultado = prep.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return clien;
	}

	@Override
	public Collection<ObjetoTO> recuperar(ObjetoTO parametros) {
		ClienteTO clienparametros = (ClienteTO) parametros;
		Collection<ObjetoTO> clien = null;
		PreparedStatement preparedStatement = null;
		String selectSQL = "SELECT * FROM Cliente WHERE Clienteid = ?";
		try{
			preparedStatement = conn.prepareStatement(selectSQL);
			preparedStatement.setString(1, clienparametros.getId());;
			// execute select SQL statement
			ResultSet rs = preparedStatement.executeQuery();
			while (rs.next()) {
				ClienteTO c = new ClienteTO();
				c.setId(rs.getString("Clienteid"));
				c.setNombre(rs.getString("Nombre"));
				c.setTelefono(rs.getString("Telefono"));
				c.setCorreo(rs.getString("Correo"));
				c.setUsuario(rs.getString("Usuario"));
				c.setContraseña(rs.getString("Contraseña"));
				clien.add(c);
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
		return clien;
	}

	@Override
	public ObjetoTO update(ObjetoTO nuevoObjeto) {
		ClienteTO clien = null;
		
		try {
			clien = (ClienteTO) nuevoObjeto;
			PreparedStatement prep = conn.prepareStatement("UPDATE Clientes SET Nombre = ?, Telefono = ?, Correo = ?, Usuario = ?, Contraseña = ? WHERE Clienteid = ?");
			prep.setString(1, clien.getNombre());
			prep.setString(2, clien.getTelefono());
			prep.setString(3, clien.getCorreo());
			prep.setString(4, clien.getUsuario());
			prep.setString(5, clien.getContraseña());
			prep.setString(6, clien.getId());
			
			int resultado = prep.executeUpdate();
			prep.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return clien;
	}

	@Override
	public int borrar(ObjetoTO objetoaBorrar) {
		ClienteTO clien = null;
		int resultado = 0;
		
		try {
			clien = (ClienteTO) objetoaBorrar;
			PreparedStatement prep = conn.prepareStatement("DELETE FROM Clientes WHERE Clienteid = ?");
			prep.setString(1, clien.getId());

			resultado = prep.executeUpdate();
			prep.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return resultado;
	}

}
