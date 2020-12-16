package by.epam.careers.part4;

/**Написать метод(методы), определяющий, в каком из данных двух
 * чисел больше цифр.*/
public class Task11 {
    public static void main(String[] args) {
        int a = 4563210;
        int b = 12345678;
        if (lengthNumber(a) > lengthNumber(b)) {
            System.out.println("В числе " + a + " больше цифр, чем числе " + b);
        }
        else if (lengthNumber(a) < lengthNumber(b)) {
            System.out.println("В числе " + b + " больше цифр, чем числе " + a);
        }
        else {
            System.out.println("Числа равны");
        }
    }
    public static int lengthNumber(int x) {
        int count = 0;
        while (x % 10 != 0) {
            x = x / 10;
            count++;
        }
        return count;
    }
}
