
package paq3;


public class Rosmelia extends Floristeria {
    
     protected String Tamaño;
   
    
    public Rosmelia(String Tipo, String Recipiente, int precio, String color, String Composicion, String Tamaño) {
        super(Tipo, Recipiente, precio, color, Composicion);
        
        this.Tamaño=Tamaño;
    }
    
    public void conBou() {
        
        System.out.println("Tipo = "+getTipo()+"\nRecipiente = "+getRecipiente()+
                "\nPrecio "+getPrecio()+"\n Color = "+getcolor()+"\n Composicion ="+getComposicion()+
                "\n Tamaño ="+Tamaño);
}
}
