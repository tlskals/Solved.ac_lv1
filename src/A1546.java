import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;


public class A1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine()); // 시험본 과목 수 3
        StringTokenizer st = new StringTokenizer(br.readLine()); // 각 시험 점수 40 80 60
        double arr[] = new double[a];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = Double.parseDouble(st.nextToken());
        }
        // {40, 80 ,60}

        Arrays.sort(arr); // {40, 60, 80}

        double total = 0;

        for(int i = 0; i < arr.length; i++) {
            total += ((arr[i] / arr[arr.length - 1]) * 100); // (40/80)*100 / 60/80*100
        }

        br.close();
        bw.write(String.valueOf(total / a));
        bw.flush();
        bw.close();
    }
}
