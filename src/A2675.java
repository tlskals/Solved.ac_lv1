import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class A2675 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 도저히 모르겠어서 답보고 풀었음
        // Repeat 함수 써보려다 실패

        int input = Integer.parseInt(br.readLine()); // 몇줄을 입력받을지 모르기때문에 int 형변수로 입력받음 (잘모르겠음)

        for (int i = 0; i < input; i++) { // 반복문을 통해 입력받은 줄을 String형 배열에 공백 기준으로 넣어줌
            String[] str = br.readLine().split(" ");

            int num = Integer.parseInt(str[0]); // 첫번째 요소는 반복횟수
            String word = str[1]; // 두번째 요소는 반복할 문자열

            for (int j = 0; j < word.length(); j++) { // 이중for문으로 출력/ 첫번째 반복문은 반복할 문자열 길이만큼 반복/ 0부터 시작하는 이유는 charAt(0)부터 출력해야하기 때문
                for (int k = 1; k <= num; k++) { // 두번째 반복문은 반복횟수 입력
                    bw.write(word.charAt(j)); // 문자열의 요소 출력
                }
            }
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}