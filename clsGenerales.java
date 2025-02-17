import javax.swing.JOptionPane;

public class clsGenerales {
   
    public clsGenerales() {

    }

    public void Mensaje(String Texto) {

        JOptionPane.showMessageDialog(null, Texto);

    }

    public int leerEntero(String Texto) {

        try {

            return Integer.parseInt(JOptionPane.showInputDialog(null, Texto));

        }
        
        catch (Exception e) {

            Mensaje(Texto + "Error, tipo de dato no válido");
            return leerEntero(Texto);

        }

    }

    public int leerEnteroPos(String Texto) {

        try {

            int numero = Integer.parseInt(JOptionPane.showInputDialog(null, Texto));

            if (numero < 0) {

                Mensaje("Por favor, ingrese un número entero mayor o igual a cero");
                return leerEnteroPos(Texto);

            }

            return numero;

        }

        catch (Exception e) {

            Mensaje("Error, tipo de dato no válido. Por favor, ingrese un número entero mayor o igual a cero");
            return leerEnteroPos(Texto);

        }

    }

    public int leerEnteroPosMy0(String Texto) {

        try {

            int numero = Integer.parseInt(JOptionPane.showInputDialog(null, Texto));

            if (numero <= 0) {

                Mensaje("Por favor, ingrese un número entero mayor a cero");
                return leerEnteroPosMy0(Texto);

            }

            return numero;

        } 
        
        catch (Exception e) {

            Mensaje("Error, tipo de dato no válido. Por favor, ingrese un número entero mayor a cero");
            return leerEnteroPosMy0(Texto);

        }

    }

    public int leerEnteroNeg(String Texto) {

        try {

            int numero = Integer.parseInt(JOptionPane.showInputDialog(null, Texto));

            if (numero >= 0) {

                Mensaje("Por favor, ingrese un número negativo.");
                return leerEnteroNeg(Texto);

            }

            return numero;

        }
        
        catch (Exception e) {

            Mensaje("Error, tipo de dato no válido. Por favor, ingrese un número entero negativo.");
            return leerEnteroNeg(Texto);

        }

    }

    public Float leerReal_f(String Texto) {

        try {

            return Float.parseFloat(JOptionPane.showInputDialog(null, Texto));

        } 
        
        catch (Exception e) {

            Mensaje(Texto + "Error, tipo de dato no válido");

            return leerReal_f(Texto);

        }

    }

    public float leerRealPos_f(String Texto) {

        try {

            float numero = Float.parseFloat(JOptionPane.showInputDialog(null, Texto));

            if (numero < 0) {

                Mensaje("Por favor, ingrese un número real mayor o igual a cero");
                return leerRealPos_f(Texto);

            }

            return numero;
        
        }
        
        catch (Exception e) {

            Mensaje("Error, tipo de dato no válido. Por favor, ingrese un número real mayor o igual a cero");
            return leerRealPos_f(Texto);

        }

    }

    public Float leerRealPosMy0_f(String Texto) {

        try {

            float numero = Float.parseFloat(JOptionPane.showInputDialog(null, Texto));

            if (numero <= 0) {

                Mensaje("Por favor, ingrese un número real mayor a cero");
                return leerRealPosMy0_f(Texto);

            }

            return numero;

        }
        
        catch (Exception e) {

            Mensaje("Error, tipo de dato no válido. Por favor, ingrese un número real mayor a cero");
            return leerRealPosMy0_f(Texto);

        }

    }

    public float leerRealNeg_f(String Texto) {

        try {

            float numero = Float.parseFloat(JOptionPane.showInputDialog(null, Texto));

            if (numero >= 0) {

                Mensaje("Por favor, ingrese un número real negativo.");
                return leerRealNeg_f(Texto);

            }

            return numero;

        } 
        
        catch (Exception e) {

            Mensaje("Error, tipo de dato no válido. Por favor, ingrese un número negativo.");
            return leerRealNeg_f(Texto);

        }

    }

    public double leerReal_d(String Texto) {

        try {

            return Double.parseDouble(JOptionPane.showInputDialog(null, Texto));

        } 

        catch (Exception e) {

            Mensaje(Texto + "Error, tipo de dato no válido");
            return leerReal_d(Texto); 

        }

    }

    public double leerRealPos_d(String Texto) {

        try {

            double numero = Double.parseDouble(JOptionPane.showInputDialog(null, Texto));

            if (numero < 0) {

                Mensaje("Por favor, ingrese un número real mayor o igual a cero");
                return leerRealPos_d(Texto);

            }
            return numero;

        } 
        
        catch (Exception e) {

            Mensaje("Error, tipo de dato no válido. Por favor, ingrese un número real mayor o igual a cero");
            return leerRealPos_d(Texto);

        }

    }

    public double leerRealPosMy0_d(String Texto) {

        try {

            double numero = Double.parseDouble(JOptionPane.showInputDialog(null, Texto));

            if (numero <= 0) {

                Mensaje("Por favor, ingrese un número real mayor a cero");
                return leerRealPosMy0_d(Texto);

            }

            return numero;

        }
        
        catch (Exception e) {

            Mensaje("Error, tipo de dato no válido. Por favor, ingrese un número real mayor a cero");
            return leerRealPosMy0_d(Texto);

        }

    }

    public double leerRealNeg_d(String Texto) {
        
        try {

            double numero = Double.parseDouble(JOptionPane.showInputDialog(null, Texto));

            if (numero > 0) {

                Mensaje("Por favor, ingrese un número real menor a cero");
                return leerRealNeg_d(Texto);

            }

            return numero;

        } 
        
        catch (Exception e) {

            Mensaje("Error, tipo de dato no válido. Por favor, ingrese un número real menor a cero");
            return leerRealNeg_d(Texto);

        }

    }

    public String leerCadena(String Texto) {
        
        return JOptionPane.showInputDialog(null, Texto).trim();
    
    }

    public String leerCadena2(String Texto) {

        String cadena = JOptionPane.showInputDialog(null, Texto).trim( );

        if (cadena.isEmpty( )) {

            Mensaje("Por favor, ingrese una cadena no vacía");
            return leerCadena(Texto);

        }

        return cadena;

    }

    public int leerNota_05(String Texto) {
        try {
            int numero = Integer.parseInt(JOptionPane.showInputDialog(null, Texto));
    
            if (numero < 0 || numero > 5) { // Verifica que esté entre 0 y 5
                Mensaje("Por favor, ingrese un número entero entre 0 y 5 inclusive");
                return leerNota_05(Texto); // Llama recursivamente si el número no es válido
            }
    
            return numero;
    
        } catch (Exception e) { // Captura cualquier error al ingresar el dato
            Mensaje("Error, tipo de dato no válido. Por favor, ingrese un número entero entre 0 y 5 inclusive");
            return leerNota_05(Texto); // Llama recursivamente si ocurre una excepción
        }
    }
    
}
