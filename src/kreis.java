public class kreis {
    public int radius;
    public kreis(int radius) {          //rechtsklick generate
        this.radius = radius;
    }
    public double getArea() {
        return Math.PI * radius * radius;
    }
    public void info()            //mit . info gibt man das aus
    {
        System.out.println("Radius: " + radius + ", Fläche: " + getArea());   //gibt die Infos über Kreis aus, eine Methode in der Klasse Kreis
    }
    @Override
    public String toString() {                  //generieren to string               //liefert Infos des Objekts als string
        return "Radius: " + radius + ", Fläche: " + getArea();
    }
}

