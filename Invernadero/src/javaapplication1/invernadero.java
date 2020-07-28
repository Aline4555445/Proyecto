/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.io.IOException;
import javax.swing.JOptionPane;
import org.json.simple.JSONObject;

public class invernadero {
     public static void main(String[] args) throws IOException {
        // TODO code application logic here
//        String solicitud_url = "http://docker.local/api-invernadero/public/api/invernadero";
//        curl api = new curl(solicitud_url, "POST");
//        
//        JSONObject invernadero = new JSONObject();
//        JSONObject obj = api.apicall(invernadero);
          
        //System.out.println(obj.get("mensaje"));
 
        invernadero con= new invernadero();
        String respuesta= con.consulta_invernadero();
        System.out.println(respuesta);
        
   

    }
     public String consulta_invernadero (){
        String solicitud_url = "http://docker.local/api-invernadero/public/api/invernadero";
        curl api = new curl(solicitud_url, "POST");
        
        JSONObject invernadero = new JSONObject();
        JSONObject obj = api.apicall(invernadero);
        String res= obj.toString();
        return res;
        
  }
}


