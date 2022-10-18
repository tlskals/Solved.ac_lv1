import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A2884 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] time = br.readLine().split(" ");  // 입력받은 숫자를 " " 기준으로 잘라 배열을 만들어줌
        int H = Integer.parseInt(time[0]); // 배열의 0번 값은 '시' 로 설정
        int M = Integer.parseInt(time[1]); // 배열의 1번 값은 '분' 으로 설정

        // 만약 분이 45분보다 크면 시를 - 할 필요가 없음
        // 분이 45분보다 작으면 시를 - 해야함

        if (M >= 45) { // 입력된 분이 45분보다 크거나 같다면
            M = M-45; // 입력된 분에서 45를 빼줌
            System.out.println(H + " " + M);
        } else { // 그렇지 않다면 (입력된 분이 45분보다 작다면)
            H = H - 1; // 현재 시간에서 -1을 해주고
            M = 15 + M; // 입력된 분에서 15를 더해줌

            if (H < 0) { // 만약 위의 조건문을 진행했을때 입력된 값이 0시여서 -1시가 되었다면
                H = 23; // -1시를 23시로 바꿔줌.
            }
            System.out.println(H + " " + M);
        }
    }
}
