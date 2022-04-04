package somosptnchallenge.entities;

import somosptnchallenge.entities.enumeraciones.UnidadDeVenta;

public class Fruta extends Producto {

    protected UnidadDeVenta unidadDeVenta;

    public Fruta() {
    }

    public Fruta(String nombre, Integer precio, UnidadDeVenta unidadDeVenta) {
        super(nombre, precio);
        this.unidadDeVenta = unidadDeVenta;
    }

    public UnidadDeVenta getUnidadDeVenta() {
        return unidadDeVenta;
    }

    public void setUnidadDeVenta(UnidadDeVenta unidadDeVenta) {
        this.unidadDeVenta = unidadDeVenta;
    }

    @Override
    public String toString() {
        return "Nombre: " + super.nombre + " /// Precio: $" + super.precio + " /// Unidad de venta: " + unidadDeVenta;
    }

}
