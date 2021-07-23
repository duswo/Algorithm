import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_10951 {
    /* url - https://www.acmicpc.net/problem/10951 */
    /* 참고 - https://st-lab.tistory.com/40 */
    /* EOF(End of File) : 파일의 끝 , 입력에서 더이상의 읽을 수 있는 데이터 X */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        /* StringBuilder : 문자열 연결 */
        String str;

        while((str=br.readLine()) != null) {
            int a = str.charAt(0) - 48;
            int b = str.charAt(2) - 48;
            sb.append(a+b).append("\n");
        }
        System.out.println(sb);
        /* ctrl + D로 EOF입력 -> BufferedReader로 null 반환*/
    }
}
