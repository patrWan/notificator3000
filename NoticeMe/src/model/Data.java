package model;

import bd.Conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Data {
    private Conexion con; //Objeto tipo Conexion
    private String query;
    private ResultSet rs;
    
    private List<Serie> listaSeries;
    private List<Dia_semana> listaDias;
    private int diaActual;
    
    public Data() throws ClassNotFoundException, SQLException{
        con = new Conexion("localhost", "root", "123456", "notificator_db");
    }
    
    public void ingresarSerie(Serie s) throws SQLException{
        query="INSERT INTO serie VALUES(NULL, '"+s.getNombre()+"', '"+s.getDia_capitulo()+"', TRUE);";
        con.ejecutar(query);
    }
    
    public List<Serie> getSeries(int dia) throws SQLException{
        Serie s;
        listaSeries = new ArrayList<>();
        
        query = "SELECT nombre FROM serie WHERE diaSemana_fk ="+dia;
        rs = con.ejecutarSelect(query);
        
        while (rs.next()) {            
            s = new Serie();
            s.setNombre(rs.getString(1));
            listaSeries.add(s);
        }
        con.desconectar();
        
        return listaSeries;
    }
    
    public List<Dia_semana> getDiasSemana() throws SQLException{
        Dia_semana d;
        listaDias = new ArrayList<>();
        
        query = "SELECT * FROM diaSemana;";
        rs = con.ejecutarSelect(query);
        
        while (rs.next()) {            
            d = new Dia_semana();
            d.setId(rs.getInt(1));
            d.setDia(rs.getString(2));
            listaDias.add(d);
        }
        con.desconectar();
        
        return listaDias;
    }
    
    public int getDiaActual() throws SQLException{
        query="SELECT (WEEKDAY(NOW()) + 1) AS DIA_SEMANA;";
        rs = con.ejecutarSelect(query);
        
        if (rs.next()) {
            diaActual = rs.getInt(1);
        }
        return diaActual;
    }
    
}
