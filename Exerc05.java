package AtivEstruturaDeDados;


import java.util.Scanner;

public class Exerc05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Telefonou para a vítima?");
        String pergunta1 = scan.nextLine().toLowerCase();
        System.out.println("Esteve no local do crime?");
        String pergunta2 = scan.nextLine().toLowerCase();
        System.out.println("Mora perto da vítima?");
        String pergunta3 = scan.nextLine().toLowerCase();
        System.out.println("Devia dinheiro para a vítima?");
        String pergunta4 = scan.nextLine().toLowerCase();
        System.out.println("Já trabalhou para a vítima?");
        String pergunta5 = scan.nextLine().toLowerCase();

        if (pergunta1.equals("sim") && pergunta2.equals("sim") && pergunta3.equals("sim") && pergunta4.equals("sim") && pergunta5.equals("sim")) {
            System.out.println("Assassino.");
        } else if (pergunta1.equals("nao") && pergunta2.equals("nao") && pergunta3.equals("nao") && pergunta4.equals("nao") && pergunta5.equals("nao")) {
            System.out.println("Inocente.");
        } else {
            System.out.println("Suspeito.");
        }
    }
}
