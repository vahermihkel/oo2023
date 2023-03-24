public class IsikukoodFI extends Isikukood implements Andmed {

    public IsikukoodFI(String nimi, String isikukood) {
        super(nimi, isikukood);
    }

    @Override
    public String getSugu() {
        if (Integer.parseInt(isikukood.substring(9,10)) % 2 != 0) {
            return "M";
        } else {
            return "F";
        }
    }

    @Override
    public String getKuupaev() {
        if (isikukood.charAt(6) == '-') {
            return  isikukood.substring(4,6) + "." + isikukood.substring(2,4) + ".19" + isikukood.substring(0,2);
        } else if (isikukood.charAt(6) == 'A') {
            return isikukood.substring(4,6) + "." + isikukood.substring(2,4) + ".20" + isikukood.substring(0,2);
        } else {
            return "Vigane isikukood!";
        }
    }

    @Override
    public int getVanus() {
        return 0;
    }
}
//    https://cran.r-project.org/web/packages/hetu/vignettes/hetu.html
//    hetu	sex	p.num	ctrl.char	date	day	month	year	century	valid.pin
//    111111-111C	Male	111	C	1911-11-11	11	11	1911	-	TRUE
//    010101-0101	Female	010	1	1901-01-01	1	1	1901	-	TRUE
//    010101A900R	Female	900	R	2001-01-01	1	1	2001	A	TRUE	TRUE
//    010101-0102 Female   010         2 1901-01-01   1     1 1901       -
//    111111-111Q   Male   111         Q 1911-11-11  11    11 1911       -
