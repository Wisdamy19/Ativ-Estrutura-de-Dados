package AtivEstruturaDeDados;


import java.util.Locale;

public class Exerc04 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        double paisA = 80.000;
        double paisB = 200.000;

        double count = anosPrecisos(paisA, paisB);
        System.out.println(count);
        }
        public static double anosPrecisos(double paisA, double paisB){
        double count = 2400;
        for (int i = 0; paisA < paisB; i++){
            paisA *= 1.03;
            paisB *= 1.015;
            count++;
        }
        return count;
        }
    }

