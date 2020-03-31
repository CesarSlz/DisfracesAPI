
package com.barbaro.apidisfraces.util;

import com.barbaro.apidisfraces.models.Articulo;
import com.barbaro.apidisfraces.models.Disfraz;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import java.util.ArrayList;
import java.util.List;
import org.bson.Document;

public class DatabaseManager {
    
    public static void addDisfraz(Disfraz difraz) {
        //Document difrazDoc = new Document();
    }
    
    public static List<Disfraz> getDisfraces() {
        return null;
    }
    
    public static Disfraz getDisfrazById(String id) {
        return null;
    }
    
    public static void updateDisfraz(Disfraz disfraz) {
        
    }
    
    public static void deleteDisfraz(String id) {
        
    }
    
    public static List<Disfraz> getDisfracesByCategoria(String categoria) {
        return null;
    }
    
    public static List<Articulo> getArticulos(){
         // Abrir una conexion entre mi aplicacion y MongoDB
        MongoClient client = MongoClients.create();
        
        // Obtener la base de datos tienda
        // Si no existe la crea
        MongoDatabase database = client.getDatabase("tienda");
        
        // Obtener coleccion especifica - articulo
        MongoCollection<Document> articulosCollection = database.getCollection("articulos");
        
        MongoCursor<Document> cursor = articulosCollection.find().iterator();
        
        List<Articulo> articulos = new ArrayList<>();
        
        while(cursor.hasNext()){
            Document doc = cursor.next();
            Articulo articulo = new Articulo();
            articulo.setId(doc.getObjectId("_id").toString());
            articulo.setNombre(doc.getString("nombre"));
            articulo.setDescripcion(doc.getString("descripcion"));
            articulo.setPrecio(doc.getDouble("precio").floatValue());
            articulo.setTalla(doc.getString("talla"));
            articulo.setFotoUrl(doc.getString("fotoUrl"));
            
            articulos.add(articulo);
        }
        return articulos;
    }
    
    public static void addArticulo(Articulo articulo){
        // Abrir una conexion entre mi aplicacion y MongoDB
        MongoClient client = MongoClients.create();
        
        // Obtener la base de datos tienda
        // Si no existe la crea
        MongoDatabase database = client.getDatabase("tienda");
        
        // Obtener coleccion especifica - articulo
        MongoCollection<Document> articulosCollection = database.getCollection("articulos");
        
        // Modear tus datos para que los entieda Mongo
        // De POJO a Document(BSON)
        Document document = new Document("nombre", articulo.getNombre())
                .append("descripcion", articulo.getDescripcion())
                .append("precio", articulo.getPrecio())
                .append("talla", articulo.getTalla())
                .append("material", articulo.getMaterial())
                .append("fotoUrl", articulo.getFotoUrl());
        
        // Insertar en la coleccion articulos
        articulosCollection.insertOne(document);
        
        // Cerrar conexion del cliente
        client.close();
    }
    
    public static void getArticuloByNombre(String nombre) {
        
    }
    
    public static List<Articulo> getArticuloByTipo(Articulo.TipoArticulo tipo) {
        return null;
    }
    
}
