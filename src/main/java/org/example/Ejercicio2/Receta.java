package org.example.Ejercicio2;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import java.util.ArrayList;

public class Receta {
    private Tipo tipo;
    private String dificultad;
    private String nombre;
    private ArrayList<Ingrediente> ingredientes;
    private String calorias;
    private ArrayList<Paso> pasos;
    private String tiempo;
    private String elaboracion;

    public Receta() {
    }

    public Receta(Tipo tipo, String dificultad, String nombre, ArrayList<Ingrediente> ingredientes, String calorias, ArrayList<Paso> pasos, String tiempo, String elaboracion) {
        this.tipo = tipo;
        this.dificultad = dificultad;
        this.nombre = nombre;
        this.ingredientes = ingredientes;
        this.calorias = calorias;
        this.pasos = pasos;
        this.tiempo = tiempo;
        this.elaboracion = elaboracion;
    }

    @XmlElement(name = "tipo")
    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    @XmlElement(name = "dificultad")
    public String getDificultad() {
        return dificultad;
    }

    public void setDificultad(String dificultad) {
        this.dificultad = dificultad;
    }

    @XmlElement(name = "nombre")
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @XmlElementWrapper(name = "ingredientes")
    @XmlElement(name = "ingrediente")
    public ArrayList<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(ArrayList<Ingrediente> ingredientes) {
        this.ingredientes = ingredientes;
    }

    @XmlElement(name = "calorias")
    public String getCalorias() {
        return calorias;
    }

    public void setCalorias(String calorias) {
        this.calorias = calorias;
    }

    @XmlElementWrapper(name = "pasos")
    @XmlElement(name = "paso")
    public ArrayList<Paso> getPasos() {
        return pasos;
    }

    public void setPasos(ArrayList<Paso> pasos) {
        this.pasos = pasos;
    }

    @XmlElement(name = "tiempo")
    public String getTiempo() {
        return tiempo;
    }

    public void setTiempo(String tiempo) {
        this.tiempo = tiempo;
    }

    @XmlElement(name = "elaboracion")
    public String getElaboracion() {
        return elaboracion;
    }

    public void setElaboracion(String elaboracion) {
        this.elaboracion = elaboracion;
    }

    @Override
    public String toString() {
        return "Receta{" +
                "tipo=" + tipo +
                ", dificultad='" + dificultad + '\'' +
                ", nombre='" + nombre + '\'' +
                ", ingredientes=" + ingredientes +
                ", calorias='" + calorias + '\'' +
                ", pasos=" + pasos +
                ", tiempo='" + tiempo + '\'' +
                ", elaboracion='" + elaboracion + '\'' +
                '}';
    }
}
