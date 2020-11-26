
package paq3;


public class Floristeria {
     protected String Tipo ;
    protected String Recipiente; 
    protected int Precio ;
    protected String Color;
    protected String Composicion;
   
    public Floristeria(String Tipo, String Recipiente, int precio,String color, String Composicion){
     
        this.Tipo=Tipo;
        this.Recipiente=Recipiente;
        this.Precio= Precio; 
        this.Color=color;
        this.Composicion=Composicion;
    }
    
    public String getTipo() {
        return Tipo;
    }
    public String getRecipiente() {
        return Recipiente;
    }
    public int getPrecio() {
        return Precio;
    }
    public int getcolor() {
        return Precio;
    }
    public int getComposicion() {
        return Precio;
    }
}
