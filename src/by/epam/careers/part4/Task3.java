package by.epam.careers.part4;

import static java.lang.Math.*;

/**Вычислить площадь правильного шестиугольника со стороной a,
 * используя метод вычисления площади треугольника.*/
public class Task3 {
    public static void main(String[] args) {
        System.out.println(areaHexagon(5));
    }
    public static double areaHexagon(int a) {
        return 6 * ((pow(a, 2) * sqrt(3)) / 4);
    }
}
