import java.util.Scanner;

public class BOJ_10952 {
    /* url - https://www.acmicpc.net/problem/10952 */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A, B;
        A = sc.nextInt();
        B = sc.nextInt();
        while (A != 0 && B != 0){
            System.out.println(A+B);
            A = sc.nextInt();
            B = sc.nextInt();

        }
    }
}
