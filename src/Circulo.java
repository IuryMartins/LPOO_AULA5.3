public class Circulo implements FormaGeometrica {
    double area, raio, perimetro;

    public Circulo() {
    }

    public Circulo(double raio) {
        setRaio(raio);
    }

    public double getArea() {
        return this.area;
    }

    public double getPerimetro(){
        return this.perimetro;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public String toString() {
        return "Circulo\n" +
                "Raio: " + getRaio() + "\n" +
                "Area: " + getArea() + "\n" +
                "Perimetro: " + getPerimetro() + "\n";
    }

    @Override
    public void calcularArea() {
      this.area = Math.PI * Math.pow(raio, 2);
    }

    @Override
    public void calcularPerimetro() {
        this.perimetro = 2*(Math.PI) * this.raio;
    }
}
