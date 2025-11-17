package org.iesalandalus.programacion.robot.modelo;


public record Zona(int ancho, int alto) {
    public static final int ANCHO_MINIMO = 0;
    public static final int ANCHO_MAXIMO = 100;
    public static final int ALTO_MINIMO = 0;
    public static final int ALTO_MAXIMO = 100;

    public Zona {
        validarAncho(ancho);
        validarAlto(alto);
    }

    public Zona() {
        this(ALTO_MINIMO, ANCHO_MINIMO);
    }

    public void validarAlto(int alto) {
        if (alto < ALTO_MINIMO) {
            throw new IllegalArgumentException("El valor de la y es mayor que el mínimo permitido");
        } else if (alto > ALTO_MAXIMO) {
            throw new IllegalArgumentException("El valor de la y es mayor que el máximo permitido");
        }
    }

    public void validarAncho(int ancho) {
        if (ancho < ANCHO_MINIMO) {
            throw new IllegalArgumentException("El valor de la x es menor que el mínimo permitido");
        } else if (ancho > ANCHO_MAXIMO) {
            throw new IllegalArgumentException("El valor de x es mayor que el máximo permitido");
        }
    }

    public Coordenada getCentro() {
        int centroX = ancho / 2;
        int centroY = alto / 2;
        return new Coordenada(centroX, centroY);
    }

    public boolean pertenece(Coordenada coordenada) {
        return perteneceX(coordenada.x()) && perteneceY(coordenada.y());
    }

    private boolean perteneceX(int x) {
        return x >= ANCHO_MINIMO && x <= ANCHO_MAXIMO;
    }

    private boolean perteneceY(int y) {
        return y >= ALTO_MINIMO && y <= ALTO_MAXIMO;
    }


}
