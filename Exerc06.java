package AtivEstruturaDeDados;

import java.util.Locale;
import java.util.Arrays;
import java.util.ArrayList;

public class Exerc06 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 4, 5, 7, 9, 10, 12));
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();


        for (Integer number : list1) {
            if (number % 2 == 0) {
                list2.add(number);
            }
            else if (number % 3 == 0 || number % 5 == 0 || number % 7 == 0 || number % 9 == 0 ){
                list3.add(number);
            }
            else System.out.println();
        }
            System.out.println(list2);
            System.out.println(list3);
        }
    }
