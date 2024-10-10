package org.example.Ejercicio2;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class Ejercicio2 {
    public static void main(String[] args) {
        try {
            JAXBContext context = JAXBContext.newInstance(ListaRecetas.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();

            File file = new File("recetas.xml");

            ListaRecetas listaRecetas = (ListaRecetas) unmarshaller.unmarshal(file);

            for (Receta receta : listaRecetas.getRecetas()) {
                System.out.println(receta);
            }

        } catch (JAXBException e) {
            System.out.println(e.getMessage());
        }
    }
}
