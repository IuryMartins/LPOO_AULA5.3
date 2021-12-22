public class Quadrado extends Quadrilateros {
    public Quadrado(double lado) {
        setLado1(lado);
        setLado2(lado);
        setLado3(lado);
        setLado4(lado);
    }

    @Override
    public String toString() {
        return "Quadrado\n" +
                "lado: " + getLado1() + "\n" +
                "área: " + getArea() + "\n" +
                "perimetro: " + getPerimetro() + "\n";
    }

    @Override
    public void calcularArea() {
        this.area = Math.pow(getLado1(), 2);
    }
}
