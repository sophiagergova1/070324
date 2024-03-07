// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        kreis k1 = new kreis(2);   //wie bei Scanner
        kreis k2 = new kreis(5);

        k1.info();
        k2.info();

        System.out.println(k1);
        System.out.println(k2);
// NEXT

      rechteck rechteck1 = new rechteck(1,2);

        System.out.println(rechteck1.umfang());
        System.out.println(rechteck1.flaeche());
        System.out.println(rechteck1.diagonale());
rechteck1.info();

    }
}