//   Input:-7 3 4 5 6
//   Output:-
//   MAx:- 7
//   Min:- 3

public class MaximumminInArray {
    public static void main(String[] args) {
        int array[] = {7, 3, 4, 5, 9};
        for (int i = 0; i < array.length; i++) {
            if (array[i] > array[i + 1]) {
                System.out.println(array[i]);
            }
        }
    }
}
