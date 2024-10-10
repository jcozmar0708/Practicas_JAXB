package org.example.Ejercicio2;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;

@XmlRootElement(name = "recetas")
public class ListaRecetas {
    ArrayList<Receta> recetas;

    public ListaRecetas() {}

    public ListaRecetas(ArrayList<Receta> recetas) {
        this.recetas = recetas;
    }

    @XmlElement(name = "receta")
    public ArrayList<Receta> getRecetas() {
        return recetas;
    }

    public void setRecetas(ArrayList<Receta> recetas) {
        this.recetas = recetas;
    }
}
