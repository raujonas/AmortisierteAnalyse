public class Main {

    public static void main(String[] args) {

        int i = 0;
        int n = 5;
        int A[] = new int[n];
        int konto = 0;

        do {
            konto += 2;
            i = 1;

            while (A[i-1]==1){
                A[i-1] = 0;
                konto -=1;
                i+=1;
            }

            A[i-1] = 1;
            konto -=1;

        } while (i<n);
    }
}
