public class Main {
    public static void main(String[] args) {

        Info info = new Info("Mac", "16gb", "Mac");
        Arvuti arvuti1 = new Arvuti(info, 1000);
        arvuti1.suurendaMaksumus(100);

        Arvuti arvuti2 = new Arvuti(new Info("Windows", "8gb", "Windows"), 1000);
        arvuti2.paneDollaritesse();


    }
}
