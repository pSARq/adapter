package org.example2;

public class Main {
    public static void main(String[] args) {
        SDCard sdCard = new SDCardImpl();
        MicroSDCard microSDCard = new MicroSDCardImpl();

        // Usando la tarjeta SD directamente
        sdCard.writeSD("Esta es la información que se ingresa a la tarjeta SD");
        System.out.println("Datos leídos de la tarjeta SD: " + sdCard.readSD());

        // Usando el adaptador para leer y escribir en una tarjeta MicroSD con un lector de tarjetas SD
        SDCard sdCardAdapter = new SDCardAdapter(microSDCard);
        sdCardAdapter.writeSD("Esta es la información que se ingresa a la tarjeta MicroSD");
        System.out.println("Datos leídos de MicroSD a través del adaptador: " + sdCardAdapter.readSD());

        // Verificando los valores almacenados directamente en MicroSDCardImpl
        System.out.println("Datos leídos directamente de MicroSD: " + microSDCard.readMicroSD());

        /*Como se puede ver a pesar de que SDCard y MicroSDCard manejan la data en diferentes tipos de formatos
        * el adapter es capaz de transformar la información ya sea para escribir o leer*/
    }
}
