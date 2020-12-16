package by.epam.careers.part3;

/**Пусть даны две неубывающие последовательности действительных чисел
 * a1<=a2<=...<=an и b1<=b2<=...<=bm. Требуется указать те места, на которые
 * нужно вставлять элементы последовательности b1<=b2<=...<=bm в первую
 * последовательность так, что бы новая последовательность оставалась возрастающей.*/
public class Task7 {
    public static void main(String[] args) {
        int[] firstArr = new int[]{10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 101, 103};
        int[] secondArr = new int[]{10, 15, 25, 10, 45, 10, 70, 75, 95, 105, 110};
        for (int i = 0; i < secondArr.length; i++) {
            if(binarySearch(firstArr, secondArr[i]) != firstArr[i]) {
                System.out.println("Число " + secondArr[i] + " вставить на место №" +
                        binarySearch(firstArr, secondArr[i]) + " первого массива");
            }
        }
    }
    public static int binarySearch(int[] arr, int key) {
        int left = 0;
        int right = arr.length;
        while (left <= right) {
            int middle = (left + right) / 2;
            if (key == arr[middle]) {
                return middle;
            }
            if (key > arr[middle]) {
                left = middle + 1;
                if (left == arr.length) {
                    left--;
                    break;
                }
            }
            if (key < arr[middle]) {
                right = middle - 1;
            }
        }
        return left;
    }
}
