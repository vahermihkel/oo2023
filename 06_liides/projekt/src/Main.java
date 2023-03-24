public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        IsikukoodEE ee1 = new IsikukoodEE("Mihkel", "50001029996");
        System.out.println(ee1.getSugu());
        IsikukoodEE ee2 = new IsikukoodEE("Mihkel", "70303039914");
        System.out.println(ee2.getSugu());
        IsikukoodEE ee3 = new IsikukoodEE("Mihkel", "30303039816");
        System.out.println(ee3.getSugu());
        IsikukoodEE ee4 = new IsikukoodEE("Mihkel", "50701019992");
        System.out.println(ee4.getSugu());
        IsikukoodEE ee5 = new IsikukoodEE("Mihkel", "40404049996");
        System.out.println(ee5.getSugu());
    }
}
