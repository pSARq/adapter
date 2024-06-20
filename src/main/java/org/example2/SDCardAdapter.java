package org.example2;

import java.nio.charset.StandardCharsets;

/*Aqui ya hay mas logica que en el ejemplo 1.
 * SDCard maneja datos en UTF-8 mientras que MicroSDCard maneja datos en hexadecimal*/
public class SDCardAdapter implements SDCard {

    private final MicroSDCard microSDCard;

    public SDCardAdapter(MicroSDCard microSDCard) {
        this.microSDCard = microSDCard;
    }

    @Override
    public String readSD() {
        /*Aqui lee los datos en hexadecimal y hace la adaptación para que este metodo retorne los datos en UTF-8*/
        String hexData = microSDCard.readMicroSD();
        byte[] bytes = hexStringToByteArray(hexData);
        return new String(bytes, StandardCharsets.UTF_8);
    }

    @Override
    public void writeSD(String data) {
        /*Aqui recibe los datos en UTF-8 y los adapta para escribirlos en hexadecimal*/
        byte[] bytes = data.getBytes(StandardCharsets.UTF_8);
        String hexData = byteArrayToHexString(bytes);
        microSDCard.writeMicroSD(hexData);
    }

    private byte[] hexStringToByteArray(String s) {
        int len = s.length();
        byte[] data = new byte[len / 2];
        for (int i = 0; i < len; i += 2) {
            data[i / 2] = (byte) ((Character.digit(s.charAt(i), 16) << 4)
                    + Character.digit(s.charAt(i+1), 16));
        }
        return data;
    }

    private String byteArrayToHexString(byte[] bytes) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bytes) {
            sb.append(String.format("%02X", b));
        }
        return sb.toString();
    }
}
