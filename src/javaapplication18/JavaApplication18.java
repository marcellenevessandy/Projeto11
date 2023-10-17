package javaapplication18;

import java.util.Scanner;

public class JavaApplication18 {

    public static void main(String[] args) {
        double p, c, total, poupanca;

        Scanner ler = new Scanner(System.in);

        System.out.println("Informe a quantidade de pães: ");
        p = ler.nextDouble();
        System.out.println("Informe a quantidade de cupcakes: ");
        c = ler.nextDouble();

        total =  ((p * 1.5) + (c * 4.5));
        poupanca = total * (20.0/100.0);
        
        System.out.println("O total vendido R$ " + total);
        System.out.println("Foram guardados 20% deste total R$ " + poupanca);
                

    }

}
