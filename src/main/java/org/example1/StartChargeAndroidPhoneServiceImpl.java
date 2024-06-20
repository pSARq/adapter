package org.example1;

/*Esta implementacion no es necesaria, sino que es para simular mas funcionalidades que puede ser que ya existan
 * en la aplicación antes de agregar los cambios y que esten adaptadas para funcionar con lo que existe hasta el momento*/
public class StartChargeAndroidPhoneServiceImpl implements StartChargeAndroidPhoneService {
    @Override
    public void startCharge(AndroidCharger androidCharger) {
        System.out.println("Iniciando la carga del teléfono");
        /*Aqui podria contener mas lógica*/
        androidCharger.chargeAndroidPhone();
    }
}
