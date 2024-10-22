import java.util.Arrays;

public class DiverseArray {

    public static int arraySum(int[] array){
        int sum = 0;
        for(int i: array){
            sum += i;
        }
        return sum;
    }

    public static int[] rowSums(int[][] array){
        int[] returnSum = new int[array.length];

        for(int row = 0; row < array.length; row++){
            for(int col = 0; col < array[row].length; col++){
                returnSum[row] += array[row][col];
            }
        }

        return returnSum;
    }

    public static boolean isDiverse(int[][] array){
        int[] sums = rowSums(array);
        int[] sums2 = rowSums(array);

        System.out.println(Arrays.toString(sums));

        for(int element = 0; element < sums.length; element++){
            for(int comparedValue = 0; comparedValue < sums2.length; comparedValue++){
                if(sums[element] == sums2[comparedValue] && comparedValue != element){
                    return false;
                }
            }
        }

        return true;
    }
}
