package AtivEstruturaDeDados;

import java.util.Locale;
import java.util.Scanner;

public class Exerc08 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.println("Quantos meses serão digitados? ");
        int q = scan.nextInt();

        double[] temps = new double[q];
        for (int i = 0; i < q; i++) {
            System.out.printf("Digite a temperatura média de %s:", getMesNome(i));
            temps[i] = scan.nextDouble();
        }
        double soma = 0;
        for (int i = 0; i < q; i++){
            soma += temps[i];
        }
        double media = 0;
        for (int i = 0; i < q; i++){
            media = soma / (temps.length);
        }
        System.out.println();
        System.out.printf("A média anual foi: %.1f\n", media);
        for (int i = 0; i < q; i++){
            if (temps[i] > media){
                System.out.println("Temperaturas maiores que a média anual: ");
                System.out.printf("%.1f - %s", temps[i], getMesNome(i));
            }
        }
    }
    public static String getMesNome(int mes){
        String[] meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
        return meses[mes];
    }
}

