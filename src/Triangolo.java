public class Triangolo extends Forma {
    public Triangolo(int base, int altezza) {
        super(base, altezza);
    }

    public void calcolaArea() {
        int areaT = (base * altezza) / 2;
        System.out.println("L'area del triangolo è: " + areaT);
    }
}
