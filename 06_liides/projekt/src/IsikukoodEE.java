public class IsikukoodEE extends Isikukood implements Andmed {

    public IsikukoodEE(String nimi, String _isikukood) {
        super(nimi, _isikukood);
    }

    @Override
    public String getSugu() {
        if (isikukood.startsWith("3") || isikukood.startsWith("5")) {
            return "M";
        } else if (isikukood.startsWith("4") || isikukood.startsWith("6")) {
            return "F";
        } else {
            return "Vigane isikukood!";
        }
    }

    @Override
    public String getKuupaev() {
        if (isikukood.startsWith("3") || isikukood.startsWith("4")) {
            return  isikukood.substring(5,7) + "." + isikukood.substring(3,5) + ".19" + isikukood.substring(1,3);
        } else if (isikukood.startsWith("5") || isikukood.startsWith("6")) {
            return isikukood.substring(5,7) + "." + isikukood.substring(3,5) + ".20" + isikukood.substring(1,3);
        } else {
            return "Vigane isikukood!";
        }
    } // 312412321

    @Override
    public int getVanus() {
        if (isikukood.startsWith("3") || isikukood.startsWith("4")) {
            return 2023 - (1900 + Integer.parseInt(isikukood.substring(1,3)));
        } else if (isikukood.startsWith("5") || isikukood.startsWith("6")) {
            return 2023 - (2000 + Integer.parseInt(isikukood.substring(1,3)));
        } else {
            return -1;
        }
    }
}

// 50001029996
// 70303039914
// 30303039816
// 50701019992
// 40404049996
