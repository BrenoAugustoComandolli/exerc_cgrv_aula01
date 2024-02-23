package exec2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número de termos da sequência de Fibonacci que deseja gerar: ");
        int n = scanner.nextInt();
        long[] fibonacci = new long[n];

        for (int i = 0; i < n; i++) {
            if (i < 2) {
                fibonacci[i] = i;
            } else {
                fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
            }
            System.out.println((i + 1) + "º termo: " + fibonacci[i]);
        }
    }
}
