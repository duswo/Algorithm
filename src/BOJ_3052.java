import java.util.HashSet;
import java.util.Scanner;

public class BOJ_3052 {
    /* url : https://www.acmicpc.net/problem/3052 */
    /* 참고 : https://st-lab.tistory.com/46 */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> h = new HashSet<Integer>();
        /* HashSet
           자바 Collection 중 Set의 파생클래스
           중복되는 원소 하나만 저장
           순서 개념 x
         */
        for(int i = 0; i < 10; i++){
            h.add(sc.nextInt() % 42);
        }

        sc.close();
        System.out.println(h.size());

    }
}
