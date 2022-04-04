package somosptnchallenge.entities;


public class Shampoo extends Producto{

    protected Integer contenido;

    public Shampoo() {
        super();
    }

    public Shampoo(String nombre, Integer contenido, Integer precio) {
        super(nombre, precio);
        this.contenido = contenido;
    }

    public Integer getContenido() {
        return contenido;
    }

    public void setContenido(Integer contenido) {
        this.contenido = contenido;
    }

    @Override
    public String toString() {
        return "Nombre: " + super.nombre + " /// Contenido: " + contenido + "ml /// Precio: $" + super.precio;
    }
    
    
}
