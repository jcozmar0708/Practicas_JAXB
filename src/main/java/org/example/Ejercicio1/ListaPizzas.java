package org.example.Ejercicio1;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;

@XmlRootElement(name = "pizzas")
public class ListaPizzas {
    private ArrayList<Pizza> pizzas = new ArrayList<>();

    public ListaPizzas() {
    }

    @XmlElement(name = "pizza")
    public ArrayList<Pizza> getPizzas() {
        return pizzas;
    }

    public void setPizzas(ArrayList<Pizza> pizzas) {
        this.pizzas = pizzas;
    }
}
