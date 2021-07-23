import java.util.Scanner;

public class BOJ_10818 {
    /* url - https://www.acmicpc.net/problem/10818 */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int max = -1000000, min = 1000000;
        int[] arr = new int[N];
        for(int i = 0; i < N; i++){
            arr[i] = sc.nextInt();
             if(max < arr[i]) {
                 max = arr[i];
             }
             if(min > arr[i]){
                 min = arr[i];
             }
        }
        System.out.println(min + " " + max);
    }
}
