package ar.fusion;

public class SmartWatch extends SmartDevice{
    private String formato; //redondo, cuadrado, etc

    public SmartWatch() {
    }

    public SmartWatch(String formato) {
        this.formato = formato;
    }

    public SmartWatch(String marca, String modelo, String color, double precio, String formato) {
        super(marca, modelo, color, precio);
        this.formato = formato;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "formato='" + formato + '\'' +
                "} " + super.toString();
    }
}
