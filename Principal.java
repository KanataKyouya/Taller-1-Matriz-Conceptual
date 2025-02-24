public class Principal {
    
    static Metodos met = new Metodos();
    static ObjProducto ObjP = new ObjProducto();
    static ObjLibro ObjL = new ObjLibro();
    static ObjTeatro ObjT = new ObjTeatro();
    static clsGenerales cg = new clsGenerales();
    static ObjEstanteria cs = new ObjEstanteria();

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
            
            case 5: 

                int fm = cg.leerEntero("Ingrese la cantidad de filas de la estanteria 1"), cm = cg.leerEntero("Ingrese la cantidad de columnas de la estanteria 1");
                int fn = cg.leerEntero("Ingrese la cantidad de filas de la estanteria 2"), cn = cg.leerEntero("Ingrese la cantidad de columnas de la estanteria 2");
                ObjEstanteria[][] Mm = new ObjEstanteria[fm][cm], Mn = new ObjEstanteria[fn][cn];

                Mm = met.LlenarMatrizE(fm, cm);
                Mn = met.LlenarMatrizE(fn, cn);

                met.SumarStock(Mm, Mn);

                if (Mm.length > Mn.length){

                    Mm = met.SumarStock(Mm, Mn);
                    met.MostrarMatrizE(Mm);

                }

                else if (Mn.length > Mm.length){

                    Mn = met.SumarStock(Mm, Mn);
                    met.MostrarMatrizE(Mn);

                }

                else {

                    Mm = met.SumarStock(Mm, Mn);
                    met.MostrarMatrizE(Mm);

                }

                break;

            case -1:

                cg.Mensaje("Fin del programa");

                break;

        }
        
    }
    
}
