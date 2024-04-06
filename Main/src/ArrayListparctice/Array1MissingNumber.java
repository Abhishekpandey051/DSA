package ArrayListparctice;
import java.util.*;

public class Array1MissingNumber {
    public static void main(String[] args) {
        int[] inputArray = {12,34,-20,44,-10,56,-2,86,12};
        int[] outputArray = sortByHeight(inputArray);

        for (int item : outputArray) {
            System.out.print(item + ", ");
        }
    }

    public static int[] sortByHeight(int[] inputArray) {
        for (int i = 0; i < inputArray.length; i++) {
            for (int j = 0; j < inputArray.length - 1; j++) {
                int temp = inputArray[j];
                if (temp >= 0) {
                    int k = j + 1;
                    while (inputArray[k] < 0)
                        k++;
                    if (inputArray[j] > inputArray[k] && inputArray[k] >= 0) {
                        inputArray[j] = inputArray[k];
                        inputArray[k] = temp;
                    }
                }
            }
        }
        return inputArray;
    }
}