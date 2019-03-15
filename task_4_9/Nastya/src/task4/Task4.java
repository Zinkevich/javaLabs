
package task4;

public class Task4 {
    
        public static void changingIndexOfElements(int[][] array) {

        if(getException(array)){
            
            int l = array[0].length;

            for (int n = 0; n < l; n++)
            {
                int row = 0, col = 0;
                int max = 0;

                for (int i = 0; i < l; i++){
                    for (int j = 0; j < l; j++)
                    {
                        if (i != j || i > n){
                            if (array[i][j] > max)
                            {
                                max = array[i][j];
                                row = i;
                                col = j;
                            }
                    }
        }
                int temp = array[n][n];
                array[n][n] = array[row][col];
                array[row][col] = temp;
        }
    }
}
    }
        
        private static boolean getException(int[][] array){
        
            boolean correct = true;
            int row = array.length;
            
            if(row == 0){
                correct = false;
            }
            
            for(int i = 0; i < row; i++){
                if(array[i] == null||array.length != row){
                    correct = false;
                }
        }
            return correct;
        }
}
