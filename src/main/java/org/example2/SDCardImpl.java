package org.example2;

public class SDCardImpl implements SDCard {

    private String data;

    @Override
    public String readSD() {
        System.out.println("Leyendo desde la tarjeta SD en formato UTF-8");
        return this.data;
    }

    @Override
    public void writeSD(String data) {
        System.out.println("Escribiendo en la tarjeta SD en formato UTF-8: " + data);
        this.data = data;
    }
}
