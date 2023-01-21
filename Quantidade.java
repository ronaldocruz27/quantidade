package quantidade;

import java.util.Scanner;

public class Quantidade {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int i = 0;
        int v1 = 0;
        int v2 = 0;
        int v3 = 0;
        int num;

        while (i <= 20) {
            System.out.println("Digite um número");
            num = ler.nextInt();

            if (num <= 100) {
                v1 = v1 + 1;
            } else if (num > 100 && num <= 200) {
                v2 = v2 + 1;
            } else {
                v3 = v3 + 1;

            }
            i++;

        }
        System.out.println("números que são até 100:" + v1);
        System.out.println("númroes que são de 101 a 200:" + v2);
        System.out.println("númroes que são acima de 200:" + v3);
    }

}
