public class Retangulo extends Quadrilateros {
    double base, altura;

    public Retangulo(double base, double altura) {
        setLado1(base);
        setLado3(base);
        setLado2(altura);
        setLado4(altura);
    }

    @Override
    public String toString() {
        return "Retangulo\n" +
                "Base: " + getLado1() + "\n" +
                "Altura: " + getLado2() + "\n" +
                "Area: " + getArea() + "\n" +
                "Perimetro: " + getPerimetro() + "\n";
    }

    public void calcularArea() {
        this.area = getLado1() * getLado2();
    }
}
