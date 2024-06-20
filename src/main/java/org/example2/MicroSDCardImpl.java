package org.example2;

public class MicroSDCardImpl implements MicroSDCard {

    private String data;

    @Override
    public String readMicroSD() {
        System.out.println("Leyendo desde la tarjeta MicroSD en formato hexadecimal");
        return this.data;
    }

    @Override
    public void writeMicroSD(String hexData) {
        System.out.println("Escribiendo en la tarjeta MicroSD en formato hexadecimal: " + hexData);
        this.data = hexData;
    }
}
