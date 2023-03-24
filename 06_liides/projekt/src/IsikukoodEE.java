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
        return null;
    }

    @Override
    public int getVanus() {
        return 0;
    }
}

// 50001029996
// 70303039914
// 30303039816
// 50701019992
// 40404049996
