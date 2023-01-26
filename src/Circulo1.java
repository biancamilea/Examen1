public class Circulo1 {
    private double r;

    public Circulo1() {
        this.r = 1;
    }

    public Circulo1(double r) {
        this.r = r;
    }

    public double calcularArea (){
        double area = (r * r) * 3.14;
        return area;
    }

    public double calcularLongitud (){
        double longitud = 2 * 3.14 * r;
        return longitud;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double calcularArea(double r){
        this.r = r;
        double area = (r * r) * 3.14;
        double longitud = 2 * 3.14 * r;
        return area + longitud;
    }

}
