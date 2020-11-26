
package paq3;


public class Bouquet extends Floristeria  {
    protected String forma;
    protected String estilo;
    
    
    public Bouquet(String Tipo, String Recipiente, int precio,String color, String Composicion , String forma,String estilo) {
        super(Tipo, Recipiente, precio,color,Composicion);
        this.forma=forma;
        this.estilo=estilo;
    }

   
    
    public void conBou() {
        
        System.out.println("Tipo = "+getTipo()+"\nRecipiente = "+getRecipiente()+
                "\nPrecio "+getPrecio()+"\n Color = "+getcolor()+"\n Composicion ="+getComposicion()+
                "\n forma ="+forma+"\n Estilo = "+estilo);
}
}
