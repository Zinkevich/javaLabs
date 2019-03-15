package task4;

public class Main {
    public static void main(String[] args) {
        
        int[][] array = {{1, 2, 3},
                         {6,  7, 8},
                         {11, 12, 13},
                         {16, 17, 18},
                         {21, 22, 23}};
     
        Task4.changingIndexOfElements(array);
        
        for(int i = 0 ; i < array[0].length; i++){
            for(int j = 0 ; j < array[0].length; j++){
                System.out.print(array[i][j] + " ");
        }
         System.out.print("\n");
        }
    }
}
