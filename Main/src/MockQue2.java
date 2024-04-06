
//Input:  {0, 1, 2, 0, 1, 2}
//        Output: {0, 0, 1, 1, 2, 2}
// {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2}
public class MockQue2 {
    public void sort(){
        int[] a = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i] < a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void main(String[] args) {
        MockQue2 s = new MockQue2();
        s.sort();
    }
}
