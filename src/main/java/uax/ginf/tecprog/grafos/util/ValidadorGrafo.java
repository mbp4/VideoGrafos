package uax.ginf.tecprog.grafos.util;

import uax.ginf.tecprog.grafos.modelo.Grafo;
import uax.ginf.tecprog.grafos.modelo.Vertice;

/**
 * Se ocupa de diversas validaciones sobre el grafo
 */
public class ValidadorGrafo {

    /**
     * Verifica si un vértice específico existe en el grafo.
     *
     * @param grafo El grafo donde se buscará el vértice.
     * @param vertice El vértice a buscar.
     * @return true si el vértice existe, false en caso contrario.
     */
    public static boolean existeVertice(Grafo grafo, Vertice vertice) {
        return grafo.getAdyacencias().containsKey(vertice);
    }

    /**
     * Verifica si el grafo está vacío (sin vértices).
     *
     * @param grafo El grafo a verificar.
     * @return true si el grafo está vacío, false si tiene al menos un vértice.
     */
    public static boolean esGrafoVacio(Grafo grafo) {
        return grafo.getAdyacencias().isEmpty();
    }

    // Aquí debes agregar más métodos
}
