package exec4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a temperatura atual: ");
        double temperatura = scanner.nextDouble();

        if (temperatura > 35) {
            System.out.println("Está muito quente! É recomendado usar protetor solar.");
        } else {
            System.out.println("A temperatura está abaixo de 35 graus. O uso de protetor solar pode não ser necessário, mas sempre é uma boa ideia proteger a pele.");
        }
    }
}