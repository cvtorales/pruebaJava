import TP2.Unidad.Casillero;
import TP2.Unidad.NoSePuedeAvanzarAUnCasilleroOcupadoException;

public class Soldado {
    
    private String posicion = "";
    private int vida = 100;
    private int danioCuerpoACuerpo = 10;
    private int danioADistancia = 0;
    private Casillero casillero;

    public void setPosicion(String unaPosicion) {
        this.posicion = unaPosicion;
    }


    public void avanzar(String otraPosicion) throws NoSePuedeAvanzarAUnCasilleroOcupadoException {

       Casillero nuevoCasillero =  this.casillero.obtenerSiguienteEnDireccion(otraPosicion);
        if(nuevoCasillero.estaOcupado()){

            throw new NoSePuedeAvanzarAUnCasilleroOcupadoException();
        }


   /*     if (!otraPosicion.equals("B3")) {
            this.setPosicion(otraPosicion);
        }  */
    }
    public String getPosicion() {
        return this.posicion;
    }

    public void atacar(Soldado soldadoEnemigo) {

        soldadoEnemigo.recibirDanio(this.danioCuerpoACuerpo);
    }

    private void recibirDanio(int unDanio) {
        this.vida = this.vida - unDanio;
    }

    public int getVida() {
        return this.vida;
    }
}
