package org.example1;

/*Este tambien es codigo nuevo pero es lo necesario para hacer la adaptacion de la logica ya existente con la nueva
* logica que se esta agregando*/
public class AndroidChargerAdapter implements AndroidCharger {

    private IphoneCharger iphoneCharger;

    public AndroidChargerAdapter(IphoneCharger iphoneCharger) {
        this.iphoneCharger = iphoneCharger;
    }

    @Override
    public void chargeAndroidPhone() {
        /*Aqui se agrega toda la logica necesaria para adaptar la interfaz que se implementa con la que se inyecta.
        * En este caso como es un ejemplo sencillo no hay mucha logica. Solo es para ver la estructura del patron de diseño.
        * (ver ejemplo 2 para ver un ejemplo de un adapter mas parecido a lo que en realidad se usa)
        * Solo se agrega una adaptación para que el cargador de android pueda cargar un iphone.*/
        iphoneCharger.chargeIphone();
    }
}
