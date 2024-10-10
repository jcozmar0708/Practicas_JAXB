package org.example.Ejercicio3;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;

@XmlRootElement
public class ListaDeposito {
    private ArrayList<Deposito> deposito;

    public ListaDeposito() {
    }

    public ListaDeposito(ArrayList<Deposito> deposito) {
        this.deposito = deposito;
    }

    public ArrayList<Deposito> getDeposito() {
        return deposito;
    }

    public void setDeposito(ArrayList<Deposito> deposito) {
        this.deposito = deposito;
    }
}
