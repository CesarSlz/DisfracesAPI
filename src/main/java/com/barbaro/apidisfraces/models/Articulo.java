
package com.barbaro.apidisfraces.models;

public class Articulo {
    
    public enum TipoArticulo{
        CABEZA, CARA, TORSO, BRAZO, PIES, PIERNAS, ACCESORIOS
    }
    
    private String id;
    private String nombre;
    private String descripcion;
    private float precio;
    private String material;
    private String talla;
    private TipoArticulo tipo;
    private String fotoUrl;
    
    public Articulo(){
        
    }
    
    public String getId() {
        return id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public TipoArticulo getTipo() {
        return tipo;
    }

    public void setTipo(TipoArticulo tipo) {
        this.tipo = tipo;
    }

    public String getFotoUrl() {
        return fotoUrl;
    }

    public void setFotoUrl(String fotoUrl) {
        this.fotoUrl = fotoUrl;
    }

    @Override
    public String toString() {
        return "{\"id\": \"" + this.id + "\","
                + "\"nombre\": \"" + this.nombre + "\","
                + "\"descripcion\": \"" + this.descripcion + "\","
                + "\"precio\": \"" + this.precio + "\","
                + "\"material\": \"" + this.material + "\","
                + "\"talla\": \"" + this.talla + "\","
                + "\"tipo\": \"" + this.tipo + "\","
                + "\"foto\": \"" + this.fotoUrl + "\"}";
    }
    
    
}
