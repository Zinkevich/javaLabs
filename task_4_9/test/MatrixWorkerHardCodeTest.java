import org.junit.Assert;
import org.junit.Test;

public class MatrixWorkerHardCodeTest {
    @Test
    public void testWithSymmetric() {
        double[][] arr = {{1, 8, 7, 5, 3}, {6, 9, 10, 2, 1}, {15, 23, 0, 18, 7}, {9, 0, 3, 2, 4}, {0, 28, 13, 12, 2}};
        Matrix matrix = new Matrix(arr);

        boolean result = MatrixWorkerHardCode.isSymmetric(matrix);
        Assert.assertEquals(result, false);
    }

    @Test
    public void testWithNotSymmetric() {
        double[][] arr = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
        Matrix matrix = new Matrix(arr);

        boolean result = MatrixWorkerHardCode.isSymmetric(matrix);
        Assert.assertEquals(result, true);
    }

    @Test
    public void testWithEmptyMatrix() {
        double[][] arr = {};
        Matrix matrix = new Matrix(arr);

        boolean result = MatrixWorkerHardCode.isSymmetric(matrix);
        Assert.assertEquals(result, false);
    }

    @Test
    public void testWithWrongMatrix() {
        double[][] arr = {{1, 8, 7, 5, 3}, {9, 0, 3, 2, 4}, {0, 28, 13, 12, 2}};
        Matrix matrix = new Matrix(arr);

        boolean result = MatrixWorkerHardCode.isSymmetric(matrix);
        Assert.assertEquals(result, false);
    }

    @Test
    public void testWithNegativeElements() {
        double[][] arr = {{1, 2, -3}, {2, 0, 0}, {-3, 0, 1}};
        Matrix matrix = new Matrix(arr);

        boolean result = MatrixWorkerHardCode.isSymmetric(matrix);
        Assert.assertEquals(result, true);
    }

}
