import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class B2798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st1 = new StringTokenizer(br.readLine());// 첫째 줄 입력값을 StringTokenizer로 받아옴

        int count = Integer.parseInt(st1.nextToken());  //변수 count에 카드의 개수 입력
        int number = Integer.parseInt(st1.nextToken()); // 변수 number에 블랙잭 값 입력

        int[] arr = new int[count]; // 각 카드들의 값을 모두 순회하기위한 배열 arr 선언

        StringTokenizer st2 = new StringTokenizer(br.readLine()); //둘째 줄 입력값을 StringTokenizer로 받아옴

        for (int i = 0; i<count; i++) { // 반복문을 통해 arr에 카드에 적혀있는 값들을 입력
            arr[i] = Integer.parseInt(st2.nextToken());
        }

        br.close();

        int result = 0; // 최종값을 담아줄 변수 result 선언

        for (int j = 0; j < count - 2; j++) { // 세장의 카드를 골라야 하기때문에 count-2까지만 반복문 사용
            //ex) count = 5 -> 0,1,2
            for (int k = j + 1; k < count - 1; k++) { // 첫장을 고른 상태이기때문에 k= j+1부터 count-1까지만 반복문 사용
                // ex) j=0 , count = 5 -> 1,2,3
                for (int l = k + 1; l < count; l++) { // 마지막장을 골라야 하기때문에 count까지 반복문 사용
                    //ex) j=0,k=1,count=5 -> 2,3,4

                    int sum = arr[j] + arr[k] + arr[l]; // 각각의 값을 더해줌
                    if(sum <= number && sum > result) // 만약 더한값이 블랙잭 설정값보다 크지않고 result보다 크다면
                        result = sum; // result에 더한값을 삽입해줌
                }
            }
        }
        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
    }
}
