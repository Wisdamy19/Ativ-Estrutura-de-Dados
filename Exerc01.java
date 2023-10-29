package AtivEstruturaDeDados;


public class Exerc01 {
    public static void main(String[] args) {
        int num = 8;
        int num2 = 4;
        int num3 = 2;
        if (num % num2 == 0 && num % num3 == 0 && num2 % num3 == 0 && num % num3 == 0){
            System.out.println("São múltiplos");
        }else System.out.println("Não são múltiplos.");
    }
}
