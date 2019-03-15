package by.bntu.fitr.poisist.bobnisuliana.model.logic;

import org.junit.Assert;
import org.junit.Test;


public class MatrixWorkerTest {
    @Test
    public void testWithSymmetric() {
        int[][] arr = {{1, 8, 7, 5, 3}, {6, 9, 10, 2, 1}, {15, 23, 0, 18, 7}, {9, 0, 3, 2, 4}, {0, 28, 13, 12, 2}};
        boolean result = MatrixWorker.isSymmetric(arr);
        Assert.assertEquals(result, false);
    }

    @Test
    public void testWithNotSymmetric() {
        int[][] arr = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
        boolean result = MatrixWorker.isSymmetric(arr);
        Assert.assertEquals(result, true);
    }

    @Test
    public void testWithEmptyMatrix() {
        int[][] arr = {};
        boolean result = MatrixWorker.isSymmetric(arr);
        Assert.assertEquals(result, false);
    }

    @Test
    public void testWithNullElemets() {
        int[][] arr = {{1, 8, 7, 5, 3}, null, {15, 23, 0, 18, 7}, {9, 0, 3, 2, 4}, {0, 28, 13, 12, 2}};
        boolean result = MatrixWorker.isSymmetric(arr);
        Assert.assertEquals(result, false);
    }

    @Test
    public void testWithWrongMatrix() {
        int[][] arr = {{1, 8, 7, 5, 3}, {9, 0, 3, 2, 4}, {0, 28, 13, 12, 2}};
        boolean result = MatrixWorker.isSymmetric(arr);
        Assert.assertEquals(result, false);
    }

    @Test
    public void testWithNegativeElements() {
        int[][] arr = {{1, 2, -3}, {2, 0, 0}, {-3, 0, 1}};
        boolean result = MatrixWorker.isSymmetric(arr);
        Assert.assertEquals(result, true);
    }
}
