package edu.co.sergio.mundo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import edu.co.sergio.mundo.vo.visitasTecnicas;
import edu.co.sergio.mundo.vo.Recoleccion;
import java.net.URISyntaxException;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Isabel-Fabian
 * @since 12/08/2015
 * @version 2
 * Clase que permite la gestion de la tabla Depto en la base de datos.
 * 
 * CREATE TABLE Depto(
 *     id_depto integer,
 *     nom_depto varchar(40),
 *     PRIMARY KEY(id_depto)
 * );
 */
 

public class VisitasTecnicasDAO  {

    
	public List<visitasTecnicas> findAll() {
		List<visitasTecnicas> Visitas= null;
	    String query = "SELECT * FROM visitaTecnica";
	    Connection connection = null;
            try {
                connection = Conexion.getConnection();
            } catch (URISyntaxException ex) {
                Logger.getLogger(VisitasTecnicasDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
	    try {
	    Statement st = connection.createStatement();
	    ResultSet rs = st.executeQuery(query);
	    int Poblacion = 0;
            String CalidadPoblacion = null;
            boolean PresenciaDeLaReina;
            boolean ProduccionMiel;
            int idColmena = 0;
            int PanelesCera = 0;
            int PanelesAlimento = 0;
            int PanelesCria = 0;
            int PanelesVacios = 0;
            int idVisita = 0;
            
	    while (rs.next()){
	    	if(Visitas == null){
	    		Visitas= new ArrayList<visitasTecnicas>();
	    	}
	      
	        visitasTecnicas registro= new visitasTecnicas();
	        
                Poblacion = rs.getInt("poblacion");
                registro.setPoblacion(Poblacion);
                
                CalidadPoblacion = rs.getString("calidadPoblacion");
                registro.setCalidadPoblacion(CalidadPoblacion);
                
                PresenciaDeLaReina = rs.getBoolean("PresenciaDeLaReina");
                registro.setPresenciaDeLaReina(PresenciaDeLaReina);
                
                ProduccionMiel = rs.getBoolean("ProduccionDeMiel");
                registro.setProduccionMiel(ProduccionMiel);
                
                idColmena = rs.getInt("idColmena");
                registro.setId(idColmena);
                
                PanelesCera = rs.getInt("PanelesDeCera");
                registro.setPanelesDeCera(PanelesCera);
                
                PanelesAlimento = rs.getInt("PanelesConAlimento");
                registro.setPanelesConAlimento(PanelesAlimento);
                
                PanelesCria = rs.getInt("PanelesConCria");
                registro.setPanelesConCria(PanelesCria);
                
                PanelesVacios = rs.getInt("PanelesVacios");
                registro.setPanelesVacios(PanelesVacios);
                
                idVisita = rs.getInt("idVisita");
                registro.setIdVisita(idVisita);
                
	        Visitas.add(registro);
	    }
	    st.close();
	    
	    } catch (SQLException e) {
			System.out.println("Problemas al obtener la lista de Visitas tecnicas");
			e.printStackTrace();
		}
	    
	    return Visitas;
	}

	public List<Recoleccion> findAll2() {
		List<Recoleccion> Recoleccion= null;
	    String query = "SELECT * FROM recoleccion";
	    Connection connection = null;
            try {
                connection = Conexion.getConnection();
            } catch (URISyntaxException ex) {
                Logger.getLogger(VisitasTecnicasDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
	    try {
	    Statement st = connection.createStatement();
	    ResultSet rs = st.executeQuery(query);
	    
	    String fecha = null;
            int recolector = 0;
            int idColmena = 0;
            int KilosDeMiel = 0;
            int idRecoleccion = 0;
            
	    while (rs.next()){
	    	if(Recoleccion == null){
	    		Recoleccion= new ArrayList<Recoleccion>();
	    	}
	      
	        Recoleccion registro= new Recoleccion();
                
                fecha = rs.getString("fecha");
                registro.setFecha(fecha);
                
                recolector = rs.getInt("recolector");
                registro.setRecolector(recolector);
                
                idColmena = rs.getInt("idColmena");
                registro.setIdColmena(idColmena);
                
                KilosDeMiel = rs.getInt("KilosDeMiel");
                registro.setKilosdeMiel(KilosDeMiel);
                
                idRecoleccion = rs.getInt("idRecoleccion");
                registro.setIdRecoleccion(idRecoleccion);
                
	        Recoleccion.add(registro);
	    }
	    st.close();
	    
	    } catch (SQLException e) {
			System.out.println("Problemas al obtener la lista de Visitas tecnicas");
			e.printStackTrace();
		}
	    
	    return Recoleccion;
	}
}
