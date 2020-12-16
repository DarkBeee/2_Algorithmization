package by.epam.careers.part1;

import static java.lang.Math.*;

/**Задана последовательность N вещественных чисел.
 Вычислить сумму чисел, порядковые номера которых являются простыми числами.*/
public class Task6 {
    public static void main(String[] args) {
        double[] arr = new double[100];
        double sum = 0;
        for(int i = 0; i < arr.length; i++) {
            arr[i] = random() * 100 - 50;
            if(i % 2 != 0 && i % 3 != 0 && i % 5 != 0 && i % 7 != 0 && i != 1
                    || i == 2 || i == 3 || i == 5 || i == 7) {
                sum += arr[i];
            }
        }
        System.out.print("sum = " + sum);
    }
}
