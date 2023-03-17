import java.io.BufferedReader;
//import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
//import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("lugemine.txt"));
        String rida = br.readLine();
//        System.out.println(rida);
        while (rida != null) {
            System.out.println(rida);
            String[] tykeldus = rida.split("u");
            System.out.println(Arrays.toString(tykeldus));
            System.out.println(tykeldus.length); // List<> dasdas --> dasdas.size()
            double ruut = Math.pow(tykeldus.length, 2);
            System.out.println(ruut);
            double ruutjuur = Math.sqrt(tykeldus.length);
            System.out.println(ruutjuur);
            rida = br.readLine();
        }
    }
}
