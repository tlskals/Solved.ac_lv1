import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.Arrays;

public class A10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine()); // 첫번째 줄 입력
        StringTokenizer st = new StringTokenizer(br.readLine()); // 두번째 줄 입력
        // StringTokenizer는 br.readLine() 구분자를 적지 않으면 자동으로 공백 기준으로 나눔

        int i = 0;  // 변수 i 선언
        int[] arr = new int[a]; // 빈배열 arr 선언, 크기는 첫번째 입력된 숫자 만큼//
        while(st.hasMoreTokens()) {  // 반복문 실행, hasMoreTokens는 boolean 타입 (true or false)
            arr[i] = Integer.parseInt(st.nextToken()); // 15번째 줄에서 선언한 st에 token이 있다면 배열 arr에 넣어줌
            i++;
        }
        Arrays.sort(arr); //배열 오름차순 정렬
        bw.write(arr[0] + " " + arr[a - 1]); // 오름차순 정렬했기 때문에 배열의 첫번째 요소와 마지막 요소가 각각 최소값 최대값
        bw.flush();
        bw.close();
    }
}
