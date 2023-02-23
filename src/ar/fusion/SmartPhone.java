package ar.fusion;

public class SmartPhone extends SmartDevice{
    private boolean dobleChip;
    private String red; //GSM, GPRS, LTA etc

    public SmartPhone() {
    }
    public SmartPhone(boolean dobleChip, String red) {
        this.dobleChip = dobleChip;
        this.red = red;
    }

    public SmartPhone(String marca, String modelo, String color, double precio, boolean dobleChip, String red) {
        super(marca, modelo, color, precio);
        this.dobleChip = dobleChip;
        this.red = red;
    }

    public boolean isDobleChip() {
        return dobleChip;
    }

    public void setDobleChip(boolean dobleChip) {
        this.dobleChip = dobleChip;
    }

    public String getRed() {
        return red;
    }

    public void setRed(String red) {
        this.red = red;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "dobleChip=" + dobleChip +
                ", red='" + red + '\'' +
                "} " + super.toString();
    }
}
