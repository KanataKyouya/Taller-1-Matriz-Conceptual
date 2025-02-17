public class Metodos {
    
    clsGenerales cg = new clsGenerales();
    ObjProducto ObjP = new ObjProducto();
    ObjLibro ObjL = new ObjLibro();
    ObjTeatro ObjT = new ObjTeatro();

    public int elegirPunto(){

        int punto = cg.leerEntero("Ingrese el punto que quiere desarollar (1-10): ");

        if ((punto > 1) && (punto < 11) || (punto == -1)){

            return punto;

        }

        else {

            cg.Mensaje("Punto no valido (1-10), intente de nuevo");

            return elegirPunto();

        }

    }

    public ObjProducto[][] LlenarMatrizP(int n){

        ObjProducto[][] matriz = new ObjProducto[n][n];

        for (int i = 0; i < matriz.length; i++){

            for (int j = 0; j < matriz.length; j++){

                ObjProducto obj = new ObjProducto();

                obj.setNombre(cg.leerCadena2("Ingrese el nombre:"));
                obj.setPrecio(cg.leerEnteroPos("Ingrese el precio:"));
                obj.setCantidad(cg.leerEnteroPos("Ingrese la cantidad:"));

                matriz[i][j] = obj;
            }

        }

        return matriz;

    }

    public void MostrarMatrizP(ObjProducto[][] matriz){

        String txt = "Personas\n";

        for (int i = 0; i < matriz.length; i++){

            for (int j = 0; j < matriz.length; j++){

                txt += "Persona [" + i + "][" + j + "]:\nNombre: " + matriz[i][j].getNombre() + "\nPrecio: " + matriz[i][j].getPrecio() + "\nCantidad: " + matriz[i][j].getCantidad() + "\n";

            }

        }

        cg.Mensaje(txt);

    }

    public void BuscarEnMatriz(ObjProducto[][] matriz, String NombreBuscar){

        int FilaEncontrada = -1, ColumnaEncontrada = -1;

        for(int i = 0; i < matriz.length; i++){

            for (int j = 0; j < matriz.length; j++){
       
                String nombre;
                
                nombre = matriz[i][j].getNombre();

                if(nombre.equals(NombreBuscar)){

                    FilaEncontrada = i;

                    ColumnaEncontrada = j;

                }

            }

        }

        if((FilaEncontrada != -1) && (ColumnaEncontrada != -1)){

            cg.Mensaje("El objeto " + NombreBuscar + " se encuentra en la fila " + FilaEncontrada + " y la columna " + ColumnaEncontrada);

        }

        else {

            cg.Mensaje("Producto no encontrado");

        }

    }

    public void SumarCantidad(ObjProducto[][] matriz2){

        int suma = 0;

        for(int i = 0; i < matriz2.length; i++){

            for (int j = 0; j < matriz2.length; j++){
       
                suma += matriz2[i][j].getCantidad();

            }

        }

        cg.Mensaje("El inventario tiene una cantidad total de " + suma);

    }

    public ObjLibro[][] LlenarMatrizL(int n){

        ObjLibro[][] matriz = new ObjLibro[n][n];

        for (int i = 0; i < matriz.length; i++){

            for (int j = 0; j < matriz.length; j++){

                ObjLibro obj = new ObjLibro();

                obj.setTitulo(cg.leerCadena2("Ingrese el titulo:"));
                obj.setAutor(cg.leerCadena2("Ingrese el autor:"));
                obj.setPrecio(cg.leerEnteroPos("Ingrese el precio:"));

                matriz[i][j] = obj;
            }

        }

        return matriz;

    }

    public void MostrarMatrizL(ObjLibro[][] matriz){

        String txt = "Personas\n";

        for (int i = 0; i < matriz.length; i++){

            for (int j = 0; j < matriz.length; j++){

                txt += "Persona [" + i + "][" + j + "]:\nTitulo: " + matriz[i][j].getTitulo() + "\nAutor: " + matriz[i][j].getAutor() + "\nPrecio: " + matriz[i][j].getPrecio() + "\n";

            }

        }

        cg.Mensaje(txt);

    }

    public void LibroMayor(ObjLibro[][] matriz, int n){

        int Mayor = -999, FilaEncontrada = -1, ColumnaEncontrada = -1;

        for (int i = 0; i < matriz.length; i++){

            for (int j = 0; j < matriz.length; j++){

                if (matriz[i][j].getPrecio() > Mayor){
                    
                    Mayor = matriz[i][j].getPrecio();

                    FilaEncontrada = i;

                    ColumnaEncontrada = j;

                }

            }

        }

        cg.Mensaje("El libro más caro es " + matriz[FilaEncontrada][ColumnaEncontrada].getTitulo() + "con un precio de " + matriz[FilaEncontrada][ColumnaEncontrada].getPrecio());

    }

    public ObjTeatro[][] LlenarMatrizT(int n){

        int contador = 1;
        ObjTeatro[][] matriz = new ObjTeatro[n][n];

        for (int i = 0; i < matriz.length; i++){

            for (int j = 0; j < matriz.length; j++){

                ObjTeatro obj = new ObjTeatro();

                obj.setNumero(contador);
                obj.setFila(i);
                obj.setPrecio(cg.leerEnteroPos("Ingrese el precio del asiento " + i + "-" + j + ": "));

                matriz[i][j] = obj;

                contador++;
            }

        }

        return matriz;

    }

    public void MostrarMatrizT(ObjTeatro[][] matriz){

        String txt = "Asientos del teatro\n";

        for (int i = 0; i < matriz.length; i++){

            for (int j = 0; j < matriz.length; j++){

                txt += "Numero: " + matriz[i][j].getNumero() + "\nFila: " + matriz[i][j].getFila() + "\nPrecio: " + matriz[i][j].getPrecio() + "\n";

            }

        }

        cg.Mensaje(txt);

    }

}
