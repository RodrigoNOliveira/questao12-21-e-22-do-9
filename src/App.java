import java.util.Scanner;

class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int nmr;

        System.out.println("Digite números: ");
        nmr = scanner.nextInt();
        int maior = nmr;
        int menor = nmr;
        while (nmr > 0) {

            if (nmr > maior) {
                maior = nmr;
            } else if (nmr < menor) {
                menor = nmr;
            }
            nmr = scanner.nextInt();
        }

        System.out.println("O maior número digitado é:" + maior);
        System.out.println("O menor número digitado é:" + menor);
    }
}