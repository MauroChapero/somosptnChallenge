package somosptnchallenge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import somosptnchallenge.entities.Fruta;
import somosptnchallenge.entities.Gaseosa;
import somosptnchallenge.entities.Producto;
import somosptnchallenge.entities.Shampoo;
import static somosptnchallenge.entities.enumeraciones.UnidadDeVenta.KILO;

public class SomosPTNChallenge {

    public static void main(String[] args) {

        List<Producto> listaProductos = guardarProductosLista();

        for (Producto foreProducto : listaProductos) {
            System.out.println(foreProducto);
        }

        System.out.println("=============================");

        Collections.sort(listaProductos);
        System.out.println("Producto mas caro: " + listaProductos.get(0).getNombre());

        Collections.sort(listaProductos, Collections.reverseOrder());
        System.out.println("Producto mas barato: " + listaProductos.get(0).getNombre());
    }

    private static List<Producto> guardarProductosLista() {
        
        List<Producto> listaProductos = new ArrayList();
        //C
        Producto cocaColaZero = new Gaseosa("Coca-Cola Zero", 1.5, 20);
        Producto cocaColaOriginal = new Gaseosa("Coca-Cola", 1.5, 18);
        Producto sedal = new Shampoo("Shampoo Sedal", 500, 19);
        Producto frutilla = new Fruta("Frutilla", 64, KILO);
        
        listaProductos.add(cocaColaZero);
        listaProductos.add(cocaColaOriginal);
        listaProductos.add(sedal);
        listaProductos.add(frutilla);
        
        return listaProductos;

    }
}
