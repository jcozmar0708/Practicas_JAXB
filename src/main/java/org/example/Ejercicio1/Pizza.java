package org.example.Ejercicio1;

import javax.xml.bind.annotation.XmlElement;

public class Pizza {
    private String nombre;
    private int precio;
    private String[] ingredientes;

    public Pizza() {
    }

    public Pizza(String nombre, int precio, String[] ingredientes) {
        this.nombre = nombre;
        this.precio = precio;
        this.ingredientes = ingredientes;
    }
    @XmlElement(name = "nombre")
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    @XmlElement(name = "precio")
    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    //@XmlElementWrapper (name = "ingredientes")
    @XmlElement (name = "ingrediente")
    public String[] getIngredientes() {
        return this.ingredientes;
    }

    public void setIngredientes(String[] ingredientes) {
        this.ingredientes = ingredientes;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Pizza: ").append(nombre).append("\n");
        builder.append("Precio: ").append(precio).append("\n");
        for (String ingrediente : ingredientes) {
            builder.append("Ingrediente: ").append(ingrediente).append(", ");
        }
        if (builder.length() > 0) {
            builder.setLength(builder.length() - 2);
        }

        builder.append("\n");
        return builder.toString();
    }
}
