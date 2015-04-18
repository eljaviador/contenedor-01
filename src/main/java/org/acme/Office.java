package org.acme;

/**
 * @author Franky Villadiego
 */
public class Office {
    private Printer printer;
    private String message;

    public Office(Printer p){
        this.printer = p;
    }

    public void receiveMessage(String msg){
        this.message = msg;
    }

    public void print(){
        printer.print(message);
    }
}
