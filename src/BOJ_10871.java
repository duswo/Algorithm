import java.util.Scanner;

public class BOJ_10871 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N, X, n = 0;
        N = sc.nextInt();
        X = sc.nextInt();
        int[] A = new int[N];
        for(int i = 0; i < N; i++){
            n = sc.nextInt();
            A[i] = n;
        }
        for(int i = 0; i < N; i++){
            if(A[i] < X ){
                System.out.print(A[i] + " ");
            }
        }
    }
}
