package org.iesalandalus.programacion.robot.modelo;

public class Robot {

    public Robot() {
    }

    public Robot(Zona zona) {
    }

    public Robot(Zona zona, Orientacion orientacion) {
    }

    public Robot(Zona zona, Orientacion orientacion, Coordenada coordenada) {
    }

    public Robot(Robot robot) {
    }

    public Zona getZona() {
        return new Zona();
    }

    private void setZona(Zona zona) {
    }

    public Enum<Orientacion> getOrientacion(Orientacion orientacion) {
        return orientacion;
    }

    private void setOrientacion(Orientacion orientacion) {

    }

    public Coordenada getCoordenada() {
        return new Coordenada(Zona.ANCHO_MINIMO, Zona.ALTO_MINIMO);
    }

    private void setCoordenada(Coordenada coordenada) {
    }

    public void avanzar() {
    }

    public void girarALaDerecha() {
    }

    public void girarALaIzquierda() {
    }


    @Override
    public String toString() {
        return "Robot{}";
    }
}
