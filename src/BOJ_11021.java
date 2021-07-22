import java.util.Scanner;

public class BOJ_11021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T, A, B = 0;
        T = sc.nextInt();
        int[] sum = new int[T];
        for(int i = 0; i < T; i++){
            A = sc.nextInt();
            B = sc.nextInt();
            sum[i] = A+B;
        }
        for(int i = 0; i < T; i++){
            System.out.println("Case #" + (i+1) + ": " + sum[i]);
        }
    }
}
