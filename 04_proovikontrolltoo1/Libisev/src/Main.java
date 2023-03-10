//import java.util.List;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(aritmKeskmine(3,4,5));
        System.out.println(aritmKeskmine(5,5,6));

        double[] sisend = {3,4,5,6,6}; // [3,4,5,6,6]
        // List<Double> sisend = new ArrayList(Arrays.asList(3,4,5,6,6)); // List, ArrayList, Arrays
        // Arrays tuleb importida
        System.out.println(Arrays.toString(libisevKeskmine(sisend)));
    }

    private static double aritmKeskmine(double arv1, double arv2, double arv3) {
        return (arv1 + arv2 + arv3) / 3;
    }

    private static double[] libisevKeskmine(double[] arvud) {
        double[] valjund = new double[arvud.length - 2]; // kui teen uue array, siis pean koheselt ütlema kui pikk ta on
        for (int i = 0; i < arvud.length-2; i++) { // fori
            valjund[i] = (arvud[i] + arvud[i+1] + arvud[i+2]) / 3;
        }
        return valjund;
    }

    // List numbriteList = new ArrayList(); <--- manipuleeritav (1 juurde, 1 vähemaks, järjekorda)
    // numbriteList[] <--- read-only

    // 1,2,3
    //

}
