package org.example.Ejercicio3;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.util.ArrayList;

public class Ejercicio3 {
    public static void main(String[] args) {

        ArrayList<Deposito> lista = new ArrayList<>();
        lista.add(new Deposito(10.4f,20.5f,"1"));
        lista.add(new Deposito(11f,15.5f,"2"));
        lista.add(new Deposito(9.6f,21.2f,"3"));

        ListaDeposito listaDeposito = new ListaDeposito(lista);

        try {
            JAXBContext context = JAXBContext.newInstance(ListaDeposito.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.marshal(listaDeposito, System.out);
            marshaller.marshal(listaDeposito, new File("depositos.xml"));

        } catch (JAXBException e) {
            System.out.println(e.getMessage());
        }
    }
}
