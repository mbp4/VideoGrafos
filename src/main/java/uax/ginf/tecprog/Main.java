package uax.ginf.tecprog;

import uax.ginf.tecprog.grafos.modelo.Arista;
import uax.ginf.tecprog.grafos.modelo.Grafo;
import uax.ginf.tecprog.grafos.modelo.Vertice;

import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Grafo g = new Grafo(true);
        Vertice vMadrid = new Vertice("1", "Madrid");
        Vertice vSalamanca = new Vertice("2", "Salamanca");
        Vertice vACoruna = new Vertice("3", "A Coruña");
        Vertice vSevilla = new Vertice("4", "Sevilla");
        g.addVertice(vMadrid);
        g.addVertice(vACoruna);
        g.addVertice(vSalamanca);
        g.addVertice(vSevilla);

        g.addAristaPeso(vMadrid, vSalamanca, 50);
        g.addAristaPeso(vSalamanca,vACoruna,20);
        g.addAristaPeso(vMadrid,vACoruna,80);
        g.addAristaPeso(vMadrid, vSevilla, 15);
        g.addAristaPeso(vSevilla,vMadrid,30);
        g.addAristaPeso(vACoruna,vSevilla, 100);

        System.out.println(g);

        g.deleteArista(vMadrid, vACoruna);
        System.out.println("Prueba eliminacion arista");
        System.out.println(g);

        Set<Arista> aristasMadrid = g.getAdyacentes(vMadrid);
        for (Arista arista: aristasMadrid){
            System.out.println(arista);
        }

        g.deleteVertice(vMadrid);
        System.out.println(g);

    }
}