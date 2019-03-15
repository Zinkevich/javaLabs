public class Task4 {

    public static void changingIndexOfElements(int[][] array) {

        int l = array[0].length;

        for (int n = 0; n < l; n++)
        {
            int row = 0, col = 0;
            int max = 0;

            for (int i = 0; i < l; i++){
                for (int j = 0; j < l; j++)
                {
                    if (i != j || i > n) {
                        if (array[i][j] > max) {
                            max = array[i][j];
                            row = i;
                            col = j;
                        }
                    }
                }
                int temp = array[n][n];
                array[n][n] = array[row][col];
                array[row][col] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[][] array = {{1, 2, 3, 4, 5 },
                {6,  7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25}
        };
        Task4.changingIndexOfElements(array);
        for(int i = 0 ; i < array[0].length; i++){
            for(int j = 0 ; j < array[0].length; j++){
                System.out.print(array[i][j] + "   ");
            }
            System.out.println("\n");

        }
    }
}
