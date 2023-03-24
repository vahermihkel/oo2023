public class IsikukoodSW extends Isikukood implements Andmed {

    public IsikukoodSW(String nimi, String isikukood) {
        super(nimi, isikukood);
    }

    @Override
    public String getSugu() {
        return null;
    }

    @Override
    public String getKuupaev() {
        return null;
    }

    @Override
    public int getVanus() {
        return 0;
    }
}

//    https://en.wikipedia.org/wiki/Personal_identity_number_(Sweden)
//    eelviimane kas on mees või naine, paaritud mehed, paaris naised
//    YYMMDD-XXXX
//    811228-9874
//    670919-9530
//    212121-2127
