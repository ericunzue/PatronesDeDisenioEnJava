
package Punto1;


public class IngredienteSimple extends Ingrediente{
  
  public IngredienteSimple(String nombre, double precio){
    super(nombre, precio);
  }

  @Override
  public double getPrecio(){
    return this.precio;
  }
  
  public void setPrecio(double p){
    precio=p;
  }

  
}
