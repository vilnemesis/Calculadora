/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.calculadora;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;


/**
 * REST Web Service
 *
 * @author Tiesto
 */
@Path("/v1/calculator")
public class Calculator {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of GenericResource
     */
    public Calculator() {
    }

    @GET
    @Path("/add/{expresion: [a-zA-Z0-9_/-]+}")
    public String sumar(@PathParam("expresion") String expresion) {
        
        String[] splitExpresion = expresion.split("/");
        Integer resultado = 0;
        
        for(String s: splitExpresion){
            resultado+=Integer.valueOf(s);
        }
        return resultado.toString();
    }
    
    @GET
    @Path("/subs/{expresion: [a-zA-Z0-9_/-]+}")
    public String restar(@PathParam("expresion") String expresion) {
         String[] splitExpresion = expresion.split("/");
        Integer resultado = 0;
        
        for(String s: splitExpresion){
            resultado-=Integer.valueOf(s);
        }
        return resultado.toString();
    }
    
    @GET
    @Path("/mult/{expresion: [a-zA-Z0-9_/-]+}")
    public String multiplicar(@PathParam("expresion") String expresion) {
         String[] splitExpresion = expresion.split("/");
        Long resultado = 1L;
        
        for(String s: splitExpresion){
            resultado=Long.valueOf(s)*resultado;
        }
        return resultado.toString();
    }
    
    @GET
    @Path("/div/{expresion : [a-zA-Z0-9_/-]+}")
    public String dividir(@PathParam("expresion") String expresion) {
        
           String[] splitExpresion = expresion.split("/");
            Double resultado = 1D;

            for(String s: splitExpresion){
                resultado=Double.valueOf(s)/resultado;
            }
            return resultado.toString();
    
    }
        
}
