import java.util.Scanner;

public class BOJ_2577 {
    /* url : https://www.acmicpc.net/problem/2577*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int a=0,b=0,c=0,d=0,e=0,f=0,g=0,h=0,i=0,j=0;
        String mul = Integer.toString(A * B * C);
        String [] arr_mul;
        arr_mul = mul.split("");
        for(int k = 0; k < arr_mul.length; k++){
            if(mul.charAt(k) == '0'){
                a++;
            }else if(mul.charAt(k) == '1'){
                b++;
            }else if(mul.charAt(k) == '2'){
                c++;
            }else if(mul.charAt(k) == '3'){
                d++;
            }else if(mul.charAt(k) == '4'){
                e++;
            }else if(mul.charAt(k) == '5'){
                f++;
            }else if(mul.charAt(k) == '6'){
                g++;
            }else if(mul.charAt(k) == '7'){
                h++;
            }else if(mul.charAt(k) == '8'){
                i++;
            }else if(mul.charAt(k) == '9'){
                j++;
            }
        }
        System.out.println(a + "\n" + b + "\n" + c + "\n" + d + "\n" + e + "\n" + f + "\n" + g + "\n" + h + "\n" + i + "\n" + j);



    }
}
