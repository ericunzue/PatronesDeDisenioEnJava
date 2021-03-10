package Punto1;

import java.util.ArrayList;
import java.util.List;

public class Receta extends Ingrediente{

  private double tiempoCoccion;
  private String tipoCoccion;
  private String pasos;
  private String tipoReceta;
  private int complejidad;
  protected List<Ingrediente> ingredientes;

  public Receta(String nombre, double precio, double tiempoCoccion, String pasos, String tipoReceta, int complejidad){
    super(nombre, precio);
    this.tiempoCoccion = tiempoCoccion;
    this.pasos = pasos;
    this.tipoReceta = tipoReceta;
    this.complejidad = complejidad;
    ingredientes = new ArrayList<>();
  }

  @Override
  public double getPrecio(){
    double total = 0;
    for (Ingrediente ingrediente : ingredientes) {
      total += ingrediente.getPrecio();
    }
    return total;
  }

  public void agregarIngrediente(Ingrediente ingrediente){
    if (!ingredientes.contains(ingrediente)) {
      ingredientes.add(ingrediente);
    }
  }

  public double getTiempoCoccion(){
    return tiempoCoccion;
  }

  public void setTiempoCoccion(double tiempoCoccion){
    this.tiempoCoccion = tiempoCoccion;
  }

  public String getPasos(){
    return pasos;
  }

  public void setPasos(String pasos){
    this.pasos = pasos;
  }

  public String getTipoReceta(){
    return tipoReceta;
  }

  public void setTipoReceta(String tipoReceta){
    this.tipoReceta = tipoReceta;
  }

  public int getComplejidad(){
    return complejidad;
  }

  public void setComplejidad(int complejidad){
    this.complejidad = complejidad;
  }

  public String getTipoCoccion(){
    return tipoCoccion;
  }

  public void setTipoCoccion(String tipoCoccion){
    this.tipoCoccion = tipoCoccion;
  }


  
}
