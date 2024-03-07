public class rechteck {
    public int a;
    public int b;                              //generier constr für beide werte
    public rechteck(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public int umfang()  {           //methode erstellen für umfang
         return 2 * a + 2 * b;
    }
    public void info()            //mit . info gibt man das aus
    {
        System.out.println("Der Umfang ist " + umfang());
    }

    @Override              //Standardmäßig mit attriburen, es wird was anderes genrieren, muss aber nicht
    public String toString() {
        return "rechteck{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
public double flaeche(){
       int flaeche = a * b;
       return flaeche;
    }
public double diagonale () {
    return Math.sqrt(a *b );}
}