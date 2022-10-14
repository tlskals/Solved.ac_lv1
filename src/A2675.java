import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class A2675 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int input = Integer.parseInt(br.readLine());

        for (int i = 0; i < input; i++) {
            String[] str = br.readLine().split(" ");

            int num = Integer.parseInt(str[0]);
            String word = str[1];

            for (int j = 0; j < word.length(); j++) {
                for (int k = 0; k < num; k++) {
                    bw.write(word.charAt(j));
                }
            }
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}