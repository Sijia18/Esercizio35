/*Scrivere un programma che contenga una classe astratta chiamata Forma ed un 
metodo astratto chiamato calcolaArea(). Crea poi due sottoclassi Rettangolo e 
Triangolo che estendono Forma ed implementano il metodo per il calcolo dell'area 
in maniera specifica.*/

public class Main {

    public static void main(String[] args) {
        Rettangolo rettangolo = new Rettangolo(8, 5);
        Triangolo triangolo = new Triangolo(10, 5);
        rettangolo.calcolaArea();
        triangolo.calcolaArea();
    }
}