package co.com.eafit.conferre.conferencias.data.base;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

import co.com.eafit.conferre.conferencias.data.dac.AsistentesDAO;
import co.com.eafit.conferre.conferencias.data.dac.ClienteDAO;
import co.com.eafit.conferre.conferencias.data.dac.ConferenciaDAO;
import co.com.eafit.conferre.conferencias.data.dac.EspacioDAO;
import co.com.eafit.conferre.conferencias.data.dac.EventoDAO;
import co.com.eafit.conferre.conferencias.data.dac.ListaDeEsperaDAO;
import co.com.eafit.conferre.conferencias.data.dac.SillasDAO;

public class FabricaDAO {
	
	public static ConferenciaDAO crearConferenciaDAO(){
		Connection conn = crearConexion();
		return new ConferenciaDAO(conn);
	}
	public static AsistentesDAO crearAsistentesDAO(){
		Connection conn = crearConexion();
		return new AsistentesDAO(conn);
	}
	public static ClienteDAO crearClienteDAO(){
		Connection conn = crearConexion();
		return new ClienteDAO(conn);
	}
	public static EspacioDAO crearEspacioDAO(){
		Connection conn = crearConexion();
		return new EspacioDAO(conn);
	}
	public static EventoDAO crearEventoDAO(){
		Connection conn = crearConexion();
		return new EventoDAO(conn);
	}
	public static ListaDeEsperaDAO crearListaDeEsperaDAO(){
		Connection conn = crearConexion();
		return new ListaDeEsperaDAO(conn);
	}
	public static SillasDAO crearSillasDAO(){
		Connection conn = crearConexion();
		return new SillasDAO(conn);
	}
	
	public static Connection crearConexion(){
		Driver driver;
		Connection conn = null;
		try {
			driver = DriverManager.getDriver("com.mysql.Driver");
			conn = driver.connect("mysql://localhost:3693", null);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
}