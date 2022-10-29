import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;


public class B4153 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true){  // 0 0 0 이 입력될 때 까지 반복해야 하므로 while (true) 사용
            StringTokenizer st = new StringTokenizer(br.readLine());
            //StringTokenizer를 사용하여 입력받은 값을 " " 기준으로 잘라줌
            int i = 0;  // 변수 i 선언
            int[] arr = new int[3]; // 빈배열 arr 선언, 크기는 삼각형 변의 개수인 3 입력
            while(st.hasMoreTokens()) {  // 반복문 실행, hasMoreTokens는 boolean 타입 (true or false)
                arr[i] = Integer.parseInt(st.nextToken()); // 배열 arr에 입력받은 값을 차례로 삽입
                i++;}
            Arrays.sort(arr); // 배열 오름차순 정리

            if (arr[0]==0 && arr[1]==0 &&arr[2]==0) {
                break; // 입력값이 "0 0 0" 일 경우 반복문을 종료해야 하기 때문에 break 사용
            }

            if (arr[2]*arr[2] == arr[0]*arr[0] + arr[1]*arr[1]) { // 피타고라스의 정리를 사용하여 결과문 출력
                bw.write("right"+'\n');
            }
            else bw.write("wrong"+'\n');
        }
        bw.flush();
        bw.close();
    }
}
