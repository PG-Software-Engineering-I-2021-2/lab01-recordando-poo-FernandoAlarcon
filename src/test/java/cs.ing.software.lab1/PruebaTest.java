package cs.ing.software.lab1;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PruebaTest {

    @Test
    public void Test00(){
        Vehiculo nissan = new Vehiculo(10, 5, 6);
        Assert.assertEquals(nissan.imprimirViaje(15), "El viaje es de 15.0");
    }

    @Test
    public void Test01(){
        Vehiculo nissan = new Vehiculo(10, 5, 6);
        Assert.assertEquals(nissan.consumo,10);
    }

    @Test
    public void Test02(){
        Vehiculo nissan = new Vehiculo(10, 5, 6);
        Assert.assertEquals(nissan.capacidad,5);
    }

    @Test
    public void Test03(){
        Vehiculo nissan = new Vehiculo(10, 5, 6);
        Assert.assertEquals(nissan.cantidad,6);
    }

    @Test
    public void Test04(){
        Automovil toyota = new Automovil(15,8,25);
        Assert.assertEquals(toyota.imprimirViaje(8),"Vehiculo necesita reabastecmiento de combustible");
    }

    @Test
    public void Test05(){
        Automovil toyota = new Automovil(8,8,85);
        Assert.assertEquals(toyota.imprimirViaje(8),"El vehiculo viajo: 8.0 Km y aun tiene 21.0 de combustible");
    }

    @Test
    public void Test06(){
        Camion volvo = new Camion(5,50,200);
        Assert.assertEquals(volvo.imprimirViaje(7),"El camion viajo: 7.0 Km y aun tiene 60,02 de combustible");
    }

    /*@Test(invocationCount=80, threadPoolSize=80)*/
    @Test()
    public void Test07(){
        Camion volvo = new Camion(20,30,200);
        Assert.assertEquals(volvo.imprimirViaje(150),"camion necesita reabastecmiento de combustible");
    }

    @Test()
    public void Test08(){
        Automovil nissan = new Automovil(15,50,40);
        Assert.assertEquals(nissan.reabastecer(10),"Se ha agregado 10.0 litros al automovil");
    }


    @Test(invocationCount=80, threadPoolSize=80)
    public void Test09(){
        Camion volvo = new Camion(25,80,65);
        Assert.assertEquals(volvo.reabastecer(15),"Se ha agregado 15.0 litros al camion");
    }


    @Test()
    public void Test10(){
        Vehiculo vehiculo = new Vehiculo(8,24,16);
        Assert.assertEquals(vehiculo.reabastecer(5),"Se ha agregado 5.0 litros al vehiculo");
    }

    @Test()
    public void Test11(){
        Vehiculo vehiculo = new Vehiculo(8,24,16);
        Assert.assertEquals(vehiculo.cantidadCombustible(),16.0);
    }

    @Test()
    public void Test12(){
        Vehiculo vehiculo = new Vehiculo(8,24,16);
        Assert.assertEquals(vehiculo.consumoCombustible(),8.0);
    }

    @Test()
    public void Test13(){
        Vehiculo vehiculo = new Vehiculo(8,24,16);
        Assert.assertEquals(vehiculo.capacidadCombustible(),24.0);
    }

    @Test()
    public void Test14(){
        Automovil nissan = new Automovil(8,24,16);
        Assert.assertEquals(nissan.cantidadCombustible(),21.0);
    }

    @Test()
    public void Test15(){
        Automovil nissan = new Automovil(8,24,16);
        Assert.assertEquals(nissan.consumoCombustible(),13.0);
    }

    @Test()
    public void Test16(){
        Automovil nissan = new Automovil(8,24,16);
        Assert.assertEquals(nissan.capacidadCombustible(),29.0);
    }

    @Test()
    public void Test17(){
        Camion volvo = new Camion(8,24,16);
        Assert.assertEquals(volvo.cantidadCombustibleCamion(),23.0);
    }

    @Test()
    public void Test18(){
        Camion volvo = new Camion(8,24,16);
        Assert.assertEquals(volvo.consumoCombustibleCamion(),15.0);
    }

    @Test()
    public void Test19(){
        Camion volvo = new Camion(8,24,16);
        Assert.assertEquals(volvo.capacidadCombustibleCamion(),31.0);
    }
}
