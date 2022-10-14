import java.io.*;
import java.util.StringTokenizer;

public class A2908 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine()); // 입력값을 반전시켜주는 reverse 함수를 사용하기 위해 StringTokenizer 사용

        int a = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString()); // 변수 a를 첫번째 입력값을 반전시켜 선언
        int b = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString()); // 변수 b를 두번째 입력값을 반전시켜 선언

        if (a > b) { //if 문 사용하여 a>b이면 a출력, a<b이면 b출력
            bw.write(String.valueOf(a));
        } else bw.write(String.valueOf(b));
        bw.flush();
        bw.close();
    }
}