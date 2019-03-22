package by.bntu.fitr.poisit.baristy.bobnis.individual.model;

public class Matrix {
    private int[][] matrix;
    private int length;

    public Matrix() {
        matrix = new int[0][];
    }

    public Matrix(int[][] matr) {
        matrix = new int[matr.length][];
        length = matrix.length;

        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = matr[i].clone();
        }
    }

    public int getLength() {
        return length;
    }

    public int getElement(int i, int j) {
        return matrix[i][j];
    }

    public void setElement(int i, int j, int element) {
        this.matrix[i][j] = element;
    }

    public int[] getVector(int i) {
        return matrix[i];
    }

    public void setVector(int i, int[] vector) {
        this.matrix[i] = vector;
    }

    @Override
    public String toString() {
        StringBuilder msg = new StringBuilder("Matrix: ");
        for (int[] vector : matrix) {
            msg.append("\n");
            for (int element : vector) {
                msg.append(element).append(" ");
            }

        }
        return msg.toString();
    }
}
