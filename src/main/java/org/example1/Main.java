package org.example1;

public class Main {
    public static void main(String[] args) {
        /*El patron adapter es usado para adaptar código ya existente a algo nuevo que se esta haciendo.*/
        /*En este caso suponiendo que tengo un código para cargar telefonos android*/
        AndroidCharger androidCharger = new AndroidPhoneCharger();
        StartChargeAndroidPhoneService startChargeAndroidPhoneService = new StartChargeAndroidPhoneServiceImpl();
        startChargeAndroidPhoneService.startCharge(androidCharger);

        /*Ahora digamos que queremos agregar un iphone. En ese caso para que funcione se debe de adaptar para poder
        cargar con lo que ya esta existente para evitar que algo se dañe*/
        IphoneCharger iphoneCharger = new IphoneChargerImpl();
        AndroidCharger androidChargerAdapter = new AndroidChargerAdapter(iphoneCharger);
        startChargeAndroidPhoneService.startCharge(androidChargerAdapter);

        /*Se puede evidenciar que aunque uno es un AndroidCharger que consume el servicio y el otro es un IphoneCharger
        * luego del adapter se vuelve tambien un AndroidCharger lo cual permite consumir el mismo servicio y asi
        * se logra adaptar lo nuevo a lo que ya esta funcionando, tambien se puede hacer al revez, es decir, depronto se esta devolviendo
        * un resultado o un objeto y si estoy tratando de consumir un externo (libreria, API, etc) que no es compatible con eso
        * que estoy devolviendo, entonces se puede adaptar para que si sea compatible y asi poder consumir el externo sin tener que modificar
        * lo que ya tengo */

    }
}