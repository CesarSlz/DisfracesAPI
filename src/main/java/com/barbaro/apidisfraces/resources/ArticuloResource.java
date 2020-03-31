
package com.barbaro.apidisfraces.resources;

import com.barbaro.apidisfraces.models.Articulo;
import com.barbaro.apidisfraces.util.DatabaseManager;
import com.google.gson.Gson;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("partes")
public class ArticuloResource {
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getPartes() {
        List<Articulo> articulos = DatabaseManager.getArticulos();
        String jsonArticulos = new Gson().toJson(articulos);
        return jsonArticulos;
    }
    
    // Indicar el tipo de metodo
    @POST
    
    // Entender como vienen los datos de la peticion para poder procesarlos
    // HIME TYPE
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public String crearParte(@FormParam("nombre") String nombre, 
            @FormParam("descripcion") String descipcion, @FormParam("precio") float precio,
            @FormParam("talla") String talla, @FormParam("material") String material,
            @FormParam("fotoUrl") String fotoUrl) {
        
        // El obtener los datos y parsearlos es realizado por las anotaciones de @FormParam
        // que estan definidas en los parametros
        
        // Validar los datos - no esta implementado
        
        // Crear tu modelo
        Articulo articulo = new Articulo();
        articulo.setNombre(nombre);
        articulo.setDescripcion(descipcion);
        articulo.setPrecio(precio);
        articulo.setTalla(talla);
        articulo.setMaterial(material);
        articulo.setFotoUrl(fotoUrl);
        
        // Persistir el modelo
        DatabaseManager.addArticulo(articulo);
        
        // Regresar una respuesta
        return "{\"message\": \"datos guardados\", \"id\": \"" + articulo.getId() + "\"}";
    }
    
    /*
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String crearParteJSON(Articulo articulo) {
        return "{\"message\": \"metodo no implementado, vuelve mas tarde\"}";
    }
    */
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    
    // Indicar el formato de la respuesta
    @Produces(MediaType.APPLICATION_JSON)
    public String crearParteJSONString(String jsonArticulo) {
        Gson gson = new Gson();
        Articulo articulo = gson.fromJson(jsonArticulo, Articulo.class);
        
        // TODO implementar capa de persistencia
        DatabaseManager.addArticulo(articulo);
        
        // Se construye un objeto de string en formato JSON
        // para indicar el resultado de la operacion
        return "{\"message\": \"articulo guardado JSON\"}";
    }
    
    @GET
    @Path("{id}")
    public String getParteById(@PathParam("id") String id) {
        //TODO Consulta de un articulo por id, implementar capa de persistencia
        return "{\"message\": \"Articulo id: " + id + "\"}";
    }
    
    @GET
    @Path("buscar")
    public String getPartesByNombre(@QueryParam("nombre") String nombre) {
        return "{\"message\": \"Articulo nombre: " + nombre + "\"}";
    }
    
    @GET
    @Path("ejemplo/{id}")
    public Response getEjemplo(@PathParam("id") String id) {
        return Response.status(Response.Status.NOT_FOUND).build();
    }
}
