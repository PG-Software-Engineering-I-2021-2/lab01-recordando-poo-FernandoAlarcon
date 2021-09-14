package cs.ing.software.lab1;

public class Automovil extends Vehiculo {

    Automovil(double consumo, double capacidad, double cantidad){
        super(consumo,capacidad,cantidad);
    }

    @Override
    String imprimirViaje(double viaje) {
        double consumoViaje = viaje * consumo;
        double remanenteFuel = cantidad - consumoViaje;

        if(remanenteFuel > 0) {
            return "El vehiculo viajo: " + viaje + " Km y aun tiene " + remanenteFuel + " de combustible";
        }else{
            return "Vehiculo necesita reabastecmiento de combustible";
        }
    }

    @Override
    String reabastecer(double combustible) {
        this.cantidad += combustible;
        return "Se ha agregado " + combustible + " litros al automovil";
    }

    @Override
    double cantidadCombustible(){
        return this.cantidad + 5.0;
    }

    @Override
    double consumoCombustible(){
        return this.consumo + 5.0;
    }

    @Override
    double capacidadCombustible(){
        return this.capacidad + 5.0;
    }
}
