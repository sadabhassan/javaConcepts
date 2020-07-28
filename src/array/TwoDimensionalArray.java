package array;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        // two dimensional array
        // numbers
        int[][] numbers = {{1,2}, {2,3}};
       for(int i=0; i<numbers.length; i++){
           for(int j=0;j<numbers[i].length; j++){
               System.out.print(numbers[i][j] + " ");
           }
           System.out.println("");
       }

       //jagged array - arrays of array having different number of columns
        int[][] jaggedArray = {{1,2,3,4}, {1,2,3},{1,2},{1}};
       for (int i=0; i<jaggedArray.length;i++){
           for(int j=0; j<jaggedArray[i].length; j++) {
               System.out.print(jaggedArray[i][j]);
           }
           System.out.println("");
       }
    }
}
