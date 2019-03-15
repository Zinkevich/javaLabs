
package task4;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class Task4Test {
    
    public Task4Test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

  
    @Test
    public void testChangingIndexOfElements() {
        System.out.println("changingIndexOfElements");
        int[][] array = {{1, 2, 3, 4, 5 },
                         {6,  7, 8, 9, 10},
                         {11, 12, 13, 14, 15},
                         {16, 17, 18, 19, 20},
                         {21, 22, 23, 24, 25}
                             };
     
        Task4.changingIndexOfElements(array);
        
        assertEquals(25, array[0][0]);
        assertEquals(24, array[1][1]);
        assertEquals(23, array[2][2]);
        assertEquals(22, array[3][3]);
        assertEquals(21, array[4][4]);
            
    }
    
    public void testWrongMatrix() {
        System.out.println("changingIndexOfElements");
        int[][] array = {{1, 2, 3},
                         {6,  7, 8},
                         {11, 12, 13},
                         {16, 17, 18},
                         {21, 22, 23}};
     
        Task4.changingIndexOfElements(array);
        
        assertEquals(25, array[0][0]);
        assertEquals(24, array[1][1]);
        assertEquals(23, array[2][2]);
        assertEquals(22, array[3][3]);
        assertEquals(21, array[4][4]);
            
    }
    
}
