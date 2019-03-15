public class Matrix {
    private  double[][] matrix;
    private int length;

    public Matrix(){
        matrix = new double[0][];
    }

    public Matrix(double[][] matr){
        matrix = new double[matr.length][];
        length = matrix.length;

        for (int i = 0; i < matrix.length; i++){
            matrix[i] = matr[i].clone();
        }
    }

    public int getLength() {
        return length;
    }

    public double getElement(int i, int j){
        return matrix[i][j];
    }

    public void setElement(int i, int j, double element){
        this.matrix[i][j] = element;
    }

    public double[] getVector(int i){
        return matrix[i];
    }

    public void setVector(int i, double[] vector){
        this.matrix[i] = vector;
    }

    @Override
    public String toString() {
        StringBuilder msg = new StringBuilder("Matrix: ");
        for (double[] vector : matrix) {
            msg.append("\n");
            for (double element: vector) {
                msg.append(element).append(" ");
            }

        }
        return msg.toString();
    }

}
