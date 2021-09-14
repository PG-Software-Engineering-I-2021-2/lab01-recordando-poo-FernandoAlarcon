package cs.ing.software.lab1;
public class Vehiculo {

    double consumo;
    double capacidad;
    double cantidad;

    Vehiculo(double consumo1, double capacidad1, double cantidad1){
        consumo = consumo1;
        capacidad = capacidad1;
        cantidad = cantidad1;
    }

    String imprimirViaje(double viaje){
        return "El viaje es de " + viaje;
    }

    String reabastecer(double combustible) {
        this.cantidad += combustible;
        return "Se ha agregado " + combustible + " litros al vehiculo";
    }

    double cantidadCombustible(){
        return this.cantidad;
    }

    double consumoCombustible(){
        return this.consumo;
    }

    double capacidadCombustible(){
        return this.capacidad;
    }

}
