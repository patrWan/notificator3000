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
    private String diaActual;
    
    public Data() throws ClassNotFoundException, SQLException{
        con = new Conexion("localhost", "root", "123456", "notificator_db");
    }
    
    public void ingresarSerie(Serie s) throws SQLException{
        query="INSERT INTO serie VALUES(NULL, '"+s.getNombre()+"', '"+s.getDia_capitulo()+"', TRUE);";
        con.ejecutar(query);
    }
    
    public List<Serie> getSeries(String dia) throws SQLException{
        Serie s;
        listaSeries = new ArrayList<>();
        
        query = "SELECT nombre FROM serie WHERE dia_capitulos = '"+dia+"';";
        rs = con.ejecutarSelect(query);
        
        while (rs.next()) {            
            s = new Serie();
            s.setNombre(rs.getString(1));
            listaSeries.add(s);
        }
        con.desconectar();
        
        return listaSeries;
    }
    
    public String getDiaActual() throws SQLException{
        query="SELECT (ELT(WEEKDAY(NOW()) + 1, 'Lunes', 'Martes', 'Miercoles', 'Jueves', 'Viernes', 'Sabado', 'Domingo')) AS DIA_SEMANA";
        rs = con.ejecutarSelect(query);
        
        if (rs.next()) {
            diaActual = rs.getString(1);
        }
        return diaActual;
    }
    
}
