/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.barbaro.apidisfraces.resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author César Slz
 */
@Path("disfraces")
public class DisfrazResource {
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getDisfraces() {
        return "";
    }
    
    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public String getDisfrazById(@PathParam("id") String id) {
        return "";
    }
    
    @GET
    @Path("recomendacion")
    @Produces(MediaType.APPLICATION_JSON)
    public String getDisfracesByCategoria(@QueryParam("categoria") String categoria) { 
        return "";
    }
    
    @GET
    @Path("genero/{genero}")
    @Produces(MediaType.APPLICATION_JSON)
    public String getDisfrazByGenero(@QueryParam("genero") String genero) {
        return "";
    }
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String createDisfraz(String jsonDisfraz) {
        return "";
    }
}
