package by.epam.careers.part4;

/**Написать программу, определяющую сумму n - значных чисел, содержащих
 * только нечётные цифры. Определить также, сколоко чётных цифр в
 * найденной сумме. Для решения задачи использовать декомпозицию.*/
public class Task16 {
    public static void main(String[] args) {
        sumOfOddNumbers(5);
    }
    public static void sumOfOddNumbers(int n) {
        int sum = 0;
        for (int i = (int) Math.pow(10, n - 1); i < Math.pow(10, n); i++) {
            boolean even = false;
            int number = i;
            while (number != 0) {
                int x = number % 10;
                number = number / 10;
                if (x % 2 == 0) {
                    even = true;
                    break;
                }
            }
            if (!even) {
                sum = sum + i;
            }
        }
        System.out.println("Сумма " + n + " - значных цифр содержащих только нечётные цифры: " + sum);
        System.out.println("Количество чётных цифр в это сумме: " + evenNumbers(sum));
    }
    public static int evenNumbers(int x) {
        int count = 0;
        while (x != 0) {
            int even = x % 10;
            if (even % 2 == 0) {
                count++;
            }
            x = x / 10;
        }
        return count;
    }
}
