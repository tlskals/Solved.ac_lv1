import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A2742 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine()); // BufferdReader는 String형식으로 받아오니 parseInt로 변환

        for (int j = a; j >= 1; --j) { // a가 5라면 첫줄의 공백은 4(a-k)개 별이 1(k++)개
            System.out.println(j); // 공백을 출력함

        }
    }
}
