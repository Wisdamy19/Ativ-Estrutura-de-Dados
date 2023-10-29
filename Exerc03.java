package AtivEstruturaDeDados;


public class Exerc03 {
    public static void main(String[] args) {
        double arquivoMB = 1000.000;
        double arquivoMbps = 5.0;
        double dowloadTime = arquivoMB * 8 / arquivoMbps;
        double dowloadMinutos = dowloadTime / 60;
        System.out.printf("A velocidade de dowload é: %.2f minutos", dowloadMinutos);
    }
}
