public class Info {
    String nimetus;
    String ram;
    String opSysteem;

    // parem klõps -> generate -> constructor
    public Info(String nimetus, String ram, String opSysteem) {
        this.nimetus = nimetus;
        this.ram = ram;
        this.opSysteem = opSysteem;
    }

    public void muudaRami() {

    }

    public String kysiOpSysteemi() {
        return opSysteem;
    }
}
