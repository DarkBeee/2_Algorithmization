package by.epam.careers.part4;

/**Два два простых числа называются "близнецами", если они отличаются друг от
 * друга на 2 (например, 41 и 43). Найти и напечатать все пары "близнецов"
 * из отрезка [n, 2n], где n - заданное натуральное число больше 2. Для
 * решения задачи использовать декомпозицию.*/
public class Task13 {
    public static void main(String[] args) {
        primeNumber(1000);
    }
    public static void primeNumber(int n) {
        for (int i = n; i < n * 2 - 2; i++) {
            boolean first = true;
            boolean second = true;
            int number1 = i;
            int number2 = i + 2;
            for(int j = 2; j * j <= number1; j++) {
                if (number1 % j == 0) {
                    first = false;
                    break;
                }
            }
            for (int j = 2; j * j <= number2; j++) {
                if (number2 % j == 0) {
                    second = false;
                    break;
                }
            }
            if (first && second) {
                System.out.println(number1 + " " + number2);
            }
        }
    }
}

