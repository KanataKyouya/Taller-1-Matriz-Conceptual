public class ObjProducto {

    private String nombre;
    private int cantidad;
    private int precio;

    public ObjProducto(){
        
    }

    public ObjProducto(String nombre, int precio, int cantidad) {

        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        
    }

    public String getNombre() {

        return nombre;

    }

    public void setNombre(String nombre) {

        this.nombre = nombre;

    }

    public int getPrecio() {

        return precio;

    }

    public void setPrecio(int precio) {

        this.precio = precio;

    }

    public int getCantidad() {

        return cantidad;

    }

    public void setCantidad(int cantidad) {

        this.cantidad = cantidad;

    }

}