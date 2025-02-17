public class ObjLibro {

    private String titulo;
    private String autor;
    private int precio;

    public ObjLibro(){
        
    }

    public ObjLibro(String titulo, int precio, String autor) {

        this.titulo = titulo;
        this.precio = precio;
        this.autor = autor;
        
    }

    public String getTitulo() {

        return titulo;

    }

    public void setTitulo(String titulo) {

        this.titulo = titulo;

    }

    public int getPrecio() {

        return precio;

    }

    public void setPrecio(int precio) {

        this.precio = precio;

    }

    public String getAutor() {

        return autor;

    }

    public void setAutor(String autor) {

        this.autor = autor;

    }

}