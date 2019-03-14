package by.bntu.fitr.poisist.bobnisuliana.model.logic;

public class MatrixWorker {

    public static boolean isSymmetric(int[][] vector) {

        boolean symmetric = true;
        int row = vector.length;
        int column = vector.length;

        if (getException(vector)) {

            changeLocalMinToZero(vector, row, column);

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


    private static boolean getFlags(int[][] vector, int row, int column) {
        boolean up = false;
        boolean down = false;
        boolean left = false;
        boolean right = false;
        boolean upleft = false;
        boolean upright = false;
        boolean downleft = false;
        boolean downright = false;

        if (row != 0) {
            if (vector[row][column] < vector[row - 1][column]) {
                up = true;
            }

            if (column != 0 && vector[row][column] < vector[row - 1][column - 1]) {
                upleft = true;
            }

            if (column != vector.length - 1 && vector[row][column] < vector[row - 1][column + 1]) {
                upright = true;
            }
        } else {
            up = true;
            upleft = true;
            upright = true;
        }


        if (row != vector.length - 1) {
            if (vector[row][column] < vector[row + 1][column]) {
                down = true;
            }

            if (column != 0 && vector[row][column] < vector[row + 1][column - 1]) {
                downleft = true;
            }

            if (column != vector.length - 1 && vector[row][column] < vector[row + 1][column + 1]) {
                downright = true;
            }
        } else {
            down = true;
            downleft = true;
            downright = true;
        }


        if (column != 0) {
            if (vector[row][column] < vector[row][column - 1]) {
                left = true;
            }

            if (row != 0 && vector[row][column] < vector[row - 1][column - 1]) {
                upleft = true;
            }

            if (row != vector.length - 1 && vector[row][column] < vector[row + 1][column - 1]) {
                downleft = true;
            }

        } else {
            left = true;
            upleft = true;
            downleft = true;
        }


        if (column != vector.length - 1) {
            if (vector[row][column] < vector[row][column + 1]) {
                right = true;
            }

            if (row != 0 && vector[row][column] < vector[row - 1][column + 1]) {
                upright = true;
            }

            if (row != vector.length - 1 && vector[row][column] < vector[row + 1][column + 1]) {
                downright = true;
            }
        } else {
            right = true;
            upright = true;
            downright = true;
        }


        return up & down & left & right & upleft & upright & downleft & downright;
    }


    private static void changeLocalMinToZero(int[][] vector, int row, int column) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (getFlags(vector, i, j)) {
                    vector[i][j] = 0;
                }
            }
        }
    }


    private static boolean getException(int[][] vector) {

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
        int[][] arr = {{1, 8, 7, 5, 3}, {6, 9, 10, 2, 1}, {15, 23, 0, 18, 7}, {9, 0, 3, 2, 4}, {0, 28, 13, 12, 2}};
        int[][] arr2 = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
        System.out.println(isSymmetric(arr));
        System.out.println(isSymmetric(arr2));
    }
}
