package by.epam.careers.part4;

/**Найти все натуральные n-значные числа, цифры в которых образуют
 * строго возрастающую последовательность (например, 1234, 5789).
 * Для решения задачи использовать декомпозицию.*/
public class Task15 {
    public static void main(String[] args) {
        increasingSequence(7);
    }
    public static void increasingSequence(int n){
        System.out.println(n + "-значные числа, цифры в которых " +
                "образуют возрастающую последовательность:");
        for (int i = (int) Math.pow(10, n -1); i < Math.pow(10, n); i++) {
            int first = 10;
            int second = 11;
            int x = i;
            while (x > 0 && first < second) {
                second = first;
                first = x % 10;
                x = x / 10;
            }
            if (x == 0 && first < second) {
                System.out.println(i);
            }
        }
    }
}
