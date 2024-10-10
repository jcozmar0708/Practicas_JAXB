package org.example.Ejercicio2;

import javax.xml.bind.annotation.XmlAttribute;

public class Ingrediente {
    private String nombre;
    private String cantidad;

    public Ingrediente() {
    }

    public Ingrediente(String nombre, String cantidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    @XmlAttribute(name = "nombre")
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @XmlAttribute(name = "cantidad")
    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Ingrediente{" +
                "nombre='" + nombre + '\'' +
                ", cantidad='" + cantidad + '\'' +
                '}';
    }
}
