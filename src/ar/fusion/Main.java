package ar.fusion;

public class Main {
    public static void main(String[] args) {

        SmartPhone celular = new SmartPhone();
        SmartWatch reloj = new SmartWatch();

        celular.setMarca("Samsung");
        celular.setModelo("S23");
        celular.setColor("Rojo");
        celular.setPrecio(1200);
        celular.setDobleChip(true);
        celular.setRed("LTA+");

        reloj.setMarca("Sony");
        reloj.setModelo("techOne");
        reloj.setColor("Blanco");
        reloj.setPrecio(540);
        reloj.setFormato("redondo");

        System.out.println("Datos del Celular\n--------------------");
        System.out.println(celular.getMarca());
        System.out.println(celular.getModelo());
        System.out.println(celular.getColor());
        System.out.println(celular.getPrecio());
        System.out.println(celular.getRed());
        if(celular.isDobleChip()) System.out.println("Tiene doble chip");
        System.out.println("--------------------\nDatos del Reloj\n--------------------");
        System.out.println(reloj.getMarca());
        System.out.println(reloj.getModelo());
        System.out.println(reloj.getColor());
        System.out.println(reloj.getPrecio());
        System.out.println(reloj.getFormato());


    }
}