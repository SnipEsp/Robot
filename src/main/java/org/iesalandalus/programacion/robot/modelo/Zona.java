package org.iesalandalus.programacion.robot.modelo;


public record Zona(int ancho, int alto) {
    public static final int ANCHO_MINIMO = 10;
    public static final int ANCHO_MAXIMO = 100;
    public static final int ALTO_MINIMO = 10;
    public static final int ALTO_MAXIMO = 100;

    public Zona {
        validarAncho(ancho);
        validarAlto(alto);
    }

    public Zona() {
        this(ANCHO_MINIMO, ALTO_MINIMO);
    }

    public void validarAlto(int alto) {
        if (alto < ALTO_MINIMO) {
            throw new RobotExcepcion("Alto no válido.");
        } else if (alto > ALTO_MAXIMO) {
            throw new RobotExcepcion("Alto no válido.");
        }
    }

    public void validarAncho(int ancho) {
        if (ancho < ANCHO_MINIMO) {
            throw new RobotExcepcion("Ancho no válido.");
        } else if (ancho > ANCHO_MAXIMO) {
            throw new RobotExcepcion("Ancho no válido.");
        }
    }

    public Coordenada getCentro() {
        int centroX = ancho / 2;
        int centroY = alto / 2;
        return new Coordenada(centroX, centroY);
    }

    public boolean pertenece(Coordenada coordenada) {
        if (coordenada == null) {
            throw new NullPointerException("La coordenada no puede ser nula.");
        }
        return perteneceX(coordenada.x()) && perteneceY(coordenada.y());
    }

    private boolean perteneceX(int x) {
        return x >= 0 && x < ancho;
    }

    private boolean perteneceY(int y) {
        return y >= 0 && y < alto;
    }

}
