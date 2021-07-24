import java.util.Scanner;

public class BOJ_2562 {
    /* url : https://www.acmicpc.net/problem/2562 */
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[] arr = new int[9];
        int max = -10000, n = 0;
        for(int i = 0; i < 9; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < 9; i++){
            if(max < arr[i]){
                max = arr[i];
                n = i+1;
            }
        }
        System.out.println(max);
        System.out.println(n);
    }
}
