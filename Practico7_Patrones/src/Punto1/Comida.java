package Punto1;

import java.util.ArrayList;
import java.util.List;

public abstract class Comida{

  private String nombre;
  private double precio;
  private Receta receta;

  public Comida(String nombre, Receta receta){
    this.nombre = nombre;
    this.receta = receta;
  }

  public String getNombre(){
    return nombre;
  }

  public void setNombre(String nombre){
    this.nombre = nombre;
  }

  public double getPrecio(){
    return receta.getPrecio();
  }

  public Receta getReceta(){
    return receta;
  }
  
  public String getCoccion(){
    return receta.getTipoCoccion();
  }
  
  public String getTipoReceta(){
    return receta.getTipoCoccion();
  }
}
