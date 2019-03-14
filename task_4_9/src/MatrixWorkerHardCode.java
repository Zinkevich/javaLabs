public class MatrixWorkerHardCode {

    public static boolean isSymmetric(double[][] vector) {

        boolean symmetric = true;
        int row = vector.length;
        int column = vector.length;

        if (getException(vector)) {

            changeLocalMin(vector);

            for (int i = 0; i < row; i++) {
                for (int j = 0; j < column; j++) {
                    if (vector[i][j] != vector[j][i]) {
                        symmetric = false;
                    }
                }
            }
        } else {
            symmetric = false;
        }
        return symmetric;
    }


    private static boolean isLocalMinInCentre(double[][] vector, int row, int column) {
        boolean value = false;

        if ((vector[row][column] < vector[row + 1][column + 1]) && (vector[row][column] < vector[row - 1][column - 1]) &&
                (vector[row][column] < vector[row - 1][column + 1]) && (vector[row][column] < vector[row + 1][column - 1]) &&
                (vector[row][column] < vector[row - 1][column]) && (vector[row][column] < vector[row][column - 1]) &&
                (vector[row][column] < vector[row + 1][column]) && (vector[row][column] < vector[row][column + 1])) {
            value = true;
        }
        return value;
    }

    //think about it
    private static boolean isLocalMinInAngle00(double[][] vector, int row, int column) {
        boolean value = false;

        if ((vector[row][column] < vector[row + 1][column + 1]) && (vector[row][column] < vector[row + 1][column]) &&
                (vector[row][column] < vector[row][column + 1])) {
            value = true;
        }
        return value;
    }

    private static boolean isLocalMinInAngleNN(double[][] vector, int row, int column) {
        boolean value = false;

        if ((vector[row][column] < vector[row - 1][column - 1]) && (vector[row][column] < vector[row - 1][column]) &&
                (vector[row][column] < vector[row][column - 1])) {
            value = true;
        }
        return value;
    }

    private static boolean isLocalMinInAngleN0(double[][] vector, int row, int column) {
        boolean value = false;

        if ((vector[row][column] < vector[row - 1][column + 1]) && (vector[row][column] < vector[row - 1][column]) &&
                (vector[row][column] < vector[row][column + 1])) {
            value = true;
        }
        return value;
    }

    private static boolean isLocalMinInAngle0N(double[][] vector, int row, int column) {
        boolean value = false;

        if ((vector[row][column] < vector[row + 1][column - 1]) && (vector[row][column] < vector[row + 1][column]) &&
                (vector[row][column] < vector[row][column - 1])) {
            value = true;
        }
        return value;
    }

    private static boolean isLocalMinInLeftEdge(double[][] vector, int row, int column) {
        boolean value = false;

        if ((vector[row][column] < vector[row + 1][column + 1]) && (vector[row][column] < vector[row - 1][column + 1]) &&
                (vector[row][column] < vector[row - 1][column]) && (vector[row][column] < vector[row + 1][column]) &&
                (vector[row][column] < vector[row][column + 1])) {
            value = true;
        }
        return value;
    }

    private static boolean isLocalMinInRightEdge(double[][] vector, int row, int column) {
        boolean value = false;

        if ((vector[row][column] < vector[row - 1][column - 1]) && (vector[row][column] < vector[row + 1][column - 1]) &&
                (vector[row][column] < vector[row - 1][column]) && (vector[row][column] < vector[row][column - 1]) &&
                (vector[row][column] < vector[row + 1][column])) {
            value = true;
        }
        return value;
    }

    private static boolean isLocalMinInUpEdge(double[][] vector, int row, int column) {
        boolean value = false;

        if ((vector[row][column] < vector[row][column - 1]) && (vector[row][column] < vector[row][column + 1]) &&
                (vector[row][column] < vector[row + 1][column]) && (vector[row][column] < vector[row + 1][column - 1]) &&
                (vector[row][column] < vector[row + 1][column + 1])) {
            value = true;
        }
        return value;
    }

    private static boolean isLocalMinInDownEdge(double[][] vector, int row, int column) {
        boolean value = false;

        if ((vector[row][column] < vector[row][column + 1]) && (vector[row][column] < vector[row][column - 1]) &&
                (vector[row][column] < vector[row - 1][column]) && (vector[row][column] < vector[row - 1][column - 1]) &&
                (vector[row][column] < vector[row - 1][column + 1])) {
            value = true;
        }
        return value;
    }

    private static void changeLocalMin(double[][] vector) {

        int row = vector.length - 1;

        {
            if (isLocalMinInAngle00(vector, 0, 0)) {
                vector[0][0] = 0;
            }

            if (isLocalMinInAngleNN(vector, row, row)) {
                vector[row][row] = 0;
            }

            if (isLocalMinInAngleN0(vector, row, 0)) {
                vector[row][0] = 0;
            }

            if (isLocalMinInAngle0N(vector, 0, row)) {
                vector[0][row] = 0;
            }

            for (int i = 1; i < row; i++) {
                if (isLocalMinInLeftEdge(vector, i, 0)) {
                    vector[i][0] = 0;
                }
            }

            for (int i = 1; i < row; i++) {
                if (isLocalMinInRightEdge(vector, i, row)) {
                    vector[i][row] = 0;
                }
            }

            for (int i = 1; i < row; i++) {
                if (isLocalMinInUpEdge(vector, 0, i)) {
                    vector[0][i] = 0;
                }
            }

            for (int i = 1; i < row; i++) {
                if (isLocalMinInDownEdge(vector, row, i)) {
                    vector[row][i] = 0;
                }
            }

            for (int i = 1; i < row; i++) {
                for (int j = 1; j < row; j++) {
                    if (isLocalMinInCentre(vector, i, j)) {
                        vector[i][j] = 0;
                    }
                }
            }
        }

    }


    private static boolean getException(double[][] vector) {

        boolean correct = true;
        int row = vector.length;

        if (row == 0) {
            correct = false;
        }

        for (int i = 0; i < row; i++) {
            if (vector[i] == null || vector[i].length != row) {
                correct = false;
            }
        }

        return correct;
    }

    public static void main(String[] args) {
        double[][] arr = {{1, 8, 7, 5, 3}, {6, 9, 10, 2, 1}, {15, 23, 0, 18, 7}, {9, 0, 3, 2, 4}, {0, 28, 13, 12, 2}};
        double[][] arr2 = {{1, 2, -3}, {2, 0, 0}, {-3, 0, 1}};

        System.out.println(isSymmetric(arr2));
    }
}
