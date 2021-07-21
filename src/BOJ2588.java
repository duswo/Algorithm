import java.util.Scanner;

public class BOJ2588 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A, B, C, D, E;
        A = sc.nextInt();
        B = sc.nextInt();
        C = (((B%100)%10)/1) * A;
        D = (((B%100)/10) * A);
        E = ((B/100) * A);

        System.out.println(C);
        System.out.println(D);
        System.out.println(E);
        System.out.println(C+D*10+E*100);

    }
}
