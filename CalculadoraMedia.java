import java.util.Scanner;

class CalculadoraMediaJava {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a primeira nota.");
        int nota1 = scanner.nextInt();
        System.out.println("Digite a segunda nota.");
        int nota2 = scanner.nextInt();
        System.out.println("Digite a terceira nota.");
        int nota3 = scanner.nextInt();
        System.out.println("Digite a quarta nota.");
        int nota4 = scanner.nextInt();
        int res = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.println((res <= 10) ? "Sua média é de " + res + "." : "Algo está errado! A média está maior que o limite máximo de 10. As notas, somadas, não podem ultrapassar os 40 pontos.");

    }
}