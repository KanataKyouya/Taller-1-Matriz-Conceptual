public class Principal {
    
    static Metodos met = new Metodos();
    static ObjProducto ObjP = new ObjProducto();
    static ObjLibro ObjL = new ObjLibro();
    static ObjTeatro ObjT = new ObjTeatro();
    static clsGenerales cg = new clsGenerales();

    public static void main(String[] args) {
        
        proceso();

    }

    private static void proceso(){

        int punto = met.elegirPunto();

        switch (punto) {

            case 1:

                int n = cg.leerEntero("Ingrese la cantidad de productos:");
                ObjProducto[][] matriz = new ObjProducto[n][n];
        
                matriz = met.LlenarMatrizP(n);
        
                met.MostrarMatrizP(matriz);
        
                String NombreBuscar = cg.leerCadena2("Ingrese el nombre del producto a buscar: ");
        
                met.BuscarEnMatriz(matriz, NombreBuscar);
                
                break;
            
            case 2:

                int n2 = cg.leerEntero("Ingrese la cantidad de productos:");
                ObjProducto[][] matriz2 = new ObjProducto[n2][n2];
        
                matriz = met.LlenarMatrizP(n2);
        
                met.MostrarMatrizP(matriz2);

                met.SumarCantidad(matriz2);

                break;

            case 3:

                int n3 = cg.leerEntero("Ingrese la cantidad de libros:");
                ObjLibro[][] matriz3 = new ObjLibro[n3][n3];
        
                matriz3 = met.LlenarMatrizL(n3);
        
                met.MostrarMatrizL(matriz3);

                break;

            case 4:

                int n4 = cg.leerEntero("Ingrese la cantidad de filas del teatro: ");
                ObjTeatro[][] matriz4 = new ObjTeatro[n4][n4];

                met.LlenarMatrizT(n4);

                met.MostrarMatrizT(matriz4);

                break;
            
            case -1:

                cg.Mensaje("Fin del programa");

                break;

        }
        
    }
    
}
