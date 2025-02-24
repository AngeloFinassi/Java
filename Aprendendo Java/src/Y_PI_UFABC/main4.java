import java.util.Scanner;

public class Main {

    public static double areaTriangulo(double base, double altura) {
        return (base * altura) / 2.0;
    }

    public static double areaCirculo(double raio, double PI) {
        return PI * Math.pow(raio, 2);
    }

    public static double areaTrapezio(double baseMaior, double baseMenor, double altura) {
        return ((baseMaior + baseMenor) * altura) / 2.0;
    }

    public static double areaQuadrado(double lado) {
        return lado * lado;
    }

    public static double areaRetangulo(double base, double altura) {
        return base * altura;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();
        double PI = 3.14159;
        
        double areaTriangulo = areaTriangulo(A, C);
        double areaCirculo = areaCirculo(C, PI);
        double areaTrapezio = areaTrapezio(A, B, C);
        double areaQuadrado = areaQuadrado(B);
        double areaRetangulo = areaRetangulo(A, B);
        
        System.out.printf("TRIANGULO: %.3f\n", areaTriangulo);
        System.out.printf("CIRCULO: %.3f\n", areaCirculo);
        System.out.printf("TRAPEZIO: %.3f\n", areaTrapezio);
        System.out.printf("QUADRADO: %.3f\n", areaQuadrado);
        System.out.printf("RETANGULO: %.3f\n", areaRetangulo);
        
        sc.close();
    }
}