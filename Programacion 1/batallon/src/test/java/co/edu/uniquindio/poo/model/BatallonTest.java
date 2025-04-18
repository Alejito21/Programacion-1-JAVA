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
        Vehiculo rayoMcqueen = new TrasnporteTropas("2021", "Camion","2023", 234,0, EstadoOperativo.MISION,1);
        Mision mision = new Mision("23","2024", "Caracas");
        rayoMcqueen.registrarMision(mision);
        assertEquals(1, rayoMcqueen.getNumeroMisiones());
        LOG.info("Se termino la prueba");
    }


}