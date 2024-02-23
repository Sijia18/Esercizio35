public class Rettangolo extends Forma {
    public Rettangolo(int base, int altezza) {
        super(base, altezza);
    }

    @Override
    public void calcolaArea() {
        int area = base * altezza;
        System.out.println("L'area del rettangolo è: " + area);
    }
}
