package cs.ing.software.lab1;
public class Camion extends Vehiculo{

    Camion(double consumo, double capacidad, double cantidad){
        super(consumo,capacidad,cantidad);
    }
    @Override
    String imprimirViaje(double viaje) {
        double consumoViaje = viaje * consumo;
        double remanenteFuel = 1*(capacidad/100)+(cantidad-1)*(capacidad/100)*0.95 - consumoViaje;

        if(remanenteFuel > 0) {
            return "El camion viajo: " + viaje + " Km y aun tiene " + String.format("%.2f", remanenteFuel) + " de combustible";
        }else{
            return "camion necesita reabastecmiento de combustible";
        }
    }

    @Override
    String reabastecer(double combustible) {
        this.cantidad += combustible;
        return "Se ha agregado " + combustible + " litros al camion";
    }

    double cantidadCombustibleCamion(){
        return this.cantidad + 7.0;
    }

    double consumoCombustibleCamion(){
        return this.consumo + 7.0;
    }

    double capacidadCombustibleCamion(){
        return this.capacidad + 7.0;
    }

}
