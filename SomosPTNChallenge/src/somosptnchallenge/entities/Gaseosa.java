package somosptnchallenge.entities;


public class Gaseosa extends Producto{

    protected Double cantidadLitros;

    public Gaseosa() {
        super();
    }

    public Gaseosa(String nombre, Double cantidadLitros, Integer precio) {
        super(nombre, precio);
        this.cantidadLitros = cantidadLitros;
    }

    public Double getCantidadLitros() {
        return cantidadLitros;
    }

    public void setCantidadLitros(Double cantidadLitros) {
        this.cantidadLitros = cantidadLitros;
    }

    @Override
    public String toString() {
        return "Nombre: " + super.nombre + " /// Litros: " + cantidadLitros + " /// Precio: $" + super.precio;
    }
    
}
