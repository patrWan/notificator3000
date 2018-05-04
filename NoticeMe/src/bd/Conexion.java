package bd;
//java.sql
import java.sql.Connection; // Sirve para establecwer la conexion
import java.sql.Statement; //Ejecuta consultas (querys)
import java.sql.ResultSet; //Tabla virtual --> select
import java.sql.DriverManager; //Obtener la conexion del driver.
import java.sql.SQLException;

public class Conexion {//General mySql --> Para todo
    private Connection con;
    private Statement sentencia;
    private ResultSet tablaVirtual; //rs
    
    
    public Conexion(String server, String user, String pass, String bdName) throws ClassNotFoundException, SQLException{
       
        String protocolo = "jdbc:mysql://";
        String lineaUsuario = "user="+user;
        String lineaPass = "password="+pass;
        
        String url = protocolo + server + "/" + bdName + "?" + lineaUsuario + "&" + lineaPass;
        
        System.out.println(url);
        
        Class.forName("com.mysql.jdbc.Driver");
        
        con = DriverManager.getConnection(url);
    }
    
    
    public void ejecutar(String sql) throws SQLException{
        sentencia = con.createStatement();
        sentencia.execute(sql);
        System.out.println(sql);
        desconectar();
    }
    
    public ResultSet ejecutarSelect(String select) throws SQLException{
        sentencia = con.createStatement();
        tablaVirtual = sentencia.executeQuery(select);
        System.out.println(select);
        
        return tablaVirtual;
    }
    
    public void desconectar() throws SQLException{
        sentencia.close();
    }
}
