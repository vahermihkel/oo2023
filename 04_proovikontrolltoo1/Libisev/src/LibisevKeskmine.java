import java.util.ArrayList;
import java.util.List;

public class LibisevKeskmine {
    //double[] arvudListis; // pärisarvud
    List<Double> arvudListis = new ArrayList<>();

    //double[] arvudKeskmisega; // salvestuse eesmärgil
    List<Double> arvudKeskmisega = new ArrayList<>();

    // kõik keskmised panen kirja
//    int lisatudArvudeArv;

    public LibisevKeskmine(double arv1, double arv2, double arv3) {
//        arvudListis = new double[3]; // [0.0,0.0,0.0]
//        arvudListis[0] = arv1;
//        arvudListis[1] = arv2;
//        arvudListis[2] = arv3;
        arvudListis.add(arv1);
        arvudListis.add(arv2);
        arvudListis.add(arv3);
    }

    public void lisaArv(double arv) {
        arvudListis.add(arv);
//        double[] valjund = new double[arvud.length - 2]; // kui teen uue array, siis pean koheselt ütlema kui pikk ta on
//        for (int i = 0; i < arvud.length-2; i++) { // fori
//            valjund[i] = (arvud[i] + arvud[i+1] + arvud[i+2]) / 3;
//        }
//        return valjund;
    }
}
