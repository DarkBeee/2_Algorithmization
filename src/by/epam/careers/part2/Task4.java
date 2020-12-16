package by.epam.careers.part2;


/**Сформировать квадратную матрицу порядка n по заданному образцу(n - чётное):*/
public class Task4 {
    public static void main(String[] args) {
        int[][] arr = new int[20][20];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i % 2 == 0) {
                    arr[i][j] = arr.length - j;
                } else {
                    arr[i][j] = j + 1;
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
