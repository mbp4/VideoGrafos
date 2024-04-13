package uax.ginf.tecprog.grafos.algoritmos;

public class BFS {
    /*
    BFS(grafo, nodoInicio)
    crear una cola, Q
    marcar nodoInicio como visitado y encolarlo en Q
    mientras Q no esté vacía
        nodoActual = Q.desencolar()
        visitar nodoActual

        para cada nodo vecino, V, de nodoActual en el grafo
            si V no ha sido visitado
                marcar V como visitado y encolarlo en Q

     */
    /*
    Explicación:

    Inicialización: Comienzas creando una cola Q y marcas el nodo de inicio como visitado, después lo encolas en Q.

    Procesamiento de la cola: Mientras la cola no esté vacía, continuas desencolando un nodo de Q para procesarlo (por ejemplo, imprimirlo o realizar alguna operación).

    Explorar vecinos: Para cada nodo desencolado, exploras todos sus nodos vecinos. Si un vecino no ha sido visitado, lo marcas como visitado (esto previene que el nodo sea revisado y encolado nuevamente) y lo encolas en Q.

    Terminación: El algoritmo termina cuando la cola Q está vacía, lo que significa que todos los nodos accesibles desde el nodo de inicio han sido visitados.

Aplicaciones de BFS:

    Encontrar el camino más corto en grafos no ponderados.
    Niveles de separación, como en el problema de los seis grados de separación, donde BFS puede ser utilizado para encontrar el camino más corto entre dos personas en una red social.
    Algoritmos de pintura por inundación, utilizados en programas de edición de imágenes para determinar el área conectada a un punto dado.

Consideraciones:

    Para rastrear si un nodo ha sido visitado, usualmente se utiliza una estructura de datos como un conjunto o un arreglo de booleanos.
    La elección del nodo de inicio puede afectar partes del grafo exploradas por BFS, especialmente en grafos no conexos.
    Para grafos ponderados, donde estás interesado en el camino más corto por peso en lugar de por número de aristas, considera usar el algoritmo de Dijkstra o A*.
     */
}
