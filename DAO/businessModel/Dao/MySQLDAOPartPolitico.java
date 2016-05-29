package businessModel.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import models.PartidoPolitico;


public class MySQLDAOPartPolitico implements DAOPartPolitico{
	
	private Connection connect = null;
	private Statement statement = null;
	private ResultSet resultSet = null;
	
	
	@Override
	public void add(PartidoPolitico p) {
		// TODO Auto-generated method stub
		
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			connect = DriverManager.getConnection(DBConnection.URL_JDBC_MySQL,DBConnection.user,
													DBConnection.password);
			statement = connect.createStatement();
			statement.executeUpdate("INSERT INTO PartidosPoliticos "+
									"(Nombre , Representante , TelefonoRepre , Correo) " +
									"VALUES ('" + p.getNombre() + "', '" + p.getNombreRep() + "', '" +
									p.getTelefono() + "', '" + p.getCorreo() + "')");							
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
				
	}

	@Override
	public ArrayList<PartidoPolitico> queryAllPartPol() {
		ArrayList<PartidoPolitico> arr = new ArrayList<PartidoPolitico>();
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			connect = DriverManager.getConnection(DBConnection.URL_JDBC_MySQL,DBConnection.user,
													DBConnection.password);

			statement = connect.createStatement();								
			resultSet = statement.executeQuery("select * from PartidosPoliticos");
			
			while (resultSet.next()){
				int id = resultSet.getInt("IdPartidosPoliticos");
				String nombre = resultSet.getString("Nombre");
				String rep = resultSet.getString("Representante");
				String tel = resultSet.getString("TelefonoRepre");
				String correo = resultSet.getString("Correo");
				
				PartidoPolitico p = new PartidoPolitico();
				p.setId(id);
				p.setNombre(nombre);
				p.setNombreRep(rep);
				p.setTelefono(tel);
				p.setCorreo(correo);
				arr.add(p);
			}
					
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		return arr;
	}

}
