package Punto1;

import java.util.ArrayList;
import java.util.List;

public abstract class Ingrediente{

  protected String nombre;
  protected double precio;

  public Ingrediente(String nombre, double precio){
    this.nombre = nombre;
    this.precio = precio;
  }

  public abstract double getPrecio();

  public String getNombre(){
    return nombre;
  }

  public void setNombre(String nombre){
    this.nombre = nombre;
  }
}
