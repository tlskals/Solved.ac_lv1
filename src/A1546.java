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

        int a = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        double arr[] = new double[a];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = Double.parseDouble(st.nextToken());
        }

        Arrays.sort(arr);

        double total = 0;

        for(int i = 0; i < arr.length; i++) {
            total += ((arr[i] / arr[arr.length - 1]) * 100);
        }
        br.close();
        bw.write(String.valueOf(total / arr.length));
        bw.flush();
        bw.close();
    }
}
