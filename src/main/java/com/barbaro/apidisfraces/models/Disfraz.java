
package com.barbaro.apidisfraces.models;

import java.util.List;

public class Disfraz {
    
    private String id;
    private List<Articulo> cabeza;
    private List<Articulo> cara;
    private List<Articulo> torso;
    private List<Articulo> brazos;
    private List<Articulo> pies;
    private List<Articulo> piernas;
    private List<Articulo> accesorios;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Articulo> getCabeza() {
        return cabeza;
    }

    public void setCabeza(List<Articulo> cabeza) {
        this.cabeza = cabeza;
    }

    public List<Articulo> getCara() {
        return cara;
    }

    public void setCara(List<Articulo> cara) {
        this.cara = cara;
    }

    public List<Articulo> getTorso() {
        return torso;
    }

    public void setTorso(List<Articulo> torso) {
        this.torso = torso;
    }

    public List<Articulo> getBrazos() {
        return brazos;
    }

    public void setBrazos(List<Articulo> brazos) {
        this.brazos = brazos;
    }

    public List<Articulo> getPies() {
        return pies;
    }

    public void setPies(List<Articulo> pies) {
        this.pies = pies;
    }

    public List<Articulo> getPiernas() {
        return piernas;
    }

    public void setPiernas(List<Articulo> piernas) {
        this.piernas = piernas;
    }

    public List<Articulo> getAccesorios() {
        return accesorios;
    }

    public void setAccesorios(List<Articulo> accesorios) {
        this.accesorios = accesorios;
    }
    
}
