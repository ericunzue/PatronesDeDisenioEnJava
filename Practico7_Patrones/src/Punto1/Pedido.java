package Punto1;

import java.util.ArrayList;
import java.util.List;

public class Pedido{

  private List<Comida> comidas;
  private String cliente;
  private String direccion;
  private double precio;

  public Pedido(){
  }

  public Pedido(String cliente, String direccion){

    this.cliente = cliente;
    this.direccion = direccion;
  }

  public List<Comida> getComidas(){
    return new ArrayList<>(comidas);
  }

  public void addComida(Comida comidaNueva){

    comidas.add(comidaNueva);

  }

  public double getPrecio(){
    int total = 0;
    for (Comida comida : comidas) {
      total += comida.getPrecio();
    }
    return total;
  }

  public String getCliente(){
    return cliente;
  }

  public void setCliente(String cliente){
    this.cliente = cliente;
  }

  public String getDireccion(){
    return this.direccion;
  }

  public void setDireccion(String direccion){
    this.direccion = direccion;
  }
  
 

}
