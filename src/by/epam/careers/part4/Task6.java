package by.epam.careers.part4;

/**Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми.*/
public class Task6 {
    public static void main(String[] args) {
        int[] arr = {105, 191, 199};
        if (primeNumber(arr) == 3) {
            System.out.println("Все числа взаимно простые");
        } else {
            System.out.println("Не все числа простые");
        }
    }
    public static int primeNumber(int[] arr) {
        int count = 0;
        for (int i : arr) {
            if(i % 2 != 0 && i % 3 != 0 && i % 5 != 0 && i % 7 != 0 && i != 1
                || i == 2 || i == 3 || i == 5 || i == 7) {
                count++;
                }
        }
        return count;
    }
}
