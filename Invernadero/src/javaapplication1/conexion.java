/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class conexion {
    Connection con;
    
    public conexion(){
    
        try {
              Class.forName("com.mysql.jdbc.Driver");
              con = DriverManager.getConnection("jdbc:mysql://127.0.0.1/esp32", "root", "123456789");
             //con =DriverManager.getConnection("jdbc:mysql://192.168.99.100/esp32", "root", "123456789");
    // aqui van las sentencias sql
        } catch (Exception e) {
System.err.println ("Error: " + e);

    }
    } //
   
       
    public static void main(String[] args) { /// aqui es para visualizar si se hizo la conexion 
        conexion cn=new conexion();
        Statement st;
        ResultSet rs;
        try {
            st=cn.con.createStatement();
            rs=st.executeQuery("select * from catalogo");
            while (rs.next()) {   
                 //System.out.println(rs.getInt("id_invernadero")+" " +rs.getInt("id_planta"));
         System.out.println(rs.getInt("id_planta")+" " +rs.getString("nombre")+" " +rs.getInt("temperatura")+" " +rs.getFloat("humedad"));
            }
            cn.con.close();
        } catch (Exception e) {
        }
        
    }
       }
