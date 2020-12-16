package by.epam.careers.part4;

/**Из заданного числа вычли сумму его цифр. Из результата вновь вычли
 * сумму его цифр и т. д. Сколько таких действий надо произвести,
 * чтобы получился нуль? Для решения задачи использовать декомпозицию.*/
public class Task17 {
    public static void main(String[] args) {
        int x = 105;
        System.out.println("Над числом " + x + " надо произвести "
                + numberOfOperations(x) + " действий.");
    }
    public static int numberOfOperations(int x) {
        int sum = 0;
        int i = x;
        while (i != 0) {
            sum = sum + i % 10;
            i = i / 10;
        }
        int count = 0;
        while (x > 0) {
            x = x - sum;
            count++;
        }
        return count;
    }
}
