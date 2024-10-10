package org.example.Ejercicio2;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

public class Paso {
    private int orden;
    private String paso;

    public Paso() {
    }

    public Paso(int orden, String paso) {
        this.orden = orden;
        this.paso = paso;
    }

    @XmlAttribute(name = "orden")
    public int getOrden() {
        return orden;
    }

    public void setOrden(int orden) {
        this.orden = orden;
    }

    @XmlElement(name = "paso")
    public String getPaso() {
        return paso;
    }

    public void setPaso(String paso) {
        this.paso = paso;
    }
}
