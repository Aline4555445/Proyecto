/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import org.json.simple.JSONObject;

/**
 *
 * @author Gustavo Pastrana
 */
public class ObjetosJson {
    public static void main(String[]args)
    {
     ObjetosJson llamar = new ObjetosJson();
     System.out.println(llamar.consulta_invernadero());
    }
     public String consulta_invernadero (){
        String solicitud_url = "http://docker.local/api-invernadero/public/api/invernadero";
       // String solicitud_url = "http://127.0.0.1/api-invernadero/public/api/invernadero";
        
        curl api = new curl(solicitud_url, "POST");
        
        JSONObject invernadero = new JSONObject();
         
//              invernadero.put("id_invernadero", 1);
//              invernadero.put("id_planta", 1);
        JSONObject obj = api.apicall(invernadero);
        String res= obj.toString();
        return res;
        
  }
     public String consulta_informe (){
        String solicitud_url = "http://docker.local/api-invernadero/public/api/informe";
        // String solicitud_url = "http://127.0.0.1/api-invernadero/public/api/informe";
        curl api = new curl(solicitud_url, "POST");
        
        JSONObject informe = new JSONObject();
         
//              invernadero.put("id_invernadero", 1);
//              invernadero.put("id_planta", 1);
        JSONObject obj = api.apicall(informe);
        String res= obj.toString();
        return res;
     
     
}
     public String consulta_catalogo (){
        String solicitud_url = "http://docker.local/api-invernadero/public/api/catalogo";
        // String solicitud_url = "http://127.0.0.1/api-invernadero/public/api/catalogo";
        curl api = new curl(solicitud_url, "POST");
        
        JSONObject catalogo = new JSONObject();
         
//              invernadero.put("id_invernadero", 1);
//              invernadero.put("id_planta", 1);
        JSONObject obj = api.apicall(catalogo);
        String res= obj.toString();
        return res;
}
     public String consulta_sensor (){
        String solicitud_url = "http://docker.local/api-invernadero/public/api/sensor";
        // String solicitud_url = "http://127.0.0.1/api-invernadero/public/api/sensor";
        curl api = new curl(solicitud_url, "POST");
        
        JSONObject sensor = new JSONObject();
         
//              invernadero.put("id_invernadero", 1);
//              invernadero.put("id_planta", 1);
        JSONObject obj = api.apicall(sensor);
        String res= obj.toString();
        return res;
}
}