import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class A2577 {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw =  new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        int result = a*b*c;
        String str = String.valueOf(result);

        int [] arr = new int[10];

        for (int i=0; i<str.length(); i++) {
            arr[(str.charAt(i) - 48)]++;
        }
        for (int j = 0; j<arr.length; j++) {
            bw.write(arr[j]+"\n");
        }
        bw.flush();
        bw.close();
    }
}
