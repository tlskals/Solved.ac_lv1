import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0; // 결과값을 담아줄 변수 선언

        int N = Integer.parseInt(br.readLine()); // 첫줄, 입력으로 주어진 숫자
        String[] str = br.readLine().split(""); // 둘째줄, 더할 값들 선언

        for (int i=0; i< N; i++) { // 더할 값들을 배열에 입력했기 때문에 i=0부터 선언/ 마지막값은 N-1번째이기 때문에 < 사용
            sum += Integer.parseInt(str[i]); // 반복해서 값들을 sum에 더해줌
        }
        System.out.println(sum);  // 최종 결과값 sum 출력
    }
}
