package org.example.Ejercicio1;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class Ejercicio1 {
    public static void main(String[] args) {
        try {
            JAXBContext context = JAXBContext.newInstance(ListaPizzas.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();

            File file = new File("pizzas.xml");

            ListaPizzas listaPizzas = (ListaPizzas) unmarshaller.unmarshal(file);

            for (Pizza pizza : listaPizzas.getPizzas()) {
                System.out.println(pizza);
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
