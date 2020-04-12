/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author iwan
 */
public class Koneksi {
public Connection bukakoneksi(){
  Connection con=null;
try{  
    Class.forName("com.mysql.jdbc.Driver");
    con=(Connection)DriverManager.getConnection
            ("jdbc:mysql://localhost/java2db","root","");
    System.out.println("koneksi berhasil");
    return con;    
}
catch (Exception e){
    System.out.println("koneksi gagal");
    return null;
            }
} 
public static void main (String args[]){
new Koneksi().bukakoneksi();
}
}
