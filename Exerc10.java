package AtivEstruturaDeDados;

import java.util.Arrays;

public class Exerc10 {
    public static void main(String[] args) {
        int[] numbers = {123, 245, 391};
        for (int i = 0; i < numbers.length; i++){
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(numbers[i]);
            stringBuilder.reverse();
            String reversedString = stringBuilder.toString();
            System.out.println(reversedString);
        }
    }
}
