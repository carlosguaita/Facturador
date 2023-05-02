public class Producto {
    private String nombre;
    private double precio;
    private  double precioXMayor;
    private  int unidadesXMayor;
    private  int cantidad;

    public Producto(String nombre, double precio, double precioXMayor, int unidadesXMayor, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.precioXMayor = precioXMayor;
        this.unidadesXMayor = unidadesXMayor;
        this.cantidad = cantidad;
    }
    public Producto(){
        this.precio=0;
        this.precioXMayor=0;
        this.unidadesXMayor=0;
        this.cantidad=0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        if (this.cantidad>=this.unidadesXMayor){
            return precioXMayor;
        }
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getPrecioXMayor() {
        return precioXMayor;
    }

    public void setPrecioXMayor(double precioXMayor) {
        this.precioXMayor = precioXMayor;
    }

    public int getUnidadesXMayor() {
        return unidadesXMayor;
    }

    public void setUnidadesXMayor(int unidadesXMayor) {
        this.unidadesXMayor = unidadesXMayor;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double obtenerTotal(){
        double total = this.cantidad*this.getPrecio();
        return total;
    }
}
