/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto1.Politicas;

import Punto1.Comida;

/**
 *
 * @author e_unz
 */
public class PoliticaTipoPlato implements PoliticaAceptacion{
String alimento = "ensalada";
  @Override
  public boolean acepta(Comida c){
    if (alimento.equals(c.getTipoReceta())) {
      return true;
    } else {
    return false;
    }
  }
  
}
