package by.epam.careers.part4;

import static java.lang.Math.*;

/**Даны числа X, Y, Z, T - длины сторон четырёхугольника. Написать метод(методы)
 * вычисления его площади, если угол между сторонами длинной X и Y - прямой.*/
public class Task9 {
    public static void main(String[] args) {
        double x = 5.0;
        double y = 6.0;
        double z = 4.0;
        double t = 7.0;
        System.out.println("Площадь четырёхугольника = " + sumThirdNumber(x, y, z, t));
    }
    public static double sumThirdNumber(double x, double y, double z, double t) {
        double areaXYC = (x * y) / 2;
        double hypot = sqrt(pow(x, 2) + pow(y, 2));
        double p = (z + t + hypot) / 2;
        double areaZTC = sqrt(p * (p - z) * (p - t) * (p - hypot));
        return areaXYC + areaZTC;
    }
}
