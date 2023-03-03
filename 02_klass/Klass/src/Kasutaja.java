import java.util.Date;

public class Kasutaja {
    String kasutajanimi;
    String parool;
    String email;
    String eesnimi;
    String perenimi;
    boolean aktiivne;
    Date loomiseAeg;
    Date kustutamiseAeg;

    public Kasutaja(String kasutajanimi, String parool, String email, String eesnimi, String perenimi) {
        this.kasutajanimi = kasutajanimi;
        this.parool = parool;
        this.email = email;
        this.eesnimi = eesnimi;
        this.perenimi = perenimi;
        this.aktiivne = true;
        this.loomiseAeg = new Date();
        this.kustutamiseAeg = null;
    }

    public String kustutaKasutaja() {
        this.aktiivne = false;
        this.kustutamiseAeg = new Date();
        return "Kasutaja kustutatud!";
    }

    public void muudaParool(String uusParool) {
        this.parool = uusParool;
        System.out.println("Parool muudetud");
    }
}
