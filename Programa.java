import java.util.Scanner;

public class Programa
{
    public static void main(String[] args) {
        System.out.println("1. Quadrado");
        System.out.println("2. Retângulo");
        System.out.println("3. Círculo");
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Qual área voce deseja calcular: ");
        int r = teclado.nextInt();
        
        if (r == 1){
            System.out.println("Qual o valor dos lados: ");
            int lado = teclado.nextInt();
            System.out.println(CalculadoraAreas.calcularArea(lado));
        }else if(r == 2){
            System.out.println("Qual o valor da base: ");
            int base = teclado.nextInt();
            System.out.println("Qual o valor da altura: ");
            int altura = teclado.nextInt();
            System.out.println(CalculadoraAreas.calcularArea(base, altura));
        }else if(r == 3){
            System.out.println("Qual o valor do raio: ");
            double raio = teclado.nextDouble();
            System.out.println(CalculadoraAreas.calcularArea(raio));
        }else{
            System.out.println("Opção Indisponível");
        }
        teclado.close();
    }
}