package org.acme;

/**
 * @author Franky Villadiego
 */
public class Main {

    public static void main(String[] args) {
        DotMatrixPrinter dmp = new DotMatrixPrinter();
        Office office = new Office(dmp);
        office.receiveMessage("Hola mundo");
        office.print();
    }
}
