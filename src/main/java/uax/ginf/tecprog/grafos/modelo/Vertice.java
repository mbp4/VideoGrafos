package uax.ginf.tecprog.grafos.modelo;

import java.util.Objects;

public class Vertice {
    private String id; // Identificador único para el vértice
    private Object dato; // Permite almacenar la info asociada al vértice

    /**
     * Constructor para crear un nuevo vértice.
     * @param id El identificador único del vértice.
     * @param dato El dato asociado al vértice.
     */
    public Vertice(String id, Object dato) {
        this.id = id;
        this.dato = dato;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vertice vertice = (Vertice) o;
        return Objects.equals(dato, vertice.dato);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, dato);
    }

    @Override
    public String toString() {
        return "Vertice{" +
                "id='" + id + '\'' +
                ", dato=" + dato +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Object getDato() {
        return dato;
    }

    public void setDato(Object dato) {
        this.dato = dato;
    }
}
