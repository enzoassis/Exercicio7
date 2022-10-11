import java.util.Scanner;

public class exercicio7 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        double lado, area;

        System.out.println("Digite o tamanho do lado do quadrado: ");
        lado = scan.nextDouble();

        area = lado * lado;

        System.out.println("O dobro da área do quadrado é: " + (area * 2));
        scan.close();
    }
}
