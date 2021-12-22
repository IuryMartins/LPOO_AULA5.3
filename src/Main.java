import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        int numForma = 0, forma = 0;
        System.out.println("Quantas formas deseja criar?");
        Scanner in = new Scanner(System.in);
        numForma = in.nextInt();
        FormaGeometrica vetor[] = new FormaGeometrica[numForma];
        for (int i = 0; i < numForma; i++) {
            System.out.println("Qual forma deseja criar?");
            System.out.println("1- Quadrado");
            System.out.println("2- Retângulo");
            System.out.println("3- Círculo");
            forma = in.nextInt();
            switch (forma) {
                case 1:
                    System.out.println("Informe o comprimento do lado: ");
                   double lado = in.nextDouble();
                    Quadrado quadrado = new Quadrado(lado);
                    quadrado.calcularArea();
                    quadrado.calcularPerimetro();
                    vetor[i] = quadrado;
                    break;
                case 2:
                    System.out.println("Informe a base do retângulo: ");
                    double base = in.nextDouble();
                    System.out.println("Informe a altura do retângulo: ");
                    double altura = in.nextDouble();
                    Retangulo retangulo = new Retangulo(base,altura);
                    retangulo.calcularArea();
                    retangulo.calcularPerimetro();
                    vetor[i] = retangulo;
                    break;
                case 3:
                    System.out.println("Informe o raio do círculo: ");
                    Circulo circulo = new Circulo();
                    circulo.setRaio(in.nextDouble());
                    circulo.calcularArea();
                    circulo.calcularPerimetro();
                    vetor[i] = circulo;
                    break;

                default:
                    System.out.println("Opção invalida");
                    break;
            }

            }
        for (int i = 0; i < numForma; i++) {
            System.out.println(vetor[i]);

        }

        }
    }