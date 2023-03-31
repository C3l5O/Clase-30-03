
package Modelo;
        
public class Datos {
    int Clave;
    String Valor;

    public Datos(int Clave, String Valor) {
        this.Clave = Clave;
        this.Valor = Valor;
    }

    public int getClave() {
        return Clave;
    }

    public void setClave(int Clave) {
        this.Clave = Clave;
    }

    public String getValor() {
        return Valor;
    }

    public void setValor(String Valor) {
        this.Valor = Valor;
    }
    
}
