public class Main {

    public static void main(String[] args) {

        int i = 0;
        int n = 3;
        int A[] = new int[n];

        do {
            i = 1;

            while (A[i-1]==1){
                A[i-1] = 0;
                i+=1;
            }

            A[i-1] = 1;

        } while (i<n);
    }
}
