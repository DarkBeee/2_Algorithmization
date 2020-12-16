package by.epam.careers.part3;

/**Даны дроби p1/q1, p2/q2,...,pn/qn(p1, q1 - натуральные). Составить программу, которая
 * приводит эти дроби к общему знаменателю и упорядочивает их в порядке возрастания.*/
public class Task8 {
    public static void main(String[] args) {
        Fraction [] arr = {new Fraction(1, 2), new Fraction(5, 11),
                new Fraction(7, 13), new Fraction(17, 13),
                new Fraction(3, 83), new Fraction(18, 45),
                new Fraction(5, 50), new Fraction(15, 37)};
        int commonMultiple = searchLeastCommonMultiple(arr);
        reductionToCommonMultiple(arr, commonMultiple);
        sortArray(arr);

        for (Fraction element : arr) {
            System.out.println(element);
        }
    }
    public static int searchLeastCommonMultiple(Fraction[] arr) {
        boolean flag = true;
        int commonMultiple = 0;
        while (flag) {
            flag = false;
            commonMultiple++;
            for (Fraction x : arr) {
                if (commonMultiple % x.denom != 0) {
                    flag = true;
                    break;
                }
            }
        }
        return commonMultiple;
    }
    public  static void reductionToCommonMultiple(Fraction[] arr, int commonMultiple) {
        for (Fraction x : arr) {
            x.numer = x.numer * (commonMultiple / x.denom);
            x.denom = x.denom * (commonMultiple / x.denom);
        }
    }
    private static void sortArray(Fraction[] arr) {
        for (int i = arr.length - 1; i > 0 ; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j].numer > arr[j + 1].numer) {
                    Fraction x = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = x;
                }
            }
        }
    }
    public static class Fraction {
        int numer;
        int denom;
        Fraction(int numer, int denom) {
            this.numer = numer;
            this.denom = denom;
        }

        @Override
        public String toString() {
            return String.format("%d/%d", numer, denom);
        }
    }

}
