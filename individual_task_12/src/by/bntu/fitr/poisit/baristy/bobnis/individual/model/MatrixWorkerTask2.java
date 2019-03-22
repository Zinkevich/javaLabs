package by.bntu.fitr.poisit.baristy.bobnis.individual.model;

public class MatrixWorkerTask2 {

    private static int sumInRow(Matrix matrix, int row){

        int sum = 0;

        for (int column = 0; column < matrix.getVector(row).length; column++) {
            sum += Math.abs(matrix.getElement(row, column));
        }

        return sum;
    }

    private static void newMatrix(Matrix matrix){

        int sum = sumInRow(matrix, 0);
        int s[];

        for (int i = 0; i < matrix.getLength() - 1; i++){
            if (sumInRow(matrix, i) > sumInRow(matrix, i+1)){


            }
        }
    }

}
