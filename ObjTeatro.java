public class ObjTeatro {

    private int numero;
    private int fila;
    private int precio;

    public ObjTeatro(){
        
    }

    public ObjTeatro(int numero, int fila, int precio) {

        this.numero = numero;
        this.fila = fila;
        this.precio = precio;
        
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

}