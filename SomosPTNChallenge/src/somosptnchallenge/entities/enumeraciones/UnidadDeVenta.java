package somosptnchallenge.entities.enumeraciones;


public enum UnidadDeVenta {

    KILO("kilo"), LITRO("litro"), METRO("metro");
    
    private String nombre;
    
    private UnidadDeVenta(String nombre){
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
}
