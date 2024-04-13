package uax.ginf.tecprog.grafos.excepciones;

public class GrafoNoEncontradoExcepcion extends RuntimeException {
    /**
     * Constructor por defecto sin mensaje.
     */
    public GrafoNoEncontradoExcepcion() {
        super();
    }

    /**
     * Constructor que acepta un mensaje de error.
     *
     * @param mensaje El mensaje de error específico.
     */
    public GrafoNoEncontradoExcepcion(String mensaje) {
        super(mensaje);
    }

    /**
     * Constructor que acepta un mensaje de error y una causa.
     *
     * @param mensaje El mensaje de error específico.
     * @param causa La causa raíz de la excepción (otra excepción).
     */
    public GrafoNoEncontradoExcepcion(String mensaje, Throwable causa) {
        super(mensaje, causa);
    }

    /**
     * Constructor que acepta una causa.
     *
     * @param causa La causa raíz de la excepción (otra excepción).
     */
    public GrafoNoEncontradoExcepcion(Throwable causa) {
        super(causa);
    }
}
