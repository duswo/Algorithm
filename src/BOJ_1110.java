import java.util.Scanner;

public class BOJ_1110 {
    /* url - https://www.acmicpc.net/problem/1110 */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();

        int cnt = 0, T = N;

        while(true) {
            N = ((N%10)*10)+(((N/10) + (N%10))%10);
            cnt++;
            if(T == N){
                break;
            }
        }
        System.out.println(cnt);

    }
}
