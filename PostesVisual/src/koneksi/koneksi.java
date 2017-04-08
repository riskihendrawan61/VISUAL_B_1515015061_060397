package koneksi;
import java.sql.*;
import javax.swing.JOptionPane;
public class koneksi {
    private static Connection con;
    public static Connection getConnection(){
        try{
            con= DriverManager.getConnection(
            "jdbc:myssql://localhost:3306/visual","root","");
            JOptionPane.showMessageDialog(null, "koneksi berhasil");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "koneksi gagal"+e.getMessage());
        }
        return con;
    }
}
