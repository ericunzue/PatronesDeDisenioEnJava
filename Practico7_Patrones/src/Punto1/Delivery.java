/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author e_unz
 */
public abstract class Delivery{
  
  String especialidad;
  int stock;
  protected List<Pedido> pedidos;

  public Delivery(String especialidad, int stock){
    this.especialidad = especialidad;
    this.stock = stock;
    pedidos = new ArrayList<>();
  }

  public String getEspecialidad(){
    return especialidad;
  }

  public void setEspecialidad(String especialidad){
    this.especialidad = especialidad;
  }

  public int getStock(){
    return stock;
  }

  public void setStock(int stock){
    this.stock = stock;
  }
  
  
  
}
