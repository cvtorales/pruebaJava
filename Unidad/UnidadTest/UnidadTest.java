
import TP2.Unidad.Casillero;
import TP2.Unidad.NoSePuedeAvanzarAUnCasilleroOcupadoException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;

public class UnidadTest {

    @Test
    public void test01UnidadMovibleSemueveDesdeB2HastaB3() {
        String unaPosicion = "B2";
        String otraPosicion = "B1";
        Soldado soldado = new Soldado();

        soldado.setPosicion(unaPosicion);
        soldado.avanzar(otraPosicion);

        assertEquals(soldado.getPosicion() , "B1" );

    }

    @Test
    public void test02UnidadMovibleSeMueveDesdeB2HastaA2() {
        String unaPosicion = "B2";
        String otraPosicion = "A2";
        Soldado soldado = new Soldado();

        soldado.setPosicion(unaPosicion);
        soldado.avanzar(otraPosicion);

        assertEquals(soldado.getPosicion(), "A2");
    }

    @Rule
    public ExpectedException thrown = ExpectedException.none();
    @Test
    public void testUnidadMovibleIntentaMoverseAUnCasilleroOcupadoYVuelveASuPosicion() {
        String unaPosicion = "B2";
        String unaPosicionOcupada = "B3";
        Soldado soldado = new Soldado();

        soldado.setPosicion(unaPosicion);
        thrown.expect(NoSePuedeAvanzarAUnCasilleroOcupadoException.class);
        soldado.avanzar(unaPosicionOcupada);

        assertEquals(soldado.getPosicion(), "B2");
    }

    @Test
    public void testUnSoldadoAliadoAtacaAUnSoldadoEnemigoCercanoYElSoldadoEnemigoPierde10PuntosDeVida() {

        String unaPosicion = "B2";
        String unaPosicionCercana = "B1";
        Soldado soldadoAliado = new Soldado();
        Soldado soldadoEnemigo = new Soldado();
        soldadoAliado.setPosicion(unaPosicion);
        soldadoEnemigo.setPosicion(unaPosicionCercana);

        soldadoAliado.atacar(soldadoEnemigo);

        assertEquals(soldadoEnemigo.getVida(), 90);
    }



}