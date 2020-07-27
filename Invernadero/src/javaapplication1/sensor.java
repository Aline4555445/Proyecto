/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class sensor {
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        String solicitud_url = "http://192.168.99.100/api-invernadero/public/api/sensor";
        curl api = new curl(solicitud_url, "POST");
        
        JSONObject sensor = new JSONObject();
        sensor.put("id_invernadero", 3);
          
        JSONObject obj = api.apicall(sensor);
          
        System.out.println(obj.get("mensaje"));
 
    

    }///puedes ver los cambios!!

}
