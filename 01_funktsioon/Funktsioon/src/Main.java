public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        prindiForTsykkel(5);
        prindiForTsykkel(10);

        String hinnang = temperatuuriHinnang(-2.5);
        String hinnang2 = temperatuuriHinnang(5.7);
        System.out.println(hinnang);
        System.out.println(hinnang2);

        double summa = arvutaTaksoMaksumus(3);
        System.out.println(summa);
        double summa2 = arvutaTaksoMaksumus(4.5);
        System.out.println(summa2);
    }

    private static double arvutaTaksoMaksumus(double tunnid) {
        return 3+0.8*tunnid;
    }

    private static String temperatuuriHinnang(double temp) {
        if (temp < 0) {
            return "On jääs";
        } else {
            return "On vesi";
        }
    }

    private static void prindiForTsykkel(int kordadeArv) {
        for (int i = 0; i < kordadeArv; i++) {
            System.out.println(i);
        }
    }
}
