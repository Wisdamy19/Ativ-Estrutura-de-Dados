package AtivEstruturaDeDados;


import java.util.Locale;
import java.util.Scanner;

public class Exerc02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        //Partindo do principio que são 3 alunos e cada um tem 3 notas.
        int alunos = 3;

        double[] aluno1 = new double[alunos];
        double[] aluno2 = new double[alunos];
        double[] aluno3 = new double[alunos];

        //Escanear as notas
        for (int i = 0; i < alunos; i++){
            System.out.println("Notas do primeiro aluno: ");
            aluno1[i] = scan.nextDouble();
        }
        System.out.println("===========================");
        for (int i = 0; i < alunos; i++){
            System.out.println("Notas do segundo aluno: ");
            aluno2[i] = scan.nextDouble();
        }
        System.out.println("============================");
        for (int i =0; i < alunos; i++){
            System.out.println("Notas do terceiro aluno: ");
            aluno3[i] = scan.nextDouble();
        }
        double somaAln1 = 0;
        double somaAln2 = 0;
        double somaAln3 = 0;

        //Somando os vetores
        for (int i = 0; i < alunos; i++){
            somaAln1 += aluno1[i];
            somaAln2 += aluno2[i];
            somaAln3 += aluno3[i];
        }
        double media1 = 0;
        double media2 = 0;
        double media3 = 0;

        //Média dos vetores
        for (int i = 0; i < alunos; i++){
            media1 = somaAln1 / (aluno1.length);
            media2 = somaAln2 / (aluno2.length);
            media3 = somaAln3 / (aluno3.length);
        }

        //condição das médias maiores e menores
        if (media1 > media2 && media1 > media3){
            System.out.println("A média do aluno 01 foi a maior.");
        }
        else if (media2 > media1 && media2 > media3){
            System.out.println("A média do aluno 02 foi a maior.");
        }
        else if (media3 > media1 && media3 > media2){
            System.out.println("A média do aluno 03 foi a maior.");
        }
        else System.out.println("As médias foram iguais..");


        if (media1 < media2 && media1 < media3){
            System.out.println("A média do aluno 01 foi a menor.");
        }
        else if (media2 < media1 && media2 < media3){
            System.out.println("A média do aluno 02 foi a menor.");
        }
        else if (media3 < media1 && media3 < media2){
            System.out.println("A média do aluno 03 foi a menor.");
        }
        else System.out.println();

        double mediaGeral = 0;
        for (int i = 0; i < alunos; i++){
            mediaGeral = (somaAln1 + somaAln2 + somaAln3) / (aluno1.length + aluno2.length + aluno3.length);
        }
        System.out.printf("A média geral foi: %.2f", mediaGeral);
    }
}
