/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.io.IOException;
import org.json.simple.JSONObject;

public class invernadero {
     public static void main(String[] args) throws IOException {
        // TODO code application logic here
        String solicitud_url = "http://192.168.99.100/api-invernadero/public/api/invernadero";
        curl api = new curl(solicitud_url, "POST");
        
        JSONObject invernadero = new JSONObject();
        invernadero.put("id_planta", 2);
        
          
        JSONObject obj = api.apicall(invernadero);
          
        System.out.println(obj.get("mensaje"));
 
    

    }
}
