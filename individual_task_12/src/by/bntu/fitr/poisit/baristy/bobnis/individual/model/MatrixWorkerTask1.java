package by.bntu.fitr.poisit.baristy.bobnis.individual.model;

public class MatrixWorkerTask1 {

    private static boolean isUnevenRow(Matrix matrix, int row){

        boolean uneven = true;

            for (int column = 0; column < matrix.getVector(row).length; column++){
                if (matrix.getElement(row, column) % 2 == 0){
                    uneven = false;
                }
            }

        return uneven;
    }

    private static int sumInRow(Matrix matrix, int row){

        int sum = 0;

        for (int column = 0; column < matrix.getVector(row).length; column++) {
            sum += Math.abs(matrix.getElement(row, column));
        }

        return sum;
    }

    public  static int maxSumInUnevenRow(Matrix matrix){

        int maxcolumn = 0;
        int maxsum = 0;

        for (int i = 0; i < matrix.getLength(); i++){
            if (isUnevenRow(matrix, i)){
                if (maxsum < sumInRow(matrix, i)){
                    maxsum = sumInRow(matrix, i);
                    maxcolumn = i + 1;
                }


            }
        }

        return maxcolumn;
    }

    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4}, {5, 7, 9}, {2}};

        Matrix matrix = new Matrix(arr);

        System.out.println(maxSumInUnevenRow(matrix));

        System.out.println(isUnevenRow(matrix, 0));
    }
}
