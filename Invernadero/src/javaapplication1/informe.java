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

public class informe {
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        String solicitud_url = "http://192.168.99.100/api-invernadero/public/api/informe";
        curl api = new curl(solicitud_url, "POST");
        
        JSONObject informe = new JSONObject();
        informe.put("id_sensor", 2);
        informe.put("fecha", "2020/04/09");
        informe.put("hora", "02:28:13");
        informe.put("temperatura", 21);
        informe.put("humedad", 4.5);
          
        JSONObject obj = api.apicall(informe);
          
        System.out.println(obj.get("mensaje"));
 
    

    }
}
