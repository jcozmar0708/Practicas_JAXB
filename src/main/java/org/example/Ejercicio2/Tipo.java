package org.example.Ejercicio2;

import javax.xml.bind.annotation.XmlAttribute;

public class Tipo {
    private String definicion;

    public Tipo() {
    }

    public Tipo(String definicion) {
        this.definicion = definicion;
    }

    @XmlAttribute(name = "definicion")
    public String getDefinicion() {
        return definicion;
    }

    public void setDefinicion(String definicion) {
        this.definicion = definicion;
    }

    @Override
    public String toString() {
        return this.definicion;
    }
}
