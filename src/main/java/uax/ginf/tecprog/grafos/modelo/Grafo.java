package uax.ginf.tecprog.grafos.modelo;

import java.util.*;

public class Grafo {
    private Map<Vertice, Set<Arista>> adyacencias;
    private boolean esDirigido;

    /**
     * constructor para crear un grafo
     * @param esDirigido atributo que nos ayuda a saber si el grafo es o no dirigido
     */
    public Grafo(boolean esDirigido) {
        this.esDirigido = esDirigido;
        this.adyacencias = new HashMap<>();
    }

    public void addVertice(Vertice vertice) {
        adyacencias.putIfAbsent(vertice, new HashSet<>());
    }

    public void addAristaPeso(Vertice origen, Vertice destino, double peso) {
        adyacencias.get(origen).add(new Arista(origen, destino, peso));
        if(!esDirigido) {
            adyacencias.get(destino).add(new Arista(destino, origen, peso));
        }
    }

    public void addArista(Vertice origen, Vertice destino ) {
        this.addAristaPeso(origen, destino, 1.0);
    }

    public void deleteArista(Vertice origen, Vertice destino ) {
        //obtener el conjunto de aristas del origen
        Set<Arista> aristas = adyacencias.get(origen);
        for (Arista arista: aristas){
            if (arista.getDestino().equals(destino)){
                aristas.remove(arista);
                break;
            }
        }
    }

    /*
    public void getAdyacentes(Vertice origen, Vertice destino ) {
        //
    }
    */

    public Set<Arista> getAdyacentes(Vertice origen){
        Set<Arista> aristas = adyacencias.get(origen);
        return aristas;
    }

    public void deleteVertice(Vertice vertice) {
        //
        adyacencias.remove(vertice);
        for (Vertice v: adyacencias.keySet()){
            Set<Arista> aristas = adyacencias.get(v);
            for (Arista a: aristas){
                if (a.getDestino().equals(vertice)){
                    aristas.remove(a);
                    break;
                }
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for( Map.Entry<Vertice, Set<Arista>> entry : adyacencias.entrySet() ){
            for( Arista arista : entry.getValue()) {
                builder.append(arista.getOrigen().getId())
                        .append(" -> ")
                        .append(arista.getDestino().getId())
                        .append(" [")
                        .append(arista.getPeso())
                        .append("]\n");
            }
        }
        return builder.toString();
    }

    public Map<Vertice, Set<Arista>> getAdyacencias() {
        return adyacencias;
    }

    public boolean isEsDirigido() {
        return esDirigido;
    }

}
