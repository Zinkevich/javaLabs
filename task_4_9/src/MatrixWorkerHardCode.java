

public class MatrixWorkerHardCode {

    public static boolean isSymmetric(Matrix matrix) {

        boolean symmetric = true;
        int row = matrix.getLength();
        int column = matrix.getLength();

        if (getException(matrix)) {

            changeLocalMin(matrix);

            for (int i = 0; i < row; i++) {
                for (int j = 0; j < column; j++) {
                    if (matrix.getElement(i,j) != matrix.getElement(j,i)) {
                        symmetric = false;
                    }
                }
            }
        } else {
            symmetric = false;
        }
        return symmetric;
    }


    private static boolean isLocalMinInCentre(Matrix matrix, int row, int column) {
        boolean value = false;

        if ((matrix.getElement(row, column) < matrix.getElement(row + 1, column + 1)) && (matrix.getElement(row, column) < matrix.getElement(row - 1, column - 1)) &&
                (matrix.getElement(row, column) < matrix.getElement(row - 1, column + 1)) && (matrix.getElement(row, column) < matrix.getElement(row + 1, column - 1)) &&
                (matrix.getElement(row, column) < matrix.getElement(row - 1, column)) && (matrix.getElement(row, column) < matrix.getElement(row, column - 1)) &&
                (matrix.getElement(row, column) < matrix.getElement(row + 1, column)) && (matrix.getElement(row, column) < matrix.getElement(row, column + 1))) {
            value = true;
        }
        return value;
    }

    //think about it
    private static boolean isLocalMinInAngle00(Matrix matrix, int row, int column) {
        boolean value = false;

        if ((matrix.getElement(row, column) < matrix.getElement(row + 1, column + 1)) && (matrix.getElement(row, column) < matrix.getElement(row + 1, column)) &&
                (matrix.getElement(row, column) < matrix.getElement(row, column + 1))) {
            value = true;
        }
        return value;
    }

    private static boolean isLocalMinInAngleNN(Matrix matrix, int row, int column) {
        boolean value = false;

        if ((matrix.getElement(row, column) < matrix.getElement(row - 1, column - 1)) && (matrix.getElement(row, column) < matrix.getElement(row - 1, column)) &&
                (matrix.getElement(row, column) < matrix.getElement(row, column - 1))) {
            value = true;
        }
        return value;
    }

    private static boolean isLocalMinInAngleN0(Matrix matrix, int row, int column) {
        boolean value = false;

        if ((matrix.getElement(row, column) < matrix.getElement(row - 1, column + 1)) && (matrix.getElement(row, column) < matrix.getElement(row - 1, column)) &&
                (matrix.getElement(row, column) < matrix.getElement(row, column + 1))) {
            value = true;
        }
        return value;
    }

    private static boolean isLocalMinInAngle0N(Matrix matrix, int row, int column) {
        boolean value = false;

        if ((matrix.getElement(row, column) < matrix.getElement(row + 1,column - 1)) && (matrix.getElement(row, column) < matrix.getElement(row + 1, column)) &&
                (matrix.getElement(row, column) < matrix.getElement(row,column - 1))) {
            value = true;
        }
        return value;
    }

    private static boolean isLocalMinInLeftEdge(Matrix matrix, int row, int column) {
        boolean value = false;

        if ((matrix.getElement(row, column) < matrix.getElement(row + 1, column + 1)) && (matrix.getElement(row, column) < matrix.getElement(row - 1, column + 1)) &&
                (matrix.getElement(row, column) < matrix.getElement(row - 1, column)) && (matrix.getElement(row, column) < matrix.getElement(row + 1, column)) &&
                (matrix.getElement(row, column) < matrix.getElement(row,column + 1))) {
            value = true;
        }
        return value;
    }

    private static boolean isLocalMinInRightEdge(Matrix matrix, int row, int column) {
        boolean value = false;

        if ((matrix.getElement(row, column) < matrix.getElement(row - 1, column - 1)) && (matrix.getElement(row, column) < matrix.getElement(row + 1, column - 1)) &&
                (matrix.getElement(row, column) < matrix.getElement(row - 1, column)) && (matrix.getElement(row, column) < matrix.getElement(row, column - 1)) &&
                (matrix.getElement(row, column) < matrix.getElement(row + 1, column))) {
            value = true;
        }
        return value;
    }

    private static boolean isLocalMinInUpEdge(Matrix matrix, int row, int column) {
        boolean value = false;

        if ((matrix.getElement(row, column) < matrix.getElement(row, column - 1)) && (matrix.getElement(row, column) < matrix.getElement(row, column + 1)) &&
                (matrix.getElement(row, column) < matrix.getElement(row + 1, column)) && (matrix.getElement(row, column) < matrix.getElement(row + 1, column - 1)) &&
                (matrix.getElement(row, column) < matrix.getElement(row + 1, column + 1))) {
            value = true;
        }
        return value;
    }

    private static boolean isLocalMinInDownEdge(Matrix matrix, int row, int column) {
        boolean value = false;

        if ((matrix.getElement(row, column) < matrix.getElement(row, column + 1)) && (matrix.getElement(row, column) < matrix.getElement(row, column - 1)) &&
                (matrix.getElement(row, column) < matrix.getElement(row - 1, column)) && (matrix.getElement(row, column) < matrix.getElement(row - 1, column - 1)) &&
                (matrix.getElement(row, column) < matrix.getElement(row - 1, column + 1))) {
            value = true;
        }
        return value;
    }

    private static void changeLocalMin(Matrix matrix) {

        int row = matrix.getLength() - 1;

        {
            if (isLocalMinInAngle00(matrix, 0, 0)) {
                matrix.setElement(0, 0, 0);
            }

            if (isLocalMinInAngleNN(matrix, row, row)) {
                matrix.setElement(row, row, 0);
            }

            if (isLocalMinInAngleN0(matrix, row, 0)) {
                matrix.setElement(row, 0, 0 );
            }

            if (isLocalMinInAngle0N(matrix, 0, row)) {
                matrix.setElement(0, row, 0);
            }

            for (int i = 1; i < row; i++) {
                if (isLocalMinInLeftEdge(matrix, i, 0)) {
                    matrix.setElement(i, 0, 0);
                }
            }

            for (int i = 1; i < row; i++) {
                if (isLocalMinInRightEdge(matrix, i, row)) {
                    matrix.setElement(i, row, 0);
                }
            }

            for (int i = 1; i < row; i++) {
                if (isLocalMinInUpEdge(matrix, 0, i)) {
                    matrix.setElement(0, i, 0);
                }
            }

            for (int i = 1; i < row; i++) {
                if (isLocalMinInDownEdge(matrix, row, i)) {
                    matrix.setElement(row, i, 0);
                }
            }

            for (int i = 1; i < row; i++) {
                for (int j = 1; j < row; j++) {
                    if (isLocalMinInCentre(matrix, i, j)) {
                        matrix.setElement(i, j, 0);
                    }
                }
            }
        }

    }


    private static boolean getException(Matrix matrix) {

        boolean correct = true;
        int row = matrix.getLength();

        if (row == 0) {
            correct = false;
        }

        for (int i = 0; i < row; i++) {
            if (matrix.getVector(0).length != row) {
                correct = false;
            }
        }

        return correct;
    }

    public static void main(String[] args) {
        double[][] arr = {{1, 8, 7, 5, 3}, {6, 9, 10, 2, 1}, {15, 23, 0, 18, 7}, {9, 0, 3, 2, 4}, {0, 28, 13, 12, 2}};
        double[][] arr2 = {{1, 2, -3}, {2, 0, 0}, {-3, 0, 1}};

        Matrix matrix = new Matrix(arr);
        System.out.println(matrix);

        System.out.println(isSymmetric(matrix));
    }
}
