package co.edu.uniquindio.poo.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.logging.Logger;

class BatallonTest {
    private static final Logger LOG = Logger.getLogger(BatallonTest.class.getName());

    @Test
    void VerificarSoldadosR() {

        LOG.info("Se ha iniciado la prueba");
        Batallon batallon = new Batallon("10", "Barca", "Cataluña");

        Soldado soldado1 = new Soldado("9", "Cabo", "Robert", "Diaz", 36 );
        Soldado soldado2 = new Soldado("19", "Sargento", "Yamal", "Lamine", 17 );
        Soldado soldado3 = new Soldado("11", "Capitan", "Raphina", "Len", 28 );
        batallon.agregarSoldado(soldado1);
        batallon.agregarSoldado(soldado2);
        batallon.agregarSoldado(soldado3);

        ArrayList<Soldado> SoldadosR = batallon.obtenerSoldadosR();
        ArrayList<Soldado> aux = new ArrayList<>();
        aux.add(soldado1);
        aux.add(soldado3);
        assertEquals(aux, SoldadosR);
        LOG.info("Se ha terminado la prueba");
    }

    @Test
    void verificarRegistrarMision() {

        LOG.info("Se ha iniciado la prueba");
        Vehiculo rayoMcqueen = new TrasnporteTropas("2021", "Camion","2023", 0,EstadoOperativo.MISION,1);
        Mision mision = new Mision("23","2024", "Caracas");
        rayoMcqueen.registrarMision(mision);
        assertEquals(1, rayoMcqueen.getNumeroMisiones());
        LOG.info("Se termino la prueba");
    }

    @Test
    void verificarRegistrarSoldado(){

        LOG.info("Se ha iniciado la prueba");
        Batallon marina = new Batallon("2345","Marina","Cauca");
        Soldado soldado = null;
        assertThrows(Throwable.class, ()-> marina.registrarSoldado2(soldado));
        LOG.info("Se ha terminado la prueba");
    }
    @Test
    void verificarRegistrarKilometraje(){

        LOG.info("Se ha iniciado la prueba");
        TrasnporteTropas messi = new TrasnporteTropas("2021", "Camion","2023", 0,EstadoOperativo.MISION,1);
        assertThrows(Throwable.class, ()-> messi.agregarKilometraje(-100));
        LOG.info("Se ha terminado la prueba");
    }

    @Test
    void verificarVehiculosDisponibles(){

        LOG.info("Se ha iniciado la prueba");
        Batallon manchesterCity = new Batallon("1823","Manchester City", "Manchester");
        Vehiculo rayoMcqueen = new TrasnporteTropas("2021", "Camion","2023", 0,EstadoOperativo.DISPONIBLE,1);
        Vehiculo vehiculo2 = new Blindado("34", "BMW", "1987", EstadoOperativo.MISION, 0, "Alto");
        Vehiculo vehiculo3 = new Blindado("35", "Camaro", "2020", EstadoOperativo.DISPONIBLE, 0, "Alto");

        manchesterCity.agregarVehiculo(rayoMcqueen);
        manchesterCity.agregarVehiculo(vehiculo2);
        manchesterCity.agregarVehiculo(vehiculo3);

        ArrayList<Vehiculo> vehiculosDisponibles = manchesterCity.obtenerVehiculosDisponibles();

        ArrayList<Vehiculo> aux = new ArrayList<>();
        aux.add(rayoMcqueen);
        aux.add(vehiculo3);

        assertEquals(aux, vehiculosDisponibles);
        LOG.info("Se ha terminado la prueba");

    }

    @Test
    void verificarApoyoMedico(){

        LOG.info("Se ha iniciado la prueba");
        Batallon batallon = new Batallon("10", "Barca", "Cataluña");
        Vehiculo vehiculo1 = new TrasnporteTropas("2021", "Camion","2023", 0,EstadoOperativo.DISPONIBLE,1);
        Vehiculo vehiculo2 = new Blindado("34", "BMW", "1987", EstadoOperativo.MISION, 0, "Alto");
        Vehiculo vehiculo3 = new Blindado("35", "Camaro", "2020", EstadoOperativo.DISPONIBLE, 0, "Alto");
        Vehiculo vehiculo4 = new Apoyo ("456", "Ambulancia", "1999", EstadoOperativo.DISPONIBLE, 0, Funcion.MEDICO);
        Vehiculo vehiculo5 = new Apoyo ("457", "Ambulancia", "2010", EstadoOperativo.DISPONIBLE, 0, Funcion.MEDICO);
        Vehiculo vehiculo6 = new Apoyo ("400", "JEEP", "2011", EstadoOperativo.DISPONIBLE, 0, Funcion.LOGISTICA);

        batallon.agregarVehiculo(vehiculo1);
        batallon.agregarVehiculo(vehiculo2);
        batallon.agregarVehiculo(vehiculo3);
        batallon.agregarVehiculo(vehiculo4);
        batallon.agregarVehiculo(vehiculo5);
        batallon.agregarVehiculo(vehiculo6);

        ArrayList<Apoyo> apoyoMedico = batallon.obtenerApoyoTipoMedico();
        ArrayList<Apoyo> aux = new ArrayList<>();
        aux.add((Apoyo) vehiculo6);

        assertNotEquals(aux,apoyoMedico);
        LOG.info("Se ha terminado la prueba");
    }

    @Test
    void verificarCambioEstadoOperativo(){

        LOG.info("Se ha iniciado la prueba");
        Vehiculo vehiculo1 = new Blindado("35", "Camaro", "2020", EstadoOperativo.DISPONIBLE, 0, "Alto");
        vehiculo1.setEstadoOperativo(EstadoOperativo.MISION);
        assertNotEquals(EstadoOperativo.DISPONIBLE, vehiculo1.getEstadoOperativo());
        LOG.info("Se ha terminado la prueba");

    }

    @Test
    void verrificarSumarKilometraje(){
        
        LOG.info("Se ha iniciado la prueba");
        Vehiculo vehiculo1 = new Blindado("35", "Camaro", "2020", EstadoOperativo.DISPONIBLE, 0, "Alto");
        float cantidad1 = 49.5F;
        float cantidad2 = 50.5F;
        vehiculo1.sumarKilometraje(cantidad1, cantidad2);
        assertEquals(100.0F, vehiculo1.getKilometraje());
        LOG.info("Se ha terminado la prueba");

    }






}