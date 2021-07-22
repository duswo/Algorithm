import java.util.Scanner;

public class BOJ_10950 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A, B, i;
        i = sc.nextInt();
        int[] arr = new int[i];
        for(int k = 0; k < i; k++) {
            A = sc.nextInt();
            B = sc.nextInt();
            arr[k] = A+B;
        }
        for(int k = 0; k < i; k++) {
            System.out.println(arr[k]);
        }

    }
}
