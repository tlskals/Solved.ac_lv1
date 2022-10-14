import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class A2577 {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw =  new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine()); // 첫째줄 입력받음
        int b = Integer.parseInt(br.readLine()); // 둘째줄 입력받음
        int c = Integer.parseInt(br.readLine()); // 셋째줄 입력받음

        int result = a*b*c; // 정수형 변수 result에 입력받은 값들을 곱한값을 선언
        String str = String.valueOf(result); // 해당 값을 charAt 함수를 사용하기위해 String으로 변환

        int [] arr = new int[10]; // 크기가 10인 배열 arr 선언 (0~9까지 숫자가 들어가기 때문에)

        for (int i=0; i<str.length(); i++) { //반복문을 사용하여 17번째 줄에서 선언한 str을 arr 배열에 넣어줌
            arr[(str.charAt(i) - 48)]++; // str.charAt은 아스키코드값을 받아오기 떄문에 48을 빼줌 (Character.getNumericValue 사용해보려다 실패)
        }
        for (int i : arr) { // 반복문을 사용하여 배열 출력
            bw.write(i + "\n"); // "\n" 사용 시 줄바꿔줌 (= bw.nextLine())
        }
        bw.newLine();
        bw.flush();
        bw.close();
    }
}
