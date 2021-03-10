/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto1.Politicas;

import Punto1.Comida;
import Punto1.Pedido;

/**
 *
 * @author e_unz
 */
public class PoliticaCoccion implements PoliticaAceptacion{
   String coccion = "horno";

  @Override
  public boolean acepta(Comida c){
    if (coccion.equals(c.getCoccion())) {
      return true;
    }
    return false;
  }
   
   
}
