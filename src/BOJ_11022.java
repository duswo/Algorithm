import java.util.Scanner;

public class BOJ_11022 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T, A, B = 0;
        T = sc.nextInt();
        int[] sum = new int[T];
        int [] a = new int[T];
        int [] b = new int[T];
        for(int i = 0; i < T; i++){
            A = sc.nextInt();
            B = sc.nextInt();
            a[i] = A;
            b[i] = B;
            sum[i] = A+B;
        }
        for(int i = 0; i < T; i++){
            System.out.println("Case #" + (i+1) + ": " + a[i] + " + " + b[i] + " = " +sum[i]);
        }
    }
}
